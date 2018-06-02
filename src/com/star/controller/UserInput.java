package com.star.controller;

import java.io.IOException;

import com.star.model.CommonContent;
import com.star.model.Player;

public class UserInput {
	public static void dealInput(Player player, String inputMessage) throws Exception {
		/*
		 * 可以处理的命令 l,look e,east,w,west,n,north,s,south,
		 */
		String[] strings = {"all","group","quit","l","look", "e","east","w","west","n","north","s","south","ne","northeast","nw","northwest","se","southeast","sw","southwest","u","up","d","down"};
		Boolean hasIn = false;
		for (String string : strings) {
			if(string.equals(inputMessage.trim()))
			hasIn = true;
		}
		if(hasIn){
			if (inputMessage.equals("l") || inputMessage.equals("look")) {
					player.look();
					return;
			}
			if (inputMessage.equals("quit")) {
				player.quit();
				return;
			}
			if (inputMessage.equals("e") || inputMessage.equals("east")) {
				player.move(CommonContent.DIRECTION.EAST);
				return;
			}
			if (inputMessage.equals("w") || inputMessage.equals("west")) {
				player.move(CommonContent.DIRECTION.WEST);
				return;
			}
			if (inputMessage.equals("s") || inputMessage.equals("south")) {
				player.move(CommonContent.DIRECTION.SOUTH);
				return;
			}
			if (inputMessage.equals("n") || inputMessage.equals("north")) {
				player.move(CommonContent.DIRECTION.NORTH);
				return;
			}
			if (inputMessage.equals("ne") || inputMessage.equals("northeast")) {
				player.move(CommonContent.DIRECTION.NORTHEAST);
				return;
			}
			if (inputMessage.equals("nw") || inputMessage.equals("northwest")) {
				player.move(CommonContent.DIRECTION.NORTHWEST);
				return;
			}
			if (inputMessage.equals("se") || inputMessage.equals("southeast")) {
				player.move(CommonContent.DIRECTION.SOUTHEAST);
				return;
			}
			if (inputMessage.equals("sw") || inputMessage.equals("southwest")) {
				player.move(CommonContent.DIRECTION.SOUTHWEST);
				return;
			}
			if (inputMessage.equals("u") || inputMessage.equals("up")) {
				player.move(CommonContent.DIRECTION.UP);
				return;
			}
			if (inputMessage.equals("d") || inputMessage.equals("down")) {
				player.move(CommonContent.DIRECTION.DOWN);
				return;
			}
			if ( inputMessage.equals("all")) {
				MessageManagement.allChat(player);
				return;
			}
			if(inputMessage.equals("group")) {
				MessageManagement.groupChat(player);
			}
		}else {
			MessageManagement.showToPlayer(player, "发的什么玩意,没有这个指令");
		}
		
		
		//MessageManagement.showToPlayer(player, "什么？\n");
	}
}
