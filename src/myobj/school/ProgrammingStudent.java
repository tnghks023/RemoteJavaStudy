package myobj.school;

public class ProgrammingStudent extends Student {

	
	int math;
	int pl;
	int al;
	int ds;
	
	public ProgrammingStudent() {
		super();
		math = generateRandomScore();
		pl = generateRandomScore();
		al = generateRandomScore();
		ds = generateRandomScore();
		
		
	}
	int getSum() {
		return (kor + eng + math + pl + al + ds);
	}
	
	
	double getAverage() {
		return getSum() / 6.0;
	}
	
	@Override
	public void printGradeCard() {
		System.out.println("이름: " + name);
		System.out.println("국어\t영어\t수학\t프로그래밍\t알고리즘\t자료구조");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\n", kor, eng, math, pl, al, ds);
	}

}
