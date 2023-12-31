package com.kh.genericsMain;

public class GenericsExam {

	public static void main(String[] args) {
		// 정수형 데이터를 저장하는 Box 인스턴스 생성
		Book<Integer> intBook = new Book<>();
		intBook.put(42);
		intBook.put(16478);
		
		int intValue =intBook.get(); // 형변환이 필요 없다.
		
		// 문자열 데이터를 저장하는 Book 인스턴스 생성
		Book<String> strBook = new Book<>();
		strBook.put("에헿");
		strBook.put("에헤헤헤");
		strBook.put("으히히힣히힣");
		strBook.put("에흐에헤엥");
		strBook.put("에헿대핟");
		
		String strValue = strBook.get(); // 형변환 할 필요 없음
		
		// 제너릭 클래스를 사용해서 다양한 데이터 유형을 처리할 수 있고 출력할수 있음
		System.out.println("Int Value  :  " + intValue);
		System.out.println("String Value  :  " + strValue);
	}
}
