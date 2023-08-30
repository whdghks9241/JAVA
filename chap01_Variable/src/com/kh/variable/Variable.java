package com.kh.variable;

public class Variable {

	public static void main(String[] args) {
		
		// 1. 변수의 이름은 영문자, 숫자, 언더스코어(_), 달러($)로 구성할 수 있다.
		// 2. 변수 이름은 숫자로 시작할 수 없다.
		// 3. 변수 이름 사이에는 공백을 포함할 수 없다.
		// 4. 언어의 규칙으로띄어쓰기는 무언가 새로 시작할때 사용하기 때문에 사용하지 않는다.
		// 5. 자바에서 미리 예약한 언어는 변수 이름으로 사용하지 못한다,
		
		// 실수형 (Float, double)
		float pie1 = 3.141332213123f; // float
		double pie2 = 3.141332213123;

		System.out.print("float : ");
		System.out.println(pie1);
		System.out.print("double : ");
		System.out.println(pie2);
		
		
		// byte : -128 ~ 127 까지 사용가능
		// byte bt = -129; // int로 변경하거나 byte + byte 로 넣어 줘야한다.
		byte ht = 127; // -129와 128이상부터 출력이 되지 않는것 확인
		
		// short = -32,768 ~ 32,767 까지 사용 가능
		// short shrt = -32768; // -32789와 32768 이후 출력이 되지 않는다. 
		short shrt = -32767;
		System.out.println(shrt);
		
		// int -2,147,483,648 ~ 2,147,483,647까지 허용 가능
		int nt = -2147483648; // 
		System.out.println(nt);
		
		// long -9,223,372,036,854,775,808 ~  9,223,372,036,854,775,8087
		long lng = 2000L; //뒤에 대문자L이나 소문자 l 을 넣난다,
		System.out.println(lng);
		long lng2 = 2000l; //뒤에 대문자L이나 소문자 l 을 넣난다,
		System.out.println(lng2);
		
		
		// c?har : 문자형 문자를 한문자로 포함할 수 있다.
		char chr1 = 'a';
		System.out.println(chr1);
	
		// S논리형
		// Boolea은 true와 false 로 표현한다
		// 사용방법 boolean bin - true로 구현한다,.
		
		boolean bin = true;
		System.out.println(bin);

		boolean bin2 = false;
		System.out.println(bin2);
		
		// String은 기본적인 문자형 기본적인 자료형에 들어가지는 않으나 기본적으로 사용됨
		// 기본적인 자료형에 들어가지 ㅇ낳기 때문 String으로 표현함.
		// String ""나 ''안에 글자를 넣어 작성.
		
		System.out.println("안녕하세요 저는 홍길동입니다.");
		String name = "홍길동";
		System.out.println("안녕하세요 . 저는 " + name + "입니다");
		// 한번 타입을 선언한 변수는 재 선언을 하지 않고 그대로 사용해도 문제없다
		// 한번 선언한 타입을 다른 타입으로 재선언 할 수 없다
		// 선언한 타입을 다른 타입으로 변경해서 사용할 수 없다.
		name = "박철수";
		System.out.println("안녕하세요 . 저는 " + name + "입니다");

		int age = 22;
		String baseball = "야구";
		System.out.println("안녕하세요. 저는 " + name + "입니다.");
		System.out.println("저의 나이는 " + age + "살 이고.");
		System.out.println("저의 취미는 " + baseball + "입니다.");
	
		char score = 'a';
		System.out.println("저의 성적은 " + score + "입니다");
	
	}
}
