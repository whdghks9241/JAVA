package com.kh.practice.exam;

import java.util.Scanner;

public class Practice11 {
	public static void main(String[] args) {
		
		/**
		 * 2���� ����ڰ� �Է��� �������� �Ҽ��� ��� ����ϰ� �Ҽ��� ������ ����ϼ���.
			��, �Է��� ���� 2���� ���� ��� ���߸� �Է��ϼ̽��ϴ�.���� ����ϼ���.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է����ּ���");
		
		int num = sc.nextInt();
		int num2= 1;
		
		// �Ҽ����� �ƴ��� üũ�ϴ� boolean 
		boolean primeNum = true;
		 
		if (num < 2) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} else {
			// �Ҽ��� ��� 1�� �ڱ��ڽŸ���� ������ �������� ���� ������Ѵ�.
			for(int i=2; i <= num; i++) {
	            for(int j=2; j*j <= i; j++){
	                if(i % j == 0){
	                    // �Ҽ��� �ƴ�
	                	primeNum = false;
	                    // �Ҽ��� �ƴ� ����
	                    num2++;
	                    break;
	                }
	            }
	            if(primeNum){
	                // �Ҽ� �϶��� ���� ���
	                System.out.print(i+" ");
	            }
	            primeNum = true;
	        }

            System.out.print("�Ҽ� �� ���� : " + (num - num2));
		}
	}
}
