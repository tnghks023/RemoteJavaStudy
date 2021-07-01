

public class C07_Abstract {

	/*
		# �߻� Ŭ����
		 - ���¸� ����� ���� �ϼ��� �ڼ� Ŭ�������� �̷�� Ŭ����
		 - ���ο� �߻� �޼��带 �����ϰ� �ִ� Ŭ����
		# �߻� �޼��� (abstract method)
		 - ������ ���� �޼���
 		 - abstract�� ���� �޼���� ���� ������ �� ����, ��ӹ��� Ŭ�������� �����ؾ� �Ѵ�.
	 */
	
	public static void main(String[] args) {
		
			
		testPokemon(new Pikachu());
		testPokemon(new LongStone());

	}

	// Pokemon Ŭ������ ��ӹ��� ��� �ν��Ͻ��� �Ű������� ���� �� �ִ� �޼���
	
	public static void testPokemon(Pokemon p) {
		p.skill1();
		p.skill2();
	}
	
	
	
//	public static void testPokemon(Pikachu p) {
//		p.skill1();
//		p.skill2();
//	}
//	public static void testPokemon(LongStone stone) {
//		stone.skill1();
//		stone.skill2();
//	}
//}

abstract class Pokemon {
	
	abstract void skill1();
	abstract void skill2();

}

class Pikachu extends Pokemon{

	@Override
	void skill1() {
		System.out.println("�����ġ��");
		
	}

	@Override
	void skill2() {
		System.out.println("�鸸��Ʈ");
		
	}
	
}
class LongStone extends Pokemon{
	
	@Override
	void skill1() {
		System.out.println("�����ġ��");
		
	}
	
	@Override
	void skill2() {
		System.out.println("�鸸��Ʈ");
		
	}
	
}
}