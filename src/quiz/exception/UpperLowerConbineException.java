package quiz.exception;

public class UpperLowerConbineException extends Exception{
	public UpperLowerConbineException() {
		super("대문자, 소문자, 숫자, 특수문자가 섞여야 합니다.");
	}
}
