package sec2;
//예외 떠 넘기기(throws 구절) : 메서드명 throws 에외종류 {}
//만약 처리 내용이 문제가 발생하면, throws 구절을 이용하여 해당 예외(Exception)를
//자바에서 처리하게 떠넘긴다.
public class Exception3 {
	public void method1() throws ClassNotFoundException {
		method2();	//처리 내용
	}
	public void method2() {
		try {
			Class cla1 = Class.forName("Java.lang.String"); 
		} catch(ClassNotFoundException e) {
			System.out.println("해당 클래스가 존재하지 않음");
		} catch(Exception e) {
			System.out.println("예상 밖의 예외가 있음");
		} finally {
			System.out.println("프로그램 종료");
		}
	}
}
