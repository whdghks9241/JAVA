package com.kh.practice.exam;

import java.util.Scanner;

public class Practice11 {
	public static void main(String[] args) {
		
		/**
		 * 2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
			단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		 */
		Scanner sc = new Scanner(System.in); // 입력받기 위해 불러오는 메소드
		 
		System.out.println("숫자를 입력해주세요"); // 출력 메소드
		
		int num = sc.nextInt();
		int num2= 1;
		
		// 소수인지 아닌지 체크하는 boolean 
		boolean primeNum = true;
		 
		if (num < 2) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			// 소수의 경우 1과 자기자신말고는 나누어 떨어지는 수가 없어야한다.
			for(int i=2; i <= num; i++) {
				/**
				  i - 1 을 해야 할경우 a * a 대신 넣어라
				  
				   sqrt(i) i의 제곱근을 나타내는 함수
				   sqrt(i) 결과가 4가됨 16의 제곱근이 4라 뜻
				   소수판별 sqry(i) 소수를 판별할 때 i 소수인지 확인하기 위해 2부터 sqrt(i)
				   계산량을 줄이고 효율적으로 소수를 판별할 수 있음
 				 */
	            for(int j=2; j*j <= i; j++){
	                if(i % j == 0){
	                    // 소수가 아닐
	                	primeNum = false;
	                    // 소수가 아닌 갯수
	                    num2++;
	                    break;
	                }
	            }
	            if(primeNum){
	                // 소수 일때만 값을 출력
	                System.out.print(i+" "); 
	            }
	            primeNum = true;
	        }

            System.out.print("소수 총 갯수 : " + (num - num2));
		}
	}
}
