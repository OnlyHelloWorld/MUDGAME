package com.star.model;

import com.star.controller.MessageManagement;
import com.star.controller.MysqlManagement;
import com.star.controller.RoomManagement;

public class Player {
	private String id;
	private String username;
	private String location;
	
	public Player(String id, String username,String location) {
		this.id = id;
		this.username = username;
		this.location = location;
	}
	public Player() {
		// creat player default value
		id = "0000";
		username = null;
		location = null;
	}
	
	public void move(CommonContent.DIRECTION direction) {
		
		Room room = RoomManagement.cityMap.get(this.getLocation());
		
		Room room2 = room.getRoom(direction);
		
		if(room2 == RoomManagement.cityMap.get("nullRoom")) {
			String string = "伙计,请看清楚方向提示,你应该不是瞎子.\n";
//			MessageManagement.showToPlayer(this, room.getRoomId());
//			MessageManagement.showToPlayer(this, room2.getRoomId());
			MessageManagement.showToPlayer(this, string);
		}else {
		room.exist(this, direction);
		this.setLocation(room2.getRoomId());
		room2.enter(this, direction);
		String string = room2.getRoomLooking();
		MessageManagement.showToPlayer(this, string);
		
		}
		
	}
	public void look(){
		Room room = RoomManagement.cityMap.get(this.getLocation());
		String roomLooking = room.getRoomLooking();
		MessageManagement.showToPlayer(this, roomLooking);
	}
	
	public void quit(){
		//告诉房间退出了，释放资源
		RoomManagement.cityMap.get(this.getLocation()).removePlayer(this);
		MessageManagement.removePlayerChannels(this.getId());
		String nowLocation = this.getLocation();
		
		//save添加在这里
		MysqlManagement.upData(this.getId(), nowLocation);//通过id在数据库找到该用户并更新该玩家位置,方便下次登录
	}
	public void setLocation(String location){
		this.location = location;
	}
	public String getLocation(){
		return this.location;
	}
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getName(){
		return this.username;
	}
	public void setName(String username){
		this.username = username;
	}
}
