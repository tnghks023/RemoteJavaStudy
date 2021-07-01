
public class C01_Function {

	/*
			# �Լ� (Function)
			 - ����� �̸� �����صΰ� ���߿� ������ ���� ��
			 - ������ ���������� ������� �ʰ�, �Լ� �̸� �ڿ� ()�� �ٿ��� �Լ��� ȣ���ϸ� ����ȴ�. 
			 - ���߿� ������ ���ɼ��� �ִ� ��ɵ��� �̸� ���������ν� �۾��� �ݺ��� ���� �� �ִ�.
			 - �ڹٿ��� �Լ�(�޼���)�� �ݵ�� Ŭ���� ���ο� �����ؾ� �Ѵ�.
			 
			# �Լ��� ����(return)
			 - �Լ��� ���� �� �� �Լ��� �տ� �ش� �Լ��� ��ȯ�ϴ� ���� Ÿ���� ���´�.
			 - �Լ��� ȣ���ϸ� ȣ���� �ڸ��� �Լ��� ���� ����� ��ȯ(return)�ȴ�
			 - ����Ÿ�� void�� �ش� �Լ��� ��ȯ�ϴ� ���� ���ٴ� ���� �ǹ��ϴ� ��ȯ Ÿ�Դϴ�.
			 
			# �Լ��� �Ű����� (arguments)
			 - �Լ��� ȣ���� �� ()�ȿ� �����ϴ� ���� ���ڶ�� �Ѵ�.
			 - �Լ��� ������ �� ()�ȿ� ���ڸ� ���� �� �ִ� �������� �����ϴµ�, �̸� �Ű�������� �Ѵ�.
	 */
	public static void main(String[] args) {

		printRabbit();
		
		System.out.println(appleBasket(31, 10));

	}

	public static void printRabbit() {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(  >��)");
	}
	
	public static int appleBasket(int apple, int size) {
		int basket = apple % size == 0 ? apple / size: apple /size +1;
		return basket;
	}
	 
}
