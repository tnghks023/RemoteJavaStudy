package myinterface;

public class Main {

	public static void main(String[] args) {
		text(new Bicycle());
	}
	
	public static void text(Vehicle vehicle) {
		
		for(int i = 0; i < 100; i++) {
			System.out.println("�ӵ��� �� �½��ϴ�.");
			System.out.println("���� �ӵ��� " + vehicle.acceleration() + "km/h");
		}
		
		
		System.out.println("�������� �ӵ��� �����մϴ�.");
		for(int i = 0; i < 30; i++) {
			System.out.println("���� �ӵ��� " + vehicle.deceleration() + "km/h");
		}
		
		for(int i =0; i<15; i++) {
			if(!vehicle.ride()) {
				System.out.println("�� �̻� Ż �� �����ϴ�.");
			} else {
				System.out.println("�Ѹ��� �� �����ϴ�.");
			}
		}
	}
}
