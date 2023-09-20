package com.kh.stackMain;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		
		// stack 값 추가 push();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(5);
	
		
		// stack 값 삭제 pop();
		
		// stack 전체 값 제거 (초기화) clear();
		// stack 가장 상단의 값(가장 마지막에 넣은값) 출력 peek();
		// stack 의 크기출력 size();
		// stack 스택이 비어있는지 체크
		// 비어있다면 true , 하나라도 들어있다면 false empty();
		// stack 1이 있는지 체크 
		// 1이 존재한다면 true = contains();
		
		/**
			 |	 5	 |
			 |	 4   |
			 |	 3   |
			 |	 2   |
			 |___1___|
		 */
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		System.out.println(stack);
	}

}
