package quiz;

import java.util.Scanner;

public class B09_31Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int baskin = 0;
		double first = Math.random();
		int com = 0;
		if(first >= 0.5) {
			System.out.println("�÷��̾� ����");
			System.out.print("�����Է�: ");
			baskin +=sc.nextInt();
		} else {
			System.out.println("�÷��̾� �İ�");
			baskin += (int)(Math.random()*3 +1);			 
		}
		while(true) {
			baskin += (int)(Math.random()*3 +1);
			if( baskin >= 31) {
				System.out.println("�÷��̾� ��");
				break;
			}
			System.out.println("���� ����: " + baskin);
			System.out.print("�����Է�: ");
			baskin +=sc.nextInt();
			if (baskin >= 31) {
				System.out.println("�÷��̾� ��");
				break;
			}
			
			
		}

	}

}
