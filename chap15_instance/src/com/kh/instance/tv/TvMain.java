package com.kh.instance.tv;

public class TvMain {

	public static void main(String[] args) {
		// Tv 인스턴스를 참조하기 위해서 변수 Tv 선언
		Tv tv;
		// Tv인스턴스 생성 객체의 주소를 참조변수에 저장한다.
		tv = new Tv();
		
		tv.channel = 7; 
		tv.channelDown();
		tv.power();
		
		System.out.println("Channel : " + tv.channel);
	}

}
