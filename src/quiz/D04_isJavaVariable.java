package quiz;

import java.util.Scanner;

public class D04_isJavaVariable {
	
	/*
		����ڷκ��� ���ڿ��� �Է¹����� �ش� ���ڿ��� �ڹ��� �����ν� ���� �� �ִ��� 
		�˻��ϴ� �޼��带 ����� �׽�Ʈ�غ�����.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է�: ");
		String str = sc.next();
		boolean check = true;
		for(int i =0; i< str.length() ; i++) {
			char ch = str.charAt(i);
			if(i==0 && (ch >= '0' && ch <= '9')) {
				check = false;
				break;
			}
			if (!((ch >= 'A' && ch <= 'Z' )|| (ch >= 'a' && ch <= 'z') || ch== '_' || ch=='$' || (ch >= '0' && ch <= '9'))) {
				check = false;
				break;
			}
		}
		
		if(check) {
			System.out.println("����");
		} else {
			System.out.println("�Ұ���");
		}
	}
}
