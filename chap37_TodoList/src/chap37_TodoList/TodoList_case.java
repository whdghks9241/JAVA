package chap37_TodoList;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class TodoList_case {
	

	public static void main(String[] args) {
		
		Map<Integer, String> todoMap = new HashMap<>();
		
		int taskNum = 1;

		Scanner scn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		while(true) {

			System.out.println("");
			
			System.out.println("할 일을 선택하세요");
			System.out.println("할 일 추가는 숫자 1을 넣어주세요");
			System.out.println("할 일 제거는 숫자 2를 넣어주세요");
			System.out.println("종료 하시려면 숫자 3을 넣어주세요");
			System.out.println("할 일 목록을 보시려면 숫자 4을 넣어주세요");
			
			int choice = scn.nextInt();

			switch(choice) {
				case 1 :
					System.out.println("추가할 일을 작성해주세요");
					String todoItem = sc.nextLine();
					todoMap.put(taskNum++, todoItem);
					System.out.println("할 일이 추가되었습니다.");
					System.out.println("");
					break;
					
				case 2 :
					System.out.println("제거할 일의 번호를 입력하세요");
					int removeNum = scn.nextInt();
					if (todoMap.containsKey(removeNum)) {
						todoMap.remove(removeNum);
						System.out.println("할 일이 제거되었습니다");
					} else {
						System.out.println("해당 번호의 할일 이 없습니다. 번호를 잘못 입력 하셨습니다.");
						System.out.println("");
					}
					break;
				case 3 :
					System.out.println("프로그램을 종료합니다");
					sc.close();
					scn.close();
					System.exit(0);
					break;
					
				case 4 :
					System.out.println("할 일 목록");
					for (Map.Entry<Integer, String> entry : todoMap.entrySet()) {
						System.out.println(entry.getKey() + " : " + entry.getValue());
					}
					break;
				default :
					System.out.println("올바른 선택이 아닙니다. 다시 선택해 주세요");
			}
		}
	}
}
