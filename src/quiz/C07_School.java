package quiz;

import quiz.Machine;
import quiz.Network;
import quiz.Programing;
import quiz.Student;

public class C07_School {

	/*
 		1. �� ���� ������ 30���̴�.
 		
 		2-1. ���α׷��� �� �л����� ������ ����,����, ����, ���α׷��� ���, �˰���, �ڷᱸ�� ������ �ִ�.
 		
 		2-2. ��Ʈ��ũ �� �л����� ������ ����,����, ������, ��Ʈ��ũ, CCNA ������ �ִ�.
 		
 		2-3. �ӽŷ��� �� �л����� ������ ����,����,����, �����, ���α׷� ��� ����
 		
 		3.��� �л��� ������ �̸��� �������� ����.
 		  �й��� �ߺ����� ���������� �����Ǿ�� �Ѵ�.(�Ǵ� �ߺ����� ������ ����)
 		  
 		4. ����ǥ �޼��带 ���� �� �л��� �̸�/����/��������� �� �� �־�� �Ѵ�.

	 */
	
	public static void main(String[] args) {
		
		String[] name = new String[] {"�ϳ�", "��", "��", "��", "�ټ�", "����", "�ϰ�", "����", "��ȩ", "��"};
		String[] fName = new String[] {"��", "��", "��", "��", "��", "��","��", "��", "��", "��"};
		
		Student[] pg = new Programing[30];
		Student[] nw = new Network[30];
		Student[] mr = new Machine[30];
		
		
		for(int i = 0; i < 30; i ++) {
			int rn = name.length;
			int rn2 = fName.length;
			String fullName = fName[rn2] + name[rn];
			pg[i] = new Programing(fullName, i+1);
		}
		for(int i = 0; i < 30; i ++) {
			int rn = name.length;
			int rn2 = fName.length;;
			String fullName = fName[rn2] + name[rn];
			nw[i] = new Network(fullName, i+31);
		}
		for(int i = 0; i < 30; i ++) {
			int rn = name.length;
			int rn2 = fName.length;
			String fullName = fName[rn2] + name[rn];
			mr[i] = new Machine(fullName, i+61);
		}
		
		for(int i= 0; i<30; i++) {
			pg[i].info();
			System.out.println("========================================");
			nw[i].info();
			System.out.println("========================================");
			mr[i].info();
			System.out.println("========================================");
		}
	
	}
}
