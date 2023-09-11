package PracticeArrayList;

import java.util.Scanner;

public class practice07 {

	public static void main(String[] args) {
		// 사용자에게 행의 크기 입력받고
		Scanner sc = new Scanner(System.in);
		System.out.println("행의 크기 : ");
		int numRows = sc.nextInt();
		sc.nextLine(); // 개행크기
		
		int [][] charArray = new int[numRows][];
		// 그 수만큼의 반복을 통해
		for (int i = 0; i < numRows; i++) {
			// 열의 크기도 받기
			System.out.print(i + "열의 크기 받기 : ");
			int numCols = sc.nextInt();
			
			charArray[i] = new int[numCols];
			
			int StartValue = i * numCols + 1;
			for (int j = 0; j <numCols; j++) {
				charArray[i][j] = StartValue++;
			}
		}
		// 배열 출력
		for (int k = 0; k <numRows; k++) {
			for (int j = 0; j < charArray[k].length; j++) {
				System.out.println((char)'a' + charArray[k][j]-1);
			}
			System.out.println();
		}
		sc.close();
	}
}
