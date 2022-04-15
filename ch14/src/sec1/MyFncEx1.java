package sec1;

public class MyFncEx1 {

	public static void main(String[] args) {
		//람다식은 인터페이스 이므로 반드시 구현체를 만들어야함.
		MyFnc1 f1; //매개변수 X 반환X
		f1 = () -> {
			System.out.println("MyFnc1 실행\n");
		};
		f1.method1();
		
		MyFnc2 f2;	//매개변수 O 반환 X
		f2 = (x) -> {
			System.out.println(x*x);
		};
		f2.method2(8);
		
		MyFnc3 f3;	//매개변수 X 반환 O
		f3 = () -> {
			System.out.println();
			return 1004;
		};
		System.out.println(f3.method3());
			
		MyFnc4 f4;	//매개변수 O 반환 O
		f4 = (x) -> {
			System.out.println();
			return x*x;
		};
		System.out.println(f4.method4(9));
	}

}
