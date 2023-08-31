package chap06_For;

import java.util.Scanner;

public class for02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("첫번째 숫자를 입력하세요.");
//		int number1 = sc.nextInt();
//		
//		System.out.println("두번째 숫자를 입력하세요.");
//		int number2 = sc.nextInt();
//		
//		int result = 0; // 최초 값을 0으로 준다.
//		for (int i = 0; i < number2; i++) { // for 루프를 사용해서 i 변수를 0 부터 number2 미만까지 반복
//											// 이 루프는 두번째 숫자인 num2 만큼 반복
//			result += number1;
//			// result 변수에 number1 값을 더함
//			// number2 만큼 number1을 더해서 효과를 줌
//			System.out.println(number1 + " * " + number2 + " = " + result);
//		}
//		System.out.println(number1 + " * " + number2 + " = " + result);
//		// 계산된 결과를 출력 입력 받은 두 숫자와 결과 값을 문자열로 출력
		
		int result = 0;
//				
//		System.out.println("첫번째 숫자를 입력하세요.");
//		int num1 = sc.nextInt();
//		System.out.println("두번째 숫자를 입력하세요.");
//		int num2 = sc.nextInt();
//		
		// 이중 for문을 이용한 구구단
		for (int i = 2; i < 10; i++) {
			
			for (int j = 1; j < 10; j++) {
				
				System.out.println( i + " * " + j + " = " + (i * j));
				
			}
		}			
	}
}
