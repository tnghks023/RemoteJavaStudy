package quiz;

abstract public class Student {

	String name;
	int kor;
	int eng;
	int stuId;
	
	public Student(String name, int stuId) {
		this.name = name;
		this.stuId = stuId;
		this.kor = (int)(Math.random() * 101);
		this.eng = (int)(Math.random() * 101);
	}
	abstract void info();
}
