package quiz;

import java.util.Scanner;

public class C16_InputRightThing {

	/*
		����ڷκ��� ���ڸ� �Է¹޵� ���ڸ� ����� �Է¹��� ������ ��� �Է¹޴� ���α׷��� ��������.
		(�ٸ� Ÿ���� ���� �ԷµǾ ���α׷� ����������� �ʾƾ���.)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		boolean check= false;

		while(true) {
			try {

				System.out.println("���� �Է�: ");
				num = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("������ �Է����� �ʾҽ��ϴ�.");
				sc.nextLine();

			}
		}
	}
}

