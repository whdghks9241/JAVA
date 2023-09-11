package com.kh.instance.americano;

// 기본 아메리카노
public class Americano {

	// 아메리가노 사이즈
	private int size;
	
	// 설탕 여부
	private boolean hasSugar;
	
	public Americano(int size, boolean hasSugar) {
		this.size = size;
		this.hasSugar = hasSugar;
	}
	
	public void makeCoffee() {
		System.out.println("아메리카노를 만듭니다.");
		System.out.println("크기 : " + size);
		
		// 만약 설탕을 넣는다면
		if (hasSugar) {
			System.out.println("설탕을 추가합니다.");
		} else {
			System.out.println("설탕을 추가하지 않습니다.");
		}
	}

	
}
