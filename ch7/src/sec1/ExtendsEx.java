package sec1;
//메인 클래스 : 실행 클래스라고도 하며, main() 함수가 있어 실행이 가능함
//반드시 public 접근 제한자를 갖는다.
public class ExtendsEx {

	public static void main(String[] args) {
		Parent p1;		//선언만
		Parent p2 = new Parent(); //선언과 객체 생성
		//p1.method1();
		//p1.method2();
		p1 = new Parent();
		p1.method1();
		p1.method2();
		
		p2.method1();
		p2.method2();
		
		p1 = new Children();		//타입을 변경하여 재생성
		p1.method1();
		p1.method2();
		
		p1 = new Parent();
		p1.method1();
		p1.method2();
		
		p1 = new Sister();
		p1.method1();
		p1.method2();
		
		p1 = new Brother();
		p1.method1();
		p1.method2();
		
		//자식 클래스로부터 유도된 인스턴스는 부모 클래스의 인스턴스가 될 수 없다.
		//형제 클래스로부터 유도된 인스턴스는 다른 형제 클래스의 인스턴스가 될 수 없다.
		Children c1;
		c1 = new Children();
		
		//c1 = new Parent();
		//c1 = new Sister();
		
		//
		
	}	

}
