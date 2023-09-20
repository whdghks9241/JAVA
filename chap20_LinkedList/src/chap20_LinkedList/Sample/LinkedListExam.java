package chap20_LinkedList.Sample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		// List 인터페이스 LinkedList 객체 활용해 값을 넣고 출력
		List<String> linkedList = new LinkedList<>();
		// String 값 넣고 수정 삭제 출력
		linkedList.add("첫 번째");
		linkedList.add("두 번째");
		linkedList.add("세 번째");
 
		System.out.println("linkedList : " + linkedList);

		linkedList.set(1, "2번째");
		System.out.println("linkedList : " + linkedList);
		
		linkedList.remove(1);

		System.out.println("linkedList : " + linkedList);
		// LinkedList 객체 new LinkedList 객체
		// int 값 넣고 수정 삭제 출력
		List<Integer> linkedList2 = new LinkedList<>();
		// String 값 넣고 수정 삭제 출력
		linkedList2.add(1);
		linkedList2.add(2);
		linkedList2.add(3);
		
		System.out.println("linkedList : " + linkedList2);

		linkedList2.set(1, 7);
		System.out.println("linkedList : " + linkedList2);
		
		linkedList2.remove(1);

		System.out.println("linkedList : " + linkedList2);
		
 
	}
}
