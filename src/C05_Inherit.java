
public class C05_Inherit {

	/*
		# 클래스 상속
		 - 예전에 미리 만들어 뒀던 클래스르 그대로 물려받아서 사용하는 것
		 - 물려받은 후에는 해당 클래스를 마음대로 고쳐서 사용할 수 있다. (오버라이드)
		 - 원본을 보존하면서 새롭게 수정해볼 수 있는 것이 장점이다.
		 - 상속받는 클래스를 자식 클래스 또는 서브 클래스라고 부른다
		 - 상속해주는 클래스를 부모 클래스 또는 슈퍼 클래스라고 부른다.
		 
		# 상속의 규칙
		 - extends라는 키워드 사용
		 - 생성자에서 반드시 가장 먼저 부모 클래스의 생성자를 호출해야함.
		 - 부모 클래스와 자식 클래스에 똑같은 이름을 가진 자원이 있는 경우에는 super와 this로 명확하게 구분할 수 있다.
		 - super()는 부모의 생성자를  뜻한다. 
	 */
	
	
	public static void main(String[] args) {
	
		Person gildong = new Person("고길동", 42);

	}

}

class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void sayHi() {
		System.out.println(name + age);
	}
}

class Programmer extends Person {

	Programmer(String name, int age) {
		super(name, age);

	}
	
	void program(String to_program) {
		System.out.println(name + to_program);
	}
	
	void sayHi() {
		
	}
	
}
