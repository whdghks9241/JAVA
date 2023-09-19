package com.kh.dequeueMain;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueMain {

	public static void main(String[] args) {
		
		/**
					  시작   				            끝
							 
					   |					        |
					   V					        V
							 
					[First]  <->  [Second]  <->  [Third]

				 ^										    ^		
				 |											|
				
			[         ]								   [         ]
		
		 */
		
		
		// ArrayDequeue 사용하여 Dequeue 생성
		Deque<String> deque = new ArrayDeque<>();
		
		// 요소 츄거
		deque.addFirst("First");
		deque.add("test");
		deque.addLast("Last");
		
		// 맨 앞과 맨 뒤 요소 확인
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
		
		// 맨 앞과 맨 뒤 요소 제거
		deque.removeFirst();
		deque.removeLast();
		System.out.println(deque);
		
		
	}
}
