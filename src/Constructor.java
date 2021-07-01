
public class Constructor {

	/*
		# 클래스의 생성자 (Constructor)
		 - 클래스의 이름과 똑같은 이름의 메서드
		 - 메서드지만 리턴 타입ㅁ을 정의하지 않는다
		 - 인스턴스를 생성할 때 new와 함께 사용된다.
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
		address = "제주도";

	}
}