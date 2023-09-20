package com.kh.Operator;

public class Assignment {

	public static void main(String[] args) {
		// 2. 대입연산자(Assignment) 변수에 값을 할당할 때 사용
		// 오른쪽 피연산자의 값을 왼쪽 피연산자에 할당한다.
		// 피연산자는 처리될 데이터 그자체 또는 데이터를 지정하는 컴퓨터 명령어의 일부
		
		int a = 1;
		
		// 복합 대입 연산자
		/**
		 변수의 현재 값과 다른 값을 계산하여 그 결과를 다시 변수에 저장하는 연산자
		 코드를 좀 더 간결하게 작성하고 읽기 쉽게 만들 수 있다.
		 += 덧셈 후 대입
		 -= 뺄셈 후 대입
		 *= 곱셈 후 대입
		 /= 나눗셈 후 대입
		 %= 나머지 후 대입
		 &= 비트 AND 후 대입
		 |= 비트 OR 후 대입
		 ^= 비트 XOR 후 대입
		 <<== 왼쪽 시프트 후 대입
		 >>== 오른쪽 시프트 후 대입
		 */
		
		int b = 10;
		b +=5; // b는 15(a = a + 5와 동일)
		System.out.println("b : " + b);
		
		int c = 20;
		c -=3; // c는 17(b = b - 3과 동일)
		System.out.println("c : " + c);
		
		int d = 8;
		d *= 2; // d는 5 ( d = d *2와 동일)
		System.out.println("d : " + d);
		
		int e = 50;
		e /= 10; // e는 5 ( e = e/10과 동일)
		System.out.println("e : " + e);
		
		int f = 25;
		f %= 7;
		System.out.println("f : " + f);
			
	}
}
