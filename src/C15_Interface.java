
public class C15_Interface {
	/*
		# 인터페이스 (Interface)
		
		 - abstract class는 상속을 여러개 받을 수 없다는 점을 보완한 것
		 - 인터페이스 내부의 메서드는 자동으로 abstract public이 된다
		 - 인터페이스 내부의 변수는 자동으로 final static이 된다.
	 */
	public static void main(String[] args) {
		kick(new AppleTree());
	}
	
	public static void kick(CanKick to_kick) {
		to_kick.kick();
	}
	public static void click(CanClick to_click) {
		to_click.click();
	}
}

interface CanKick {
	public abstract void kick();
}

interface CanClick {
	public abstract void click();
}

class AppleTree implements CanKick, CanClick {
	
	@Override
	public void kick() {
		System.out.println("사과나무를 발로 찼더니 나뭇가지와 사과가 떨어졌습니다.");
	}
	
	@Override
	public void click() {
		System.out.println("");
		
	}
}

	
class Ball implements CanKick {
	@Override
	public void kick() {
		System.out.println("공을 발로 찼습니다.");
	}
}
