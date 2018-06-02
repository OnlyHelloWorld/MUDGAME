package com.star.model;

public class CommonContent {
	String CANNOTMOVE = "这个方向没有出路。";
	public enum DIRECTION {
		EAST, WEST, SOUTH, NORTH, NORTHEAST, NORTHWEST, SOUTHEAST, SOUTHWEST,UP, DOWN 
	};
	static int CHARS_PER_LINE = 40;
}
