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
		System.out.println("�̸�: " + name);
		System.out.println("����\t����\t����\t�����\t���α׷��� ���\tpl");
		System.out.printf("%d\t%d\t%d\t%d\t%d\n", kor, eng, math, statics, pl);
	}

}
