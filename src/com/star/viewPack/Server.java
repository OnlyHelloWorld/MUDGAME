package com.star.viewPack;
import java.io.*;
import java.net.*;
import java.util.Iterator;
import java.util.Set;

import com.star.controller.*;
import com.star.controller.MessageManagement;
import com.star.controller.RoomManagement;
import com.star.controller.UserInput;
import com.star.model.Player;

public class Server {
	
	public static int PORT_NUM = 9000;
	
	
	static class ServerThread extends Thread {
		Socket socket;
		
		
		public ServerThread(Socket socket) {
			
			this.socket = socket;
		}
		@Override
		public void run() {
			
			try {
				
				RoomManagement.cityMap.get("room_guangchang");
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));//读取控制命令
				PrintStream out = new PrintStream(socket.getOutputStream());
				String Message;
				Player player = new Player();
				String id;
				String pname;
				String location;

			    out.println("欢迎来到小型绿洲:\n");
				out.println("请输入你在游戏中需要使用的ID:\n");
				out.flush();
				
				Message = in.readLine();
				id = Message;
				while(MysqlManagement.search(id)) {//判断此id数据库中是否存在,若存在建议玩家更换
					out.println("数据库中已经存在此id\n");
					out.println("重新输入一个吧...:");
					id = in.readLine();
				}
				player.setId(id);
				
				out.println("请输入你在游戏中的用户名:\n");
				out.flush();
				Message = in.readLine();
				player.setName(Message);
				pname = Message;
				player.setLocation("yangzhou_guangchang");
				location = "yangzhou_guangchang";
				
				
				
					MysqlManagement.insertData(id, pname, location);//将玩家信息插入数据库
				
				
				
				
				MessageManagement.addPlayerChannels(player.getId(), out);
				MessageManagement.addPlayerInChannels(player.getId(), in);//把玩家输入也集成,实现聊天功能美滋滋
				
				RoomManagement.cityMap.get(player.getLocation()).addPlayer(player);
				
				boolean isQuit = false;
//				boolean isSingle = false; //私聊标志
				
				while(!isQuit) {
					if(isQuit) {
						break;
					}
					Message = in.readLine();
					System.out.println(player.getName());
					if("quit".equals(Message.trim()) || "single".equals(Message.trim())) {
						if("quit".equals(Message.trim())) {
							isQuit = true;
							UserInput.dealInput(player, Message);
							out.println("服务器已断开链接,你可以点右上角的x滚了");
							out.flush();
							out.close();
							in.close();
							socket.close();
						}
						if("single".equals(Message.trim())) {
							String receiveId;
							MessageManagement.showToPlayer(player, "请输入你想私聊人的ID,目前在线的人的id为:\n");
							Set<String> keySet = MessageManagement.playerChannels.keySet();//获取所有在线玩家的id,放在一个set里面
							Iterator<String> iterator = keySet.iterator(); //获取keySet的迭代器
							while (iterator.hasNext()) {
								String playId = iterator.next();
								MessageManagement.showToPlayer(player, playId);
							}
							String inputId = in.readLine();
							boolean hasId = false;
							for (String string : keySet) {
//								MessageManagement.showToPlayer(player, string);
								if (inputId.equals(string.trim())) {
									hasId = true;
								}
							}
							if (hasId==true) {
								receiveId = inputId;
								MessageManagement.showToPlayer(player, "玩家在线,请输入你想发送的消息:\n");
								Message = in.readLine();
								MessageManagement.singleChar(player.getId(), receiveId, Message);
							}else {
								MessageManagement.showToPlayer(player, "这个玩家不在线或者不存在");
							}
						}
					}else {
						UserInput.dealInput(player, Message);
					}
				}				
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}
	}
	static public void main(String[] args) throws Exception {
		RoomManagement.creatRooms();
		
		ServerSocket serverSocket = new ServerSocket(PORT_NUM);
		MysqlManagement.link();
		
		
		while(true) {
			Socket socket = serverSocket.accept();
			new ServerThread(socket).start();

		}
	}
}
