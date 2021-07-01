package myobj.school;

public class MachineStudent extends Student {

	int math;
	int statics;
	int pl;
	
	public MachineStudent() {
		super();
		math = generateRandomScore();
		statics = generateRandomScore();
		pl = generateRandomScore();
		
		
	}
	int getSum() {
		return (kor + eng + math + statics+ pl);
	}
	
	
	double getAverage() {
		return getSum() / 5.0;
	}
	
	@Override
	public void printGradeCard() {
		System.out.println("이름: " + name);
		System.out.println("국어\t영어\t수학\t통계학\t프로그래밍 언어\tpl");
		System.out.printf("%d\t%d\t%d\t%d\t%d\n", kor, eng, math, statics, pl);
	}

}
