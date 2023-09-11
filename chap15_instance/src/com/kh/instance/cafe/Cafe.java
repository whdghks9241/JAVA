package com.kh.instance.cafe;

public class Cafe {

	// 음료 종류
	private String type;
	
	// 욤료 사이즈
	private int size;
	
	// 설탕여부
	private boolean isSugar;
	
	public Cafe(String type, int size, boolean isSugar) {
		this.type = type;
		this.size = size;
		this.isSugar= isSugar;
	}
	
	public void makeing() {
		System.out.println(type + "를 만듭니다.");
		System.out.println("크기 : " + size);
		
		if (isSugar) {
			System.out.println("설탕을 추가합니다.");
		} else {
			System.out.println("설탕을 추가하지 않습니다.");
		}
	}
}
