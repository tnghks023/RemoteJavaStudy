package quiz;

public class Network extends Student{

	int linux;
	int network;
	int ccna;
	int sum;

	public Network(String name, int stuId) {
		super(name, stuId);
		this.linux = (int)(Math.random() * 101);
		this.network = (int)(Math.random() * 101);
		this.ccna = (int)(Math.random() * 101);
		this.sum = this.linux + this.network + this.ccna + this.kor + this.eng;
	}

	@Override
	void info() {

		System.out.println("�̸�: " + this.name);
		System.out.println("����: " + this.sum);
		System.out.printf("�������: %.2f\n" ,this.sum / 5.0);
		
	}


}
