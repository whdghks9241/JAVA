package PracticeArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class practice03 {
	/**
	 
	3-3) 	
		����ڷκ��� 5���� ������ �Է¹޾Ƽ� �迭�� �����Ѵ��� 
		���� for���� ����ؼ� �迭�� ��� ��Ҹ� ���� ��� ��� 
	
	 */
	
	public static void main(String[] args) {
		
		int inputNum1, inputNum2, inputNum3, inputNum4, inputNum5;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5���� ������ ������� �Է����ּ���.");

		inputNum1 = sc.nextInt();
		inputNum2 = sc.nextInt();
		inputNum3 = sc.nextInt();
		inputNum4 = sc.nextInt();
		inputNum5 = sc.nextInt();
		
		ArrayList inputNumList = new ArrayList();
		inputNumList.add(inputNum1);
		inputNumList.add(inputNum2);
		inputNumList.add(inputNum3);
		inputNumList.add(inputNum4);
		inputNumList.add(inputNum5);
		
		for (int i = 0; i < inputNumList.size(); i++) {
			System.out.print(" " + inputNumList.get(i));
		}

	}
}
