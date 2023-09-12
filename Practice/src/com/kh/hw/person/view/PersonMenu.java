package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {

	// 메인 메뉴를 출력하는 메소드
	// 학생 메뉴를 출력하는 메소드
	// 사원 메뉴를 출력하는 메소드
	// 사용자에게 객체배열에 저장할 학생 데이터를 받는 메소드
	// 객체배열에 저장된 학생 데이터를 출력하는 메소드
	// 사용자에게 객체배열에 저장할 사원데이터를 받는 메소드
	// 객체 배열에 저장된 사원데이터를 출력하는 메소드
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();
	
	boolean isTrue = true;
	
	public void mainMenu() {
		
		System.out.println("학생은 최대 3명까지 저장할 수 있습니다");
		System.out.println("현제 저장된 학생은 " + pc.printStudent() + " 명 입니다");
		System.out.println("사원은 최대 10명까지 저장할 수 있습니다");
//		System.out.println("현제 저장된 사원은 " + pc.personCount() + " 명 입니다");
	

		while(isTrue) {

			
			System.out.println("");
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			int numChoice = sc.nextInt();
			
			// 1번 클릭시 
			if (numChoice == 1) {
				// 학생 메뉴 실행
				studentMenu();
			// 2번 클릭시
			} else if (numChoice == 2) {
				// 사원 메뉴 실행
				System.out.println("사원메뉴");
			// 9번 클릭시
			} else if (numChoice == 9) {
				// 종료
				System.out.println("종료합니다");
				isTrue = false;
			// 1.2.9외 다른 문자 입력시 잘못입력 문구 출력
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}
	}
	
	public void studentMenu() {
		
		boolean stChoice = true;
		
		while(stChoice) {
			System.out.println("");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			
			// 학생추가전 학생정보 배열의 길이를 체크한후 3명 초과시 비활성화 문구 출력
			if (pc.printStudent() > 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			}
			int studentChoice = sc.nextInt();
			
			// 1번 클릭시 
			if (studentChoice == 1) {
				// 학생정보 배열의 길이가 3명 초과시 잘못입력했다는 문구 출력
				if (pc.printStudent() > 3) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				// 3명 이하시 학생정보를 추가한다.
				} else {
					insertStudent();
					
				}
			
			// 2번클릭시 
			} else if (studentChoice == 2) {
				
				System.out.println("학생 보기");
			// 9번클릭시
			} else if (studentChoice == 9) {
				// 메인으로 돌아간다.
				System.out.println("???메인으로 돌아갑니다");
				stChoice = false;
			// 1.2.9 외 다른 문자를 입력시 재입력 요청 출력
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}
	}
	
	public void insertStudent() {
		
		// 학생추가 가능 여부
		// 최대 3명까지 추가 가능하므로 4명 이후부터는 false 로 변경한다.
		boolean stinsert = true;
		
		while(stinsert) {
			System.out.print("학생 이름 : ");
			String stName = sc.next();
			System.out.print("학생 나이 : ");
			int stage = sc.nextInt();
			System.out.print("학생 키 : ");
			double height = sc.nextDouble();
			System.out.print("학생 몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("학생 학년 : ");
			int grade = sc.nextInt();
			System.out.print("학생 전공 : ");
			String major = sc.next();
			
			pc.insertStudent(stName, stage, height, weight, grade, major);
			stinsert = false;
			
		}

		
	}
}
