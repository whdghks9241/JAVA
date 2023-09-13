package com.kh.api.eaxm1;
/**


 */
public class StringBufferMain {
	public static void main(String[] args) {
		// 빈 StringBuffer 객체 생성
		StringBuffer sb = new StringBuffer();
		
		// 문자열 추가
		sb.append("Hello, " );
		sb.append("JAVA " );
		sb.append("StringBuffer");
		
		System.out.println(sb.toString());
		
		// 문자열 삽입
		sb.insert(6, "Eclipse");
		System.out.println(sb.toString());
	
		// 문자열 대체
		sb.replace(13, 17, "WOW");
		System.out.println(sb.toString());
		
		// 문자열 삭제
		sb.delete(13, 20);
		System.out.println(sb.toString());
		
		// 문자열 뒤집기
		sb.reverse();
		System.out.println(sb.toString());
	}
}
