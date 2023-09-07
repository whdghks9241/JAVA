package com.kh.inheriance.calculator;

import java.util.Scanner;

public class CalculatorRun extends Calculator{

	public static void main(String[] args) {

		/**
		 *  scanner 이용해서 코드 변경하기
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력해주세요");
		int firstInput = sc.nextInt();
		System.out.println("두 번째 숫자를 입력해주세요");
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
