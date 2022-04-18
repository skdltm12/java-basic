package sec1;

import java.util.Stack;
//LIFO구조 -> Stack의 운영방법
public class StackEx1 {
	public static void main(String[] args) {
		Stack<Integer> stack1 = new Stack<>();
		stack1.push(20);
		stack1.push(50);
		stack1.push(30);
		System.out.println("스택의 크기 : "+stack1.size());
		System.out.println("스택에서 값(20) 찾기 : "+stack1.contains(20));
		System.out.println("스택에 비어있는 저장소가 있는지 여부 : "+stack1.empty());
		System.out.println("스택의 가장 마지막(최상단) 값 출력 : "+stack1.peek() );
		stack1.pop();	//최상단 값 삭제
		System.out.println("스택의 크기 : "+stack1.size());
		System.out.println("스택의 가장 마지막(최상단) 값 출력 : "+stack1.peek() );
		stack1.clear();	//모든 값 삭제
		System.out.println("스택의 크기 : "+stack1.size());
		System.out.println("스택에 비어있는 저장소가 있는지 여부 : "+stack1.empty());
	}
}
