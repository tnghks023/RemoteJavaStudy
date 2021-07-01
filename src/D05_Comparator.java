import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class D05_Comparator {

	/*
		# Comparable
		 - �� �������̽��� ������ Ŭ������ ���� ũ�Ⱑ �� ������ Ŭ������ �ȴ�.
		 - �� �������̽��� ������ Ŭ������ Collections�� ���� ����� �̿��� �� �ִ�.

		# Comparator
		 - �� �������̽��� ������ Ŭ������ ���� �������� ���ȴ�. 
	 */
	public static void main(String[] args) {
		Snack s1 = new Snack("��Ϲ���Ĩ", "�Ե�", "��Ϲ��͸�", 600, 2000);
		Snack s2 = new Snack("�����۽�", "��ȭ", "���ĸ�", 800, 2000);
		Snack s3 = new Snack("ĭ��", "�Ե�", "����", 250, 1000);
		Snack s4 = new Snack("Ȩ����", "LG��Ȱ�ǰ�", "����", 359, 1750);
		Snack s5 = new Snack("����ƽ", "KG", "���ڸ�", 700, 1200);
		Snack s6 = new Snack("��īĨ", "������", "���ڸ�", 210, 1000);
		Snack s7 = new Snack("�ٳ���ű", "���", "�ٳ�����", 200, 680);
		Snack s8 = new Snack("���ĸ�", "���", "���ĸ�", 300, 1500);

		ArrayList<Snack> snacks = new ArrayList<>();

		Collections.addAll(snacks, s1,s2,s3,s4,s5,s6,s7,s8);
		System.out.println(snacks);

//		Collections.sort(snacks, new ����������());
//		System.out.println(snacks);
//
//		Collections.sort(snacks, new ���ںз���());
//		System.out.println(snacks);
//
//		Comparator<Snack> reversed_���ںз��� = Collections.reverseOrder(new ���ںз���());
//
//		Collections.sort(snacks, reversed_���ںз���);
//		System.out.println(snacks);
//		
		Collections.sort(snacks);
		System.out.println(snacks);
		
		Collections.sort(snacks, new ����������());
		System.out.println(snacks);
	}
}

class Snack implements Comparable<Snack> {
	String name;
	String company;
	String taste;
	int calorie;
	int price;

	public Snack(String name, String company, String taste, int calorie, int price) {
		super();
		this.name = name;
		this.company = company;
		this.taste = taste;
		this.calorie = calorie;
		this.price = price;
	}	

	public String toString() {

		return String.format("%s/%s/%s/%dkcal/%d��", name, company, taste, calorie, price);
	}

	public int compareTo(Snack o) {
		
		if(this.price > o.price) {
			return 1;
		} else if( this.price < o.price) {
			return -1;
		} else {
			return this.name.compareTo(o.name);
		}
	}
}


class ���ںз��� implements Comparator<Snack> {

	public int compare(Snack o1, Snack o2) {
		if(o1.calorie >o2.calorie) {
			return 1;
		} else if (o1.calorie< o2.calorie) {
			return -1;
		} else {
			return 0;
		}
	}
}

class ���������� implements Comparator<Snack> {

	/*
		 # compare ��Ģ
		�� ���� �ڸ��� �ٲٰ� ������ 1�� ����
		�� ���� �ڸ��� �ٲٰ� �ʰ� ������ -1 ����
		�� ���� ���� ���� ���̶�� 0�� ����
	 */

	@Override
	public int compare(Snack o1, Snack o2) {
		if(o1.price >o2.price) {
			return 1;
		} else if (o1.price < o2.price) {
			return -1;
		} else {
			return 0;
		}
	}
}

class ���������� implements Comparator<Snack> {

	@Override
	public int compare(Snack o1, Snack o2) {
		
		int i = o1.company.compareTo(o2.company);
		if(i >0)  {
			return -1;
		} else if(i < 0) {
			return 1;
		} else {
			return o1.name.compareTo(o2.name);
		}
	}
}



