package quiz.exception;

public class PasswordLengthException extends Exception {
	public PasswordLengthException() {
		super("비밀번호의 길이가 8~24로 해야합니다.");
	}
}
