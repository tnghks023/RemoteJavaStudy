package quiz;

import java.util.Scanner;

public class B01_AppleQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ϰ� ���� ����� ����: ");
		
		int apple = sc.nextInt();
		
		//Math.ceil(a) : a�� �Ҽ� ù° �ڸ����� �ø���.
		//Math.floor(a) : a�� �Ҽ� ù° �ڸ����� ������
		System.out.println( "�ٱ��ϰ� "+ (Math.ceil(apple/10)) +"�� �ʿ��մϴ�.");
		
				
	}

}