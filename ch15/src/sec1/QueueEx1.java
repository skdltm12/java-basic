package sec1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx1 {
	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<>();
		que.add(20); 	//값 입력
		que.add(50);
		que.offer(30);
		que.offer(40);
		System.out.println("가장 처음 입력된 값 : " +que.peek());
		System.out.println("큐의 사이즈 : "+que.size());
		que.remove();	//가장 처음의 값 제거
		System.out.println("가장 처음 입력된 값 : " +que.peek());
		que.poll();
		System.out.println("가장 처음 입력된 값 : " +que.peek());
	}
}
