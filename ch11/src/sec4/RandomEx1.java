package sec4;

import java.util.Arrays;
import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		//Random.nextInt(종료값)+시작값
		//Random.nextDouble() : 0~1의 실수 반환
		//Random.nextBoolean() : true 또는 false가 무작위로 반환
		Random random = new Random();
		int[] selNum = new int[6];
		for(int i=0;i<6;i++) {
			selNum[i] = random.nextInt(45)+1;
		}
		Arrays.sort(selNum);
		for(int sel : selNum) {
			System.out.print(sel+"\t");
		}
		
	}

}
