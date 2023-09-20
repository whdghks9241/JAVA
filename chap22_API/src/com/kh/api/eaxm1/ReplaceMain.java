package com.kh.api.eaxm1;

public class ReplaceMain {

	public static void main(String[] args) {
		//replace1();
		ReplaceMain rm = new ReplaceMain();
		
		rm.replace1();
		rm.replace2();
		rm.replace3();
		rm.replace4();
		rm.replace5();
		
		rm.replaceAll();
	}
	
	public void replace1() {
		String input = "Hello, world!";
		String reInput = input.replace(" ", "-");
		System.out.println(reInput);
		String input2 = reInput.replace("-", "");
		System.out.println("input2 : "+input2);
	}
	
	public void replace2() {
		String input = "Hellow World!";
		String reInput = input.replace("World", "Java");
		System.out.println(input);
	}
	
	public void replace3() {
		String originName = "Heool world";
		String reInput = originName.replace("o", "x");
		System.out.println(reInput);
	}
	
	// fox -> cat
	public void replace4() {
		String originString = "the quick brown fox jumps over this lazy dog";
		String reInput = originString.replace("fox", "dog");
		System.out.println(reInput);
	}
	
	//공백 제거
	public void replace5() {
		String originString = "The quick brown fox jumps over the lazy dog";
		String reInput = originString.replace(" ", "");
		System.out.println(reInput);
		// 모든 공백 제거하기
	}
	
	public void replaceAll() {
		String originString = "Hello World";
		// replace 대신 replaceAll 을 이용해서 대소문자 구분없이 문자열 치환하기
		String reAllstr = originString.replaceAll("(?i)World", "Java");
		System.out.println(reAllstr);
	}
	
}
