package quiz.dice;

import java.util.Scanner;

public class C07_FiveDice {
	/*
	 	�������� 5���� �ֻ����� ���� ������ �ֻ����� ����� ���� ������ �����ϴ� Ŭ������ �����

		 	1. Ǯ�Ͽ콺 : ���� ���� 2�� + 3�� ( 11666/22333/55252)
		 	2. ���� ��Ʈ����Ʈ : (1234/2345/3456) 
		 	3. ���� ��Ʈ����Ʈ : (12345/23456)
		 	4. 4���̽� : (���� ���� 4��)
		 	5. 5���̽� (Yacht) : �������� 5��
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dice dice = new Dice();
		int[] num = new int[5]; 
		dice.roll();
		System.out.println(dice);

		while(true) {
			pedigree();
			System.out.print("ŵ�� �ֻ��� ���� ����(ŵ�����ҷ��� 0�Է�): ");
			int dNum = sc.nextInt();
			if(dNum == 0) {
				break;
			}
			for(int i = 0 ; i < dNum ; i++) {
				System.out.print("ŵ�� �ֻ��� ��ȣ: ");
				num[i] = sc.nextInt();
			}
			dice.chooseRoll(num);
			System.out.println(dice);
		}
		
		System.out.println(dice);
		dice.result();

	}

	public static void pedigree() {
		System.out.println("==================================================");
		System.out.println("1. Ǯ�Ͽ콺 : ���� ���� 2�� + 3��");
		System.out.println("2. ���� ��Ʈ����Ʈ : 1234/2345/3456");
		System.out.println("3. ���� ��Ʈ����Ʈ : 12345/23456");
		System.out.println("4. 4���̽� : ���� ���� 4��");
		System.out.println("5. 5���̽� (Yacht) : �������� 5��");
		System.out.println("==================================================");
	}
}
