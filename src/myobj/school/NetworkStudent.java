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
		System.out.println("�̸�: " + name);
		System.out.println("����\t����\t����\t������\t��Ʈ��ũ\tCCNA");
		System.out.printf("%d\t%d\t%d\t%d\t%d\n", kor, eng, li, net, ccna);
	}

}
