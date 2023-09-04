package com.kh.example;

public class Car {
	// 1. 상태 필드 맴버변수
	String brand;		//브랜드
	String model;		// 모델
	int speed;			// 속
	boolean engineOn;	// 엔진 상태

	
	// 2. 생성자는 메서드의 한자기 종류
	// 차를 볼 때 필수로 넣을 파라미터는 브랜드, 모델)
	public Car(String model, String brand) {
		this.model = model;
		this.brand = brand;
		this.speed = 50;
		this.engineOn = true;
	}
	
	// 엔진 시작 메서드
	public void startEngine() {
		
		System.out.println("차 종은 " + brand + "입니다");
		// 만약에 엔진이 true 엔진 시동
		if (engineOn) {
			
			System.out.println("엔진을 시동합니다.");
		} else {
			// 엔진이 false 이미 엔진이 켜져있다.
			System.out.println("이미 엔진이 켜져 있습니다.");
		}
	}
	
	// 가속 메서드
	public void acclerate(int amount) {
		
		speed += amount;
		// 엔진이 true면 지금 속도가 얼마다.
		if (engineOn) {
			System.out.println("속도" + speed +" 얼마입니다");
		// 엔진이 false면 엔진이 꺼져 있어 속도를 낼 수 없다.	
		} else {
			System.out.println("속도를 알 수 없음");
		}
	}
}
