package PracticeArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class practice01 {
/**
 	3-1)
 		빨주노초파남보
 		
 		수정 3회 1.3.5 -> 블랙 , 브라운 , 그린 수정
		더하기 2회 -> 주황 뒤에  [옐로우], 파랑 뒤에[연한파랑]
		향상된 for 문 이용해서 색상 출력하기
		최후 출력 -> 빨 파 보
 */
	public static void main(String[] args) {
	
		ArrayList<String> colorList = new ArrayList<String>(Arrays.asList("빨강색", "주황색", "노랑색", "초록색", "파랑색", "남색", "보라색"));
		
		System.out.println("colorList : " + colorList);

		colorList.set(1, "블랙");
		colorList.set(3, "브라운");
		colorList.set(5, "그린");
		System.out.println("colorList : " + colorList);

		colorList.add(2, "옐로우");
		colorList.add(6, "연한파랑");
		System.out.println("colorList : " + colorList);
		
		for (String str : colorList) {
			if (str == "빨강색" || str == "파랑색" || str == "보라색" ) {
				System.out.println("최후 출력 : " + str);
			}
		}
	}
}
