package sec1;

import java.util.Scanner;
public class Hello4 {
	public static void main(String[] args) {
		//�����(����) ����
		int kor, eng, mat;
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �Է� : ");
		kor = sc.nextInt();
		System.out.println("�������� �Է� : ");
		eng = sc.nextInt();
		System.out.println("�������� �Է� : ");
		mat = sc.nextInt();
		System.out.println("����� ������ "+(kor+eng+mat)+"���̸�, ����� "
		+((kor+eng+mat)/3)+"���Դϴ�.");
	}
}
