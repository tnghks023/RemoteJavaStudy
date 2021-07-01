package myobj.pirate;

public class MrTong {
	
	// true: �ش� ������ ���� ����
	// false: �ش� ������ ���� ����
	boolean[] stabbed;
	boolean[] launch;
	
	boolean launched;
	
	public MrTong(int size) {
		stabbed = new boolean[size];
		launch = new boolean[size];
		//���� 1~4�� ����
		
		for (int i = 0; i < 4 ;i++) {
			launch[(int)(Math.random() * size)] = true;
		}
		
	}
	
	// �̹� �� ���̶�� false, ��� �� �񷵴ٸ� true
	public boolean stab(int index) {
		if (stabbed[index]) {
			return false;
		} else {
			stabbed[index] = true;
			launched = launch[index];
			return true;

		}
	}

	public boolean[] getStabbed() {
		return stabbed;
	}
	
}
