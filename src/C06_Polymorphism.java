
public class C06_Polymorphism {

	/*
		# ��ü�� ������
		 - ��ü�� �پ��� ���¸� ���� �� �ִ�.
	 */
	
	public static void main(String[] args) {
		
		Fruit fruit01 = null;
		Pineapple pine01 = null;
		
		Fruit fruit = new Fruit();
		Pineapple pineapple = new Pineapple();

		fruit01 = fruit;
		fruit01 = pineapple; // ��ĳ����
		
		pine01 = pineapple;
//		pine01 = fruit; (X) 
		
		// �ٿ� ĳ������ ������ ���
		// ���� �ڽ� Ÿ���̾��� �ν��Ͻ��� ��ĳ���� �Ǿ� �ִ°��
		
		pine01 = (Pineapple) fruit01; //�ٿ� ĳ����
		
		
		Fruit f = new Pineapple();
		Fruit f2 = new DragonFruit();
		
		// ��ĳ���� �� ���¿��� �θ�Ÿ�Կ��� �����ϴ� �޼��带 ����ϸ� �ش� �޼��尡 �������̵� �� ��� �������̵� �Ǿ��ִ� ����� ���.
		f.eat(); // Pineapple�� �����
//		f.smash(); (X)
		
		// ���½��õ� ���¿����� ���� Ŭ������ �����ִ� ����� ��� �ؾ������.
		// ���� ����� ����ϱ� ���ؼ��� �ٿ�ĳ������ �ʿ��ϴ�.
		// �����Ϸ��� �ٿ�ĳ���ý� �߻��ϴ� �������� ã������ ���Ѵ�.
		// ((pineappe)f2).smash();
		
		//instanceof �����ڸ� ��� �ش� �ν��Ͻ��� Ư�� Ŭ������ �ν��Ͻ������� �˻��� �� �ִ�.
		System.out.println("f�� Fruit�� �ɼ� �ִ� �ν��Ͻ� �ΰ���?"+(f instanceof Fruit));
	}

}

class Fruit {
	
	void eat() {
		System.out.println("���� ����");
	}
}
class Pineapple extends Fruit{
	
	void eat() {
		System.out.println("�������̵� ���ξ����� �Ծ����ϴ�.");
	}
	void smash() {
		System.out.println("���ξ��÷� ����.");
	}
}
class DragonFruit extends Fruit{
	
	void eat() {
		System.out.println("�������̵� ��� �Ծ����ϴ�.");
	}
}
// ���� ��Ű�� ���ο��� ���� �̸��� Ŭ������ ������ �� ����.