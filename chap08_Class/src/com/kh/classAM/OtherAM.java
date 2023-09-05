package com.kh.classAM;

public class OtherAM {
	public static void main(String[] args) {
		
		AM am = new AM();
		
		am.publicMethod();
		am.protectedMethod();
		am.defaultMethed();
		// am.privateMethod(); // 다른 클래스에 존재하기 때문에 출력이 안됨
	}
}
