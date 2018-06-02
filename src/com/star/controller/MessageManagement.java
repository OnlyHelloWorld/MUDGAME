package com.star.controller;
import java.io.*;
import java.util.*;

import com.star.model.Player;
public class MessageManagement {
	
	public static HashMap<String,PrintStream> playerChannels = new HashMap<String,PrintStream>();
	public static HashMap<String,BufferedReader> playerInChannels = new HashMap<>();//菱形语法多装逼
	
	public static void showToPlayer(Player player, String message){
		PrintStream bWriter = playerChannels.get(player.getId());
		bWriter.println(message);
		bWriter.flush();
	}
	public static void addPlayerChannels(String playerId,PrintStream bw){
		playerChannels.put(playerId, bw);
	}
	public static void addPlayerInChannels(String playerId,BufferedReader in){
		playerInChannels.put(playerId, in);
	}
	public static void removePlayerChannels(String playerId){
		playerChannels.remove(playerId);
	}
	//私聊
	synchronized public static void singleChar(String sendId,String receiveId,String message) {
		PrintStream receiveOut = playerChannels.get(receiveId);
		receiveOut.println("@"+sendId+"给你发来了一条信息:\n"+message);
		receiveOut.flush();
	}
	//群聊
	public static void groupChat(Player player) throws Exception {
		String receiveIds;
		
		BufferedReader inSend = playerInChannels.get(player.getId());
		PrintStream outSent = playerChannels.get(player.getId());
		outSent.println("请输入你想要群发人的ID(空格分开):");
		outSent.flush();
		outSent.println("目前所有在线玩家的ID分别为:");
		outSent.flush();
		Set<String> keySet = MessageManagement.playerChannels.keySet();//获取所有在线玩家的id,放在一个set里面
		Iterator<String> iterator = keySet.iterator(); //获取keySet的迭代器
		while (iterator.hasNext()) {
			String playId = iterator.next();
			MessageManagement.showToPlayer(player, playId);
		}
		
		receiveIds = inSend.readLine();
		String[] ids = receiveIds.split(" ");
		outSent.println("请输入你想要发送的消息:");
		outSent.flush();
		String message = inSend.readLine();
		for (String string : ids) {
			PrintStream pStream = playerChannels.get(string);
			
			pStream.println("@"+player.getId()+"发来了信息(群发,其他部分人可能也收到了):\n"+message);
			pStream.flush();
		}
		
	}
	//公告
	public static void allChat(Player player) throws IOException {
		BufferedReader inSend = playerInChannels.get(player.getId());
		PrintStream outSent = playerChannels.get(player.getId());
		outSent.println("请输入你想发布公告的内容:");
		String message = inSend.readLine();
		Collection<PrintStream> outs = MessageManagement.playerChannels.values();
		for (PrintStream printStream : outs) {
			printStream.println("@"+player.getId()+"给所有人发了一条消息:\n"+message);
			printStream.flush();
		}
	}
}
