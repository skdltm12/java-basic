package sec2;

public class ForceCasting1 {
	public static void main(String[] args) {
		//����ĳ���� : �� ū �����͸� ���� Ÿ���� ������ �����͸� ����
		int a = 100;
		short b = (short) a;
		byte c = (byte) a;
		
		int i1 = 65000;
		short s1 = (short) i1;
		byte b1 = (byte) i1;
		//����, ���� ���ϴ� �����͸� ����ĳ������ ���. �����ʹ� �ְ�ȴ�.
		System.out.println("s1="+s1);
		System.out.println("b1="+b1);
	}
}