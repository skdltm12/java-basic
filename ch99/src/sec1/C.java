package sec1;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i;
		int j=0;
		
		System.out.print("소수인지 알아볼 정수를 입력해주세요. : ");
		int r = scanner.nextInt();
		for(i=1;i<=r;i++) {
			if(r%i==0){j+=i;}
			}
		if(j-1==r) {System.out.println(r+"은 소수 입니다.");}
		else {System.out.println(r+"은 소수가 아닙니다.");}
	}
}
