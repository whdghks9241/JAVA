package PracticeArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class practice03 {
	/**
	 
	3-3) 	
		사용자로부터 5개의 정수를 입력받아서 배열에 저장한다음 
		향상된 for문을 사용해서 배열의 모든 요소를 더한 결과 출력 
	
	 */
	
	public static void main(String[] args) {
	
		int inputNum1, inputNum2, inputNum3, inputNum4, inputNum5;

		int sumNum1 = 0;
		int sumNum2 = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5개의 정수를 순서대로 입력해주세요.");

		inputNum1 = sc.nextInt();
		inputNum2 = sc.nextInt();
		inputNum3 = sc.nextInt();
		inputNum4 = sc.nextInt();
		inputNum5 = sc.nextInt();
		
		ArrayList<Integer> inputNumList = new ArrayList<Integer>();
		inputNumList.add(inputNum1);
		inputNumList.add(inputNum2);
		inputNumList.add(inputNum3);
		inputNumList.add(inputNum4);
		inputNumList.add(inputNum5);
		
		// 일반 for문
		for (int i = 0; i < inputNumList.size(); i++) {
			
			sumNum1 += (int) inputNumList.get(i);
		}
		
		System.out.println("정수를 더한 값 : " + sumNum1);
		
		// 향상된 for문
		for (Integer num : inputNumList) {
			sumNum2 += num;
		}
		

		System.out.println("정수를 더한 값 : " + sumNum2);
	}
}
