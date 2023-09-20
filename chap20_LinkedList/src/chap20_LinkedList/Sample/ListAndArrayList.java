package chap20_LinkedList.Sample;

import java.util.LinkedList;
import java.util.List;

public class ListAndArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성
		List<String> linkedList = new LinkedList<>();

		linkedList.add("첫 번째");
		linkedList.add("두 번째");
		linkedList.add("세 번째");
 
		System.out.println("linkedList : " + linkedList);
		
		linkedList.remove(1);

		System.out.println("linkedList : " + linkedList);
		
		boolean isTrue = linkedList.contains("두 번째");
		System.out.println("두 번째 요소 포함여부 : " + isTrue);
		
		int size = linkedList.size();
		System.out.println("크기 : " +size);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
}
