package com.kh.Practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeMain {

	public static void main(String[] args) {
		
		PracticeMain pm = new PracticeMain();
//		pm.PracticeStack();
		pm.PracticeQueue();
		
	}
	
	public void PracticeStack() {
		
		// stack에 값을 저장하고 삭제하고 초기화 등 메서드 사용해보기
		Stack<String> stack = new Stack<>();

		stack.push("삭제될 내용");
		stack.push("ㅁㅁㅁㅁ");
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);

		stack.push("추가될 내용");
		stack.push("ㄱㄱㄱㄱㄱㄱ");
		stack.push("ㄴㄴㄴㄴㄴㄴ");
		stack.push("ㄷㄷㄷㄷㄷㄷ");
		stack.push("ㄹㄹㄹㄹㄹㄹ");

		System.out.println(stack.empty());
		System.out.println(stack.size());
		System.out.println(stack.contains(stack));
		System.out.println(stack);
		
		stack.clear();
		System.out.println(stack);
	}
	
	public void PracticeQueue() {
		
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("첫번째 추가");
		queue.offer("두번째 추가");
		queue.offer("세번째 추가");
		queue.offer("네번째 추가");
		queue.offer("다섯번째 추가");
		queue.offer("여섯번째 추가");

		System.out.println("---------- poll ----------");
		String firstRemove = queue.poll();
		System.out.println(firstRemove);

		System.out.println("---------- peek ----------");
		String fontCheck = queue.peek();
		System.out.println(fontCheck);
		
		System.out.println(queue);
		
		for(String str : queue) {
			System.out.println(str);
		}
	}

}
