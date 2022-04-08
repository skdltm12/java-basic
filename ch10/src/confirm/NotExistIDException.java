package confirm;

public class NotExistIDException extends Exception {
	public NotExistIDException() {}
	public NotExistIDException(String massage) {
		super(massage);
	}
}
