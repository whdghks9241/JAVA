package com.kh.practice.exam;

import java.util.Arrays;
import java.util.Scanner;

public class Practice21 {

	public static void main(String[] args) {
		/**
		 	사용자가 입력한 값이 배열에 있는지 검색하여
			있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
			단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
			ex.
			치킨 이름을 입력하세요 : 양념 치킨 이름을 입력하세요 : 불닭
			양념치킨 배달 가능 불닭치킨은 없는 메뉴입니다
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("치킨 이름을 입력하세요");
		String choiceMenu = sc.next();
		
		String[] menu = {"후라이드","양념","간장","파닭","어니언"};
			String strMenu;
		
		boolean unHave = false;
		
		for (int i = 0; i < menu.length; i++)  {
			System.out.println(menu[i]);
			
			if (choiceMenu.equals(menu[i])) {
				unHave = true;
			}
		}
		System.out.println(unHave);
		
		if (unHave == true) {
			System.out.println(choiceMenu + "치킨 배달가능.");

		} else {
			System.out.println(choiceMenu + "치킨은 없는 메뉴입니다.");
		}
		
	}

}
