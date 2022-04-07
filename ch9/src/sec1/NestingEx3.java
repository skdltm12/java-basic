package sec1;
//로컬 클래스 : 특정 클래스의 메서드 안에 내부클래스를 정의하고,
//객체를 만들어 실행할수 있도록 한 클래스
class E{
	void method() {		//메소드의 멤버들은 public, private, static X
		class F{
			F(){}
			int field1;
			//static int field2;
			void method1() {System.out.println("내부메서드1");}
			//static void method1() {}
		}
		F f = new F();
		f.field1 = 1004;
		f.method1();
	}
}
public class NestingEx3 {

	public static void main(String[] args) {
		E e =new E();
		e.method();
		
		}
}
