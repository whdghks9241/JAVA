package com.kh.practice.exam;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		
		/**
		 * ���� 2
		   �� ������ ��� ���� �����ϳ�, 1�̸��� ���ڰ� �Էµƴٸ�
		   "1 �̻��� ���ڸ� �Է����ּ���" �� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = true;
		
		while (isTrue) {
			System.out.println("���ڸ� �Է����ּ���");
			
			int num = sc.nextInt();
			
			if (num < 1) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
			} else {
				for (int i = 1; i <= num; i++) {
					System.out.println("���� : " + i);
				}
				isTrue = false;
				break;
			}
		}

	}
}