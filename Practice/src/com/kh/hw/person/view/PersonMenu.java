package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {

	// 메인 메뉴를 출력하는 메소드
	// 학생 메뉴를 출력하는 메소드
	// 사원 메뉴를 출력하는 메소드
	// 사용자에게 객체배열에 저장할 학생 데이터를 받는 메소드
	// 객체배열에 저장된 학생 데이터를 출력하는 메소드
	// 사용자에게 객체배열에 저장할 사원데이터를 받는 메소드
	// 객체 배열에 저장된 사원데이터를 출력하는 메소드
	Scanner sc = new Scanner(System.in);
	Scanner intsc = new Scanner(System.in);
	PersonController pc = new PersonController();
	
	boolean isTrue = true;
	
	public void mainMenu() {
		
		while(isTrue) {
			
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다");
			System.out.println("현제 저장된 학생은 " + pc.studentCount() + " 명 입니다");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다");
			System.out.println("현제 저장된 사원은 " + pc.employeeCount() + " 명 입니다");
		

			System.out.println("");
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			int numChoice = intsc.nextInt();
			
			// 1번 클릭시 
			if (numChoice == 1) {
				// 학생 메뉴 실행
				studentMenu();
			// 2번 클릭시
			} else if (numChoice == 2) {
				// 사원 메뉴 실행
				employeeMenu();
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
	
	// 학생 메뉴
	public void studentMenu() {
		
		boolean stChoice = true;
		
		while(stChoice) {
			int stCount = pc.studentCount();
			System.out.println("");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			
			// 학생추가전 학생정보 배열의 길이를 체크한후 3명 초과시 비활성화 문구 출력
			if (stCount >= 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			}
			int studentChoice = intsc.nextInt();
			
			// 1번 클릭시 
			if (studentChoice == 1) {
				// 학생정보 배열의 길이가 3명 초과시 잘못입력했다는 문구 출력
				if (stCount >= 3) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				// 3명 이하시 학생정보를 추가한다.
				} else {
					insertStudent();
				}
			
			// 2번클릭시 
			} else if (studentChoice == 2) {
				 
				if (stCount <= 0) {
					System.out.println("등록된 학생이 없습니다. 학생을 추가해주세요");
				} else {
					printStudent();
				}
			// 9번클릭시
			} else if (studentChoice == 9) {
				// 메인으로 돌아간다.
				System.out.println("메인으로 돌아갑니다");
				stChoice = false;
			// 1.2.9 외 다른 문자를 입력시 재입력 요청 출력
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}
	}
	
	// 사원메뉴
	public void employeeMenu() {
		
		boolean empChoice = true;
		
		while (empChoice) {
			int empCount = pc.employeeCount();
			
			System.out.println("");
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			
			// 사원 추가전 사원정보 배열의 길이를 체크한후 10명 초과시 비활성화 문구 출력
			if (empCount >= 10) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			}
			int employeeChoice = intsc.nextInt();
			
			// 1번 클릭시 
			if (employeeChoice == 1) {
				// 학생정보 배열의 길이가 3명 초과시 잘못입력했다는 문구 출력
				if (empCount >= 3) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				// 10명 이하시 사원정보를 추가한다.
				} else {
					insertEmployee();
				}
			
			// 2번클릭시 
			} else if (employeeChoice == 2) {
				if (empCount <= 0) {
					System.out.println("등록된 사원이 없습니다. 학생을 추가해주세요");
				} else {
					printEmployee();
				}
			// 9번클릭시
			} else if (employeeChoice == 9) {
				// 메인으로 돌아간다.
				System.out.println("메인으로 돌아갑니다");
				empChoice = false;
			// 1.2.9 외 다른 문자를 입력시 재입력 요청 출력
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}
	}

	// 학생 추가 
	public void insertStudent() {
		
		System.out.println();
		// 학생추가 가능 여부
		// 최대 3명까지 추가 가능하므로 4명 이후부터는 false 로 변경한다.
		boolean stinsert = true;
		
		while(stinsert) {
			System.out.print("학생 이름 : ");
			String stName = sc.nextLine();
			System.out.print("학생 나이 : ");
			int stage = intsc.nextInt();
			System.out.print("학생 키 : ");
			double height = intsc.nextDouble();
			System.out.print("학생 몸무게 : ");
			double weight = intsc.nextDouble();
			System.out.print("학생 학년 : ");
			int grade = intsc.nextInt();
			System.out.print("학생 전공 : ");
			String major = sc.nextLine();
			
			pc.insertStudent(stName, stage, height, weight, grade, major);
			
			if (pc.studentCount() >= 3) {
				System.out.print("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생메뉴로 돌아갑니다.");
				stinsert = false;
			} else {
				System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무키나 누르세요");
				System.out.println("");
				String restartMenu = sc.nextLine();
				
				if (restartMenu.equals("n")|| restartMenu.equals("N")) {
					stinsert = false;
					break;
				} else {
					stinsert = true;
				}
			}
		}
	}
	
	public void insertEmployee() {

		System.out.println();
		// 사원추가 가능 여부
		// 최대 10명까지 추가 가능하므로 11명 이후부터는 false 로 변경한다.
		boolean empinsert = true;
		
		while(empinsert) {
			System.out.print("사원 이름 : ");
			String empName = sc.nextLine();
			System.out.print("사원 나이 : ");
			int stage = intsc.nextInt();
			System.out.print("사원 키 : ");
			double height = intsc.nextDouble();
			System.out.print("사원 몸무게 : ");
			double weight = intsc.nextDouble();
			System.out.print("사원 급여 : ");
			int salary = intsc.nextInt();
			System.out.print("사원 부서 : ");
			String dept = sc.nextLine();
			
			pc.insertEmployee(empName, stage, height, weight, salary, dept);
			
			if (pc.employeeCount() >= 3) {
				System.out.print("사원을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생메뉴로 돌아갑니다.");
				empinsert = false;
			} else {
				System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무키나 누르세요");
				System.out.println("");
				String restartMenu = sc.nextLine();
				
				if (restartMenu.equals("n")|| restartMenu.equals("N")) {
					empinsert = false;
					break;
				} else {
					empinsert = true;
				}
			}
		}
	}
	
	public void printStudent() {
		 
		pc.printStudent();
		
	}
	
	public void printEmployee() {
		 
		pc.printEmployee();
		
	}
}
