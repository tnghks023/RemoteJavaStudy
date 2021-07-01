
public class C04_Static {

	/*
		# static
		 - static 영역은 같은 클래스의 모든 인스턴스가 공동으로 사용하는 영역
		 - 앞에 static이 붙은 자원은 같은 클래스로 만들어진 모든 인스턴스가 공동으로 사용하는 자원이 된다.
		 - static 영역은 아무리 인스턴스가 많아도 클래스당 하나밖에 생성되지 않기 떄문에 메모리가 절약된다.
		 - static 영역은 클래스당 하나이기 떄문에 클래스 이름에 .을 찍고 접근하는 것이 가능하다 (권장)
		 - static이 붙은 자원은 인스턴스가 생기기 전에도 호출할 수 있다.
		 - static 메서드는 static 자원만을 활용할 수 있는 메서드이다.
		 - 인스턴스가 하나도 존재한지 않을 떄도 static 메서드가 사용될 가능성이 존재하기 떄문에 static 메서드에서는 인스턴스 자원을 사용할 수 없다.
		 
		
	 */
	
	public static void main(String[] args) {
		붕어빵 붕어1 = new 붕어빵();
		붕어빵 빵2 = new 붕어빵();
		붕어빵 붕어빵3 = new 붕어빵();
		
	}
	
}

class 붕어빵 {
	static int 가로 = 100;
	static int 세로 = 50;
	int 팥의양;
	int 구운시간;
	
	static void 완벽한시간변경하기(int time) {

	}
}
