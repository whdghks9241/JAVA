package com.kh.instance.tv;

public class Tv {

	// Tv 제작
	// Tv 속성(필드)
	
	// 색상
	String color;
	// 전원상태
	boolean power; 
	// 채널
	int channel;
	
	
	// Tv 기능(메서드)
	public void power() {
		// 전원상태
		power = !power;
	}

	public void channelUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}
}
