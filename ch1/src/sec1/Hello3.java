package sec1;

import java.util.Scanner;

public class Hello3 {

	public static void main(String[] args) {
		String name;		//���ڿ� ����� ���� - name
		int age;			//���� ����� ���� - age
		double height;		//�Ǽ� ����� ���� - height
		
		Scanner sc = new Scanner(System.in);	//Ű���� ����
		System.out.println("�̸� �Է� : ");
		name = sc.next();			//Ű����� �Է��� ������ ���ڿ��� name�� ����
		System.out.println("���� �Է� : ");
		age = sc.nextInt();			//Ű����� �Է��� ������ ������ age�� ����
		System.out.println("Ű(����) �Է� : ");
		height = sc.nextDouble();	//Ű����� �Է��� ������ �Ǽ��� height�� ����
		//��ü ������ ������ ���
		System.out.println("���� �̸��� "+name+"�̰�, ���̴� "+age+"�� �̸�, Ű�� "+
		height+"��Ƽ���� �Դϴ�.");
	}
}