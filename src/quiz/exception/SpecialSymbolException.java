package quiz.exception;

public class SpecialSymbolException extends Exception {
	public SpecialSymbolException() {
		super("특수문자는 !,@,#,$,%,^,&,* 만 가능합니다.");
	}
}
