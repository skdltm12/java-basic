package sec1;
//class 클래스명 extends 부모클래스 { }
//부모 클래스 = 슈퍼 클래스
public class Children extends Parent {
	double field3;
	Children(){};
	Children(int field1, String field2, double field3){
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
	}
	@Override
	public void method2() {System.out.println("자식 메서드2");}
	public void method3() { }
	
}
