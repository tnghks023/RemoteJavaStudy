
public class Constructor {

	/*
		# Ŭ������ ������ (Constructor)
		 - Ŭ������ �̸��� �Ȱ��� �̸��� �޼���
		 - �޼������� ���� Ÿ�Ԥ��� �������� �ʴ´�
		 - �ν��Ͻ��� ������ �� new�� �Բ� ���ȴ�.
	 */
	
	public static void main(String[] args) {
		
	Orange o1 = new Orange();	

	}

}

class Orange{

	int[] color;
	double sweet;
	String address;
	
	public Orange() {
		color = new int[] {255,255,0};
		sweet = 10.0;
		address = "���ֵ�";

	}
}