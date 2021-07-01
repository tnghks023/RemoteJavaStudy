
public class C05_Inherit {

	/*
		# Ŭ���� ���
		 - ������ �̸� ����� �״� Ŭ������ �״�� �����޾Ƽ� ����ϴ� ��
		 - �������� �Ŀ��� �ش� Ŭ������ ������� ���ļ� ����� �� �ִ�. (�������̵�)
		 - ������ �����ϸ鼭 ���Ӱ� �����غ� �� �ִ� ���� �����̴�.
		 - ��ӹ޴� Ŭ������ �ڽ� Ŭ���� �Ǵ� ���� Ŭ������� �θ���
		 - ������ִ� Ŭ������ �θ� Ŭ���� �Ǵ� ���� Ŭ������� �θ���.
		 
		# ����� ��Ģ
		 - extends��� Ű���� ���
		 - �����ڿ��� �ݵ�� ���� ���� �θ� Ŭ������ �����ڸ� ȣ���ؾ���.
		 - �θ� Ŭ������ �ڽ� Ŭ������ �Ȱ��� �̸��� ���� �ڿ��� �ִ� ��쿡�� super�� this�� ��Ȯ�ϰ� ������ �� �ִ�.
		 - super()�� �θ��� �����ڸ�  ���Ѵ�. 
	 */
	
	
	public static void main(String[] args) {
	
		Person gildong = new Person("��浿", 42);

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
