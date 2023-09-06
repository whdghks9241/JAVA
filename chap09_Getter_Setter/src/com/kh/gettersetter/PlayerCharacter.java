package com.kh.gettersetter;

public class PlayerCharacter {

	// 캐릭터 이름
	private String name;
	// 체력
	private int health;
	// 공격력
	private int attackpower;
	
	/**
	 *	Getter 
	 * 		데이터 복사본을 던져주기 때문에 원래 객체의 데이터는 손상시키지 않음
	 * 		원본데이터는 안전함
	 */
	public String getName() {
		return name;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getAttackpower() {
		return attackpower;
	}
	
	/**
	 * Setter
	 *		외부에서 메소드를 통해 데이터에 접근을 하게 된다면
	 *		메소드는 매개값을 검증해서 유요한 값만 데이터로 저장할수 있다. 
	 */
	
	public void setName(String name) {
		this.name = name;
	}

	public void setHealth(int health) {
		isValidHealth();
	}

	public void setAttackpower(int attackpower) {
		// 만약 공격력이 0보다 클경우
		if (attackpower >= 1) {
			this.attackpower = attackpower;
		} else {
			this.attackpower = 0;
		}
		
	}
	
	public void isValidHealth() {
		if (health <= 0) {
			health = 0;
		}
	}
	
	// 캐릭터 정보 출력
	public void displayInfo() {
		System.out.println("캐릭터 정보 : " + name);
		System.out.println("채력 정보 : " + health);
		System.out.println("공격력 정보 : " + attackpower);
		
	}
	
	// 캐릭터 공격하는 출력 메서드
	public void attack(PlayerCharacter target) {
		System.out.println("[" + getName() + "] 가 공격 했습니다  [" + target.getName() + "] 한테 " + attackpower+ " 데미지를 줬습니다!!");
	}
	
	// 다른 캐릭터로 부터 공격 받았을 때 메서드
	public void takeDamage(int damage) {
		System.out.println("공격 받았습니다");
	}

}
