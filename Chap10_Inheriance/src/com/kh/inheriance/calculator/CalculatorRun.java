package com.kh.inheriance.calculator;

import java.util.Scanner;

public class CalculatorRun extends Calculator{

	public static void main(String[] args) {

		/**
		 *  scanner �̿��ؼ� �ڵ� �����ϱ�
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° ���ڸ� �Է����ּ���");
		int firstInput = sc.nextInt();
		System.out.println("�� ��° ���ڸ� �Է����ּ���");
		int secondInput = sc.nextInt();

		Calculator cal = new Calculator();
		int result1 =  cal.add();
		int result2 =  cal.substruct();
		int result3 =  cal.multiply();
		int result4 =  cal.divide();

		System.out.println("Add : " + result1);
		System.out.println("substruct : " + result2);
		System.out.println("multiply : " + result3);
		System.out.println("divide : " + result4);
	}

}
