package doit_컬렉션;

import java.util.ArrayList;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	// 스택의 맨 뒤에 요소를 추가
	public void push(String data) {
		arrayStack.add(data);
	}
	
	// 스택의 맨 뒤에서 요소 꺼냄
	public String pop() {
		int len = arrayStack.size(); // ArrayList에 저장된 유효한 자료의 개수
		if(len == 0) {
			System.out.println("스택이 비었습니다");
			return null;
		}
		
		return(arrayStack.remove(len-1)); // 가장 최근에 추가된 마지막 항목을 제거하고 반환해 줌
	}
}

public class StackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
	

}
