package quiz;

public class C02_OOP {

	/*
	 # Ŭ����
	  - ��ü�� ���α׷��� ����� ǥ���� ��
	  - Ŭ������ �ش� ��ü�� ���赵�̴�.
	  - ���赵��� ���� ���� ��ü�� '�ν��Ͻ�'��� �θ���
	 */

	public static void main(String[] args) {

		Apple a1 = new Apple();


	}

}

class Apple {
	int size;
	double sweet;
	String color;
	int calorie;

	void eat() {
		size--;
		calorie -= 10;
	}
}

class SmartPhone {

	double batterySize;
	double remainRam;
	double memoryCapacity;
	
	void actYoutube() {
		batterySize--;
		remainRam--;
	}
	void downloadApp() {
		remainRam--;
		batterySize--;
		memoryCapacity--;
	}
}
