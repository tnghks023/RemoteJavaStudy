package quiz;

public class C02_OOP {

	/*
	 # 클래스
	  - 객체를 프로그래밍 언오로 표현한 것
	  - 클래스는 해당 객체의 설계도이다.
	  - 설계도대로 찍어내는 실제 객체를 '인스턴스'라고 부른다
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
