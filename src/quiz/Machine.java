package quiz;

public class Machine extends Student {

	int math;
	int statics;
	int proLang;
	int sum;

	public Machine(String name, int stuId) {
		super(name, stuId);
		this.math = (int)(Math.random() * 101);
		this.statics = (int)(Math.random() * 101);
		this.proLang = (int)(Math.random() * 101);
		this.sum = this.math + this.statics + this.proLang + this.kor + this.eng;

	}

	@Override
	void info() {
		System.out.println("�̸�: " + this.name);
		System.out.println("����: " + this.sum);
		System.out.printf("�������: %.2f\n" ,this.sum / 5.0);
	}

}
