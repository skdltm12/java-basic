package sec3;
//사용자 예외처리 만들기 - 자바 클래스인 Exception으로 부터 상속해서 만들 수 있다.
public class BalanceUnderflowException extends Exception{
	public BalanceUnderflowException() {}
	public BalanceUnderflowException(String message) {
		super(message);
	}
}
