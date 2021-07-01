
public class C08_AccessModifier {

	/*
		# 접근 제어자 (Access Modifier)
		 - 다른 클래스에서 해당 클래스의 자원을 사용하려고 할 때 허용 범위를 설정한다.
		 
		# 접근 제어자를 통해 설정할 수 있는 허용 범위
		 - private 같은 클래스 내부에서만 접근할 수 있는 자원
		 - default 같은 패키지 내부에서만 접근할 수 있는 자원
		 - protected 다른 패키지에서 상속받은 클래스에서만 접근할 수 있는 자원
		 - public 다른 패키지에서도 자유롭게 접근할 수 있는 자원
	 */
	
	
	public static void main(String[] args) {
		C08_ClassOfSamePackage instance = new C08_ClassOfSamePackage();
		
		
	}
}
