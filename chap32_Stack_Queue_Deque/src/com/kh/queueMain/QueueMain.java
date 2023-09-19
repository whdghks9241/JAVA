package com.kh.queueMain;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		// 큐 QUEUE 생성
		Queue<String> queue = new LinkedList<>();
		
		/**

			Front				  Rear(tail)
			  |						  |
			  v						  v
  		    +---+		+---+		+---+
			| 1 |	<-  | 2 |  	<-	| 3 |	
			+---+		+---+		+---+
			
			
		 */
		
		queue.offer("Apple");
		queue.offer("Banana");
		queue.offer("Cherry");
	
		// 큐에서 요소 추출 및 출력 (FIFO 순서대로 출력됨)
		String removedElement = queue.poll(); // queue에서 Apple 를 제거하고 반환
		System.out.println(removedElement);
		
		removedElement = queue.poll();
		System.out.println(removedElement);
		
		// 큐의 Front 요소 확인(제거하지 않고 확인만)
		String fontElement = queue.peek(); // queue의 front 요소 Cherry 반환
		System.out.println(fontElement);
		
		// 큐의 크기 확인
		int size = queue.size(); // 1이 될 것임
		System.out.println("size : " + size);
		
//		while(!queue.isEmpty()) {
//			
//			String element = queue.poll();
//			System.out.println(element);
//		}
	}

}
