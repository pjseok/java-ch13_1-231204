package com.pjseok.ch13_2;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack1 = new Stack<String>();
		
		stack1.push("홍길동");
		stack1.push("이순신");
		stack1.push("김유신");
		
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop()); // Stack 클래스 : LIFO 자료 구조를 구현한 클래스
		
		
	}

}
