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
		System.out.println("�̸�: " + name);
		System.out.println("����\t����\t����\t���α׷���\t�˰���\t�ڷᱸ��");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\n", kor, eng, math, pl, al, ds);
	}

}
