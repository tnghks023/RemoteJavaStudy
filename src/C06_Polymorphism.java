
public class C06_Polymorphism {

	/*
		# 객체의 다형성
		 - 객체는 다양한 형태를 지닐 수 있다.
	 */
	
	public static void main(String[] args) {
		
		Fruit fruit01 = null;
		Pineapple pine01 = null;
		
		Fruit fruit = new Fruit();
		Pineapple pineapple = new Pineapple();

		fruit01 = fruit;
		fruit01 = pineapple; // 업캐스팅
		
		pine01 = pineapple;
//		pine01 = fruit; (X) 
		
		// 다운 캐스팅이 가능한 경우
		// 원래 자식 타입이었던 인스턴스가 업캐스팅 되어 있는경우
		
		pine01 = (Pineapple) fruit01; //다운 캐스팅
		
		
		Fruit f = new Pineapple();
		Fruit f2 = new DragonFruit();
		
		// 업캐스팅 된 상태에서 부모타입에도 존재하는 메서드를 사용하면 해당 메서드가 오버라이드 된 경우 오버라이드 되어있는 기능을 사용.
		f.eat(); // Pineapple이 실행됨
//		f.smash(); (X)
		
		// 업태스팅된 상태에서는 본래 클래스가 갖고있던 기능을 잠시 잊어버린다.
		// 원래 기능을 사용하기 위해서는 다운캐스팅이 필요하다.
		// 컴파일러는 다운캐스팅시 발생하는 문제점을 찾아주지 못한다.
		// ((pineappe)f2).smash();
		
		//instanceof 연산자를 통애 해당 인스턴스가 특정 클래스의 인스턴스인지를 검사할 수 있다.
		System.out.println("f가 Fruit이 될수 있는 인스턴스 인가요?"+(f instanceof Fruit));
	}

}

class Fruit {
	
	void eat() {
		System.out.println("과일 먹음");
	}
}
class Pineapple extends Fruit{
	
	void eat() {
		System.out.println("오버라이드 파인애플으 먹었습니다.");
	}
	void smash() {
		System.out.println("파인애플로 때림.");
	}
}
class DragonFruit extends Fruit{
	
	void eat() {
		System.out.println("오버라이드 용과 먹었습니다.");
	}
}
// 같은 패키지 내부에는 같은 이름의 클래스가 존재할 수 없다.