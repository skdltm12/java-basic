package sec1;

public class ClassEx1 {

	public static void main(String[] args) {
		//객체(인스턴스) 생성
		//클래스명 객체명 = new 생성자함수();
		Sample1 obj1 = new Sample1();
		System.out.println("obj.field1="+obj1.field1);
		obj1.field1 = 100;
		System.out.println("obj.field1="+obj1.field1);
		obj1.field1 = 200;
		System.out.println("obj.field1="+obj1.field1);
//		obj1.field1 = 100;
//		obj2.field2 = 3.28f;
		Sample1 obj2 = new Sample1(10);
		System.out.println("**** obj2 ****");
		System.out.println(obj2.field1);
		System.out.println(obj2.getField1());
		//obj2.field2 = 3.14f; - field2가 private이므로 직접 접근이 되지 않음
		//System.out.println(obj2.field2); - 클래스 내부인 getter, setter를 통해 접근
		obj2.setField2(6.28f);
		System.out.println(obj2.getField2());
		Sample1 obj3 = new Sample1(20, 3.14f);
		

	}

}
