package sec2;

import java.util.Scanner;

public class dustmq2 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		
		while(run) {
		System.out.println("----------------------------------------");
		System.out.println("1.학생수|2.점수입력 |3. 점수리스트|4.분석|5.종료");
		System.out.println("----------------------------------------");
		System.out.print("선택>");
		
		int selectNo = scanner.nextInt();

		if(selectNo == 1) {
			System.out.print("학생수>");
			studentNum = scanner.nextInt();
			scores = new int[studentNum];
			
		}
		else if(selectNo == 2) {
			for(int i=0;i<studentNum;i++) {
			System.out.print("scores["+i+"]>" );
				scores[i] = scanner.nextInt();
					
			}	
			
		}
		else if(selectNo == 3) {
			for(int i=0;i<studentNum;i++) {
			System.out.println("scores["+i+"]: "+scores[i]);
			
			}
		}
		else if(selectNo == 4) {
			int a=0;
			double b=0, c=0;
			for(int i=0;i<scores.length;i++) {
				if(a<scores[i]) a=scores[i];
				b+=scores[i];
				c = b/scores.length;
				
			}
			System.out.println("최고점수: "+a);
			System.out.println("평균점수: "+c);
		}
		else if(selectNo == 5) {
			run = false;
		}
		}
			System.out.println("프로그램 종료");
	}
	
}

