package quiz;

public class Programing extends Student {
	
	int proLang;
	int algorism;
	int dataStruct;
	int math;
	int sum;
	
	public Programing(String name, int stuId) {
		super(name, stuId);
		this.proLang = (int)(Math.random() * 101);
		this.algorism = (int)(Math.random() * 101);
		this.dataStruct = (int)(Math.random() * 101);
		this.math = (int)(Math.random() * 101);
		this.sum = this.proLang + this.algorism + this.dataStruct + this.math + this.eng + this.kor;
		
	}

	@Override
	void info() {
		System.out.println("�̸�: " + this.name);
		System.out.println("����: " + this.sum);
		System.out.printf("�������: %.2f\n" ,this.sum / 6.0);
	}
	

}
