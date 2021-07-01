package myobj.school;

abstract public class Student {
	
	static String[] lastNameArray = {};
	static String[] firstNameArray = {};
	
	static int generateRandomScore() {
		return (int)(Math.random() * 101);
	}
	
	
	String name;
	int kor;
	int eng;
	
	static String generateRandomName() {
		return lastNameArray[(int)(Math.random()*lastNameArray.length)] + firstNameArray[(int)(Math.random()*firstNameArray.length)];
	}
	
	public Student() {
		name = generateRandomName();
		kor = generateRandomScore();
		eng = generateRandomScore();
	}
	
	abstract public void printGradeCard();
	
	public String getName() {
		return name;
	}
}
