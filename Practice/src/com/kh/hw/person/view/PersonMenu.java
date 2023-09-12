package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {

	// ���� �޴��� ����ϴ� �޼ҵ�
	// �л� �޴��� ����ϴ� �޼ҵ�
	// ��� �޴��� ����ϴ� �޼ҵ�
	// ����ڿ��� ��ü�迭�� ������ �л� �����͸� �޴� �޼ҵ�
	// ��ü�迭�� ����� �л� �����͸� ����ϴ� �޼ҵ�
	// ����ڿ��� ��ü�迭�� ������ ��������͸� �޴� �޼ҵ�
	// ��ü �迭�� ����� ��������͸� ����ϴ� �޼ҵ�
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();
	
	boolean isTrue = true;
	
	public void mainMenu() {
		
		System.out.println("�л��� �ִ� 3����� ������ �� �ֽ��ϴ�");
		System.out.println("���� ����� �л��� " + pc.printStudent() + " �� �Դϴ�");
		System.out.println("����� �ִ� 10����� ������ �� �ֽ��ϴ�");
//		System.out.println("���� ����� ����� " + pc.personCount() + " �� �Դϴ�");
	

		while(isTrue) {

			
			System.out.println("");
			System.out.println("1. �л� �޴�");
			System.out.println("2. ��� �޴�");
			System.out.println("9. ������");
			int numChoice = sc.nextInt();
			
			// 1�� Ŭ���� 
			if (numChoice == 1) {
				// �л� �޴� ����
				studentMenu();
			// 2�� Ŭ����
			} else if (numChoice == 2) {
				// ��� �޴� ����
				System.out.println("����޴�");
			// 9�� Ŭ����
			} else if (numChoice == 9) {
				// ����
				System.out.println("�����մϴ�");
				isTrue = false;
			// 1.2.9�� �ٸ� ���� �Է½� �߸��Է� ���� ���
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			}
		}
	}
	
	public void studentMenu() {
		
		boolean stChoice = true;
		
		while(stChoice) {
			System.out.println("");
			System.out.println("1. �л� �߰�");
			System.out.println("2. �л� ����");
			System.out.println("9. ��������");
			
			// �л��߰��� �л����� �迭�� ���̸� üũ���� 3�� �ʰ��� ��Ȱ��ȭ ���� ���
			if (pc.printStudent() > 3) {
				System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰� �޴��� �� �̻� Ȱ��ȭ ���� �ʽ��ϴ�.");
			}
			int studentChoice = sc.nextInt();
			
			// 1�� Ŭ���� 
			if (studentChoice == 1) {
				// �л����� �迭�� ���̰� 3�� �ʰ��� �߸��Է��ߴٴ� ���� ���
				if (pc.printStudent() > 3) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				// 3�� ���Ͻ� �л������� �߰��Ѵ�.
				} else {
					insertStudent();
					
				}
			
			// 2��Ŭ���� 
			} else if (studentChoice == 2) {
				
				System.out.println("�л� ����");
			// 9��Ŭ����
			} else if (studentChoice == 9) {
				// �������� ���ư���.
				System.out.println("???�������� ���ư��ϴ�");
				stChoice = false;
			// 1.2.9 �� �ٸ� ���ڸ� �Է½� ���Է� ��û ���
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			}
		}
	}
	
	public void insertStudent() {
		
		// �л��߰� ���� ����
		// �ִ� 3����� �߰� �����ϹǷ� 4�� ���ĺ��ʹ� false �� �����Ѵ�.
		boolean stinsert = true;
		
		while(stinsert) {
			System.out.print("�л� �̸� : ");
			String stName = sc.next();
			System.out.print("�л� ���� : ");
			int stage = sc.nextInt();
			System.out.print("�л� Ű : ");
			double height = sc.nextDouble();
			System.out.print("�л� ������ : ");
			double weight = sc.nextDouble();
			System.out.print("�л� �г� : ");
			int grade = sc.nextInt();
			System.out.print("�л� ���� : ");
			String major = sc.next();
			
			pc.insertStudent(stName, stage, height, weight, grade, major);
			stinsert = false;
			
		}

		
	}
}
