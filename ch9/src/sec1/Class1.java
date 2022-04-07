package sec1;

public class Class1 {
	int field1;
	String field2;
	double field3;

	public static void main (String[] args) {
		Class1 sub1 = new Class1();
		System.out.println(sub1.field1);
		mainMethod1();
	}
	public static void mainMethod1() {
		System.out.println("메인 메서드 호출");
	}
}
