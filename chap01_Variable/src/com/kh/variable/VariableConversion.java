package com.kh.variable;

public class VariableConversion {

	public static void main(String[] args) {
		// 1. 자동 형변환 (암시적 형변환, 묵시적 형변환)
		int intNum= 100;
		System.out.println(intNum); // 숫자 100을 의미
		long longNum = intNum; // int를 long 으로 자동 형변환
		System.out.println(longNum); 
		
		float floatNum = 3.14f;
		double doubleNum = floatNum; // float 을 double로 자동형변환
		
		// int -> long 변경하는 형변환 (2가지) 만들고 출력
		// 1.
		int changeIntlong = 500;
		System.out.println("changeIntlong : " + changeIntlong); 
		long changeLongint = changeIntlong;
		System.out.println("changeLongint : " + changeLongint); 
		// 2.
		int chanegIntlong2 = -500;
		System.out.println("chanegIntlong2 : " + chanegIntlong2); 
		long changeLongint2 = chanegIntlong2;
		System.out.println("changeLongint2 : " + changeLongint2); 
		
		// short -> int 변경하는 형변환 (1가지) 만들고 출력
		// 1.
		short changeShortint = 30;
		System.out.println("changeShortint : " + changeShortint); 
		int changeintShort = changeShortint;
		System.out.println("changeintShort : " + changeintShort); 
		
		// float -> double 변경하는 형변환 (1가지) 만들고 출력
		float changeFloatdouble = 5.1389f;
		System.out.println("changeFloatdouble : " + changeFloatdouble); 
		double changeDoublefloat = changeFloatdouble;
		System.out.println("changeDoublefloat : " + changeDoublefloat); 
	
	
	
		// 2. 명시적 형변환(강제 형변환)
		long largeLong = 123456789012345L;
		System.out.println("largeLong : " + largeLong);
		int largeInt = (int)largeLong;
		System.out.println("largeInt : " + largeInt); // long을 int로 강제 형변환 할 경우 값이 범위내에 있지 않으면 일부 데이터는 손실된다.
		
		double largeDouble1 = 12345.67889;
		int inPart = (int)largeDouble1;
				
				
		// 문자와 숫자 간의 형변환 2개 출력
		// 문자는char charbale 
		char changCharint = 'Z';
		int changeIntcahr = changCharint;
		System.out.println("changeIntcahr : " + changeIntcahr);
		
		char changCharint2 = 'A';
		int changeIntcahr2 = changCharint2;
		System.out.println("changeIntcahr2 : " + changeIntcahr2);
		
		// double -> int 로 형별환 줄 확연
		double changedoubleint = 123.203;
		int changIntdouble = (int) changedoubleint;
		System.out.println("changIntdouble : " + changIntdouble);
		
		// int를 short로 형변환 1개 출력
		int changeIntshort = 3333;
		short changShortint = (short) changeIntshort;
		System.out.println("changShortint : " + changShortint);
	}
	
	
	
}
