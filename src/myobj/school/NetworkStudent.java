package myobj.school;

public class NetworkStudent extends Student {

	int li;
	int net;
	int ccna;
	
	public NetworkStudent() {
		super();
		li = generateRandomScore();
		net = generateRandomScore();
		ccna = generateRandomScore();
		
		
	}
	int getSum() {
		return (kor + eng + li + net+ ccna);
	}
	
	
	double getAverage() {
		return getSum() / 5.0;
	}
	
	@Override
	public void printGradeCard() {
		System.out.println("이름: " + name);
		System.out.println("국어\t영어\t수학\t리눅스\t네트워크\tCCNA");
		System.out.printf("%d\t%d\t%d\t%d\t%d\n", kor, eng, li, net, ccna);
	}

}
