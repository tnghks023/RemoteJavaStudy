
public class C15_Interface {
	/*
		# �������̽� (Interface)
		
		 - abstract class�� ����� ������ ���� �� ���ٴ� ���� ������ ��
		 - �������̽� ������ �޼���� �ڵ����� abstract public�� �ȴ�
		 - �������̽� ������ ������ �ڵ����� final static�� �ȴ�.
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
		System.out.println("��������� �߷� á���� ���������� ����� ���������ϴ�.");
	}
	
	@Override
	public void click() {
		System.out.println("");
		
	}
}

	
class Ball implements CanKick {
	@Override
	public void kick() {
		System.out.println("���� �߷� á���ϴ�.");
	}
}
