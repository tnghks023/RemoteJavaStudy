package quiz;

import java.util.Scanner;

public class D07_CheckValidPhoneNumber {

	/*
	 	����ڷκ��� �Է¹��� ���ڿ��� �ڵ��� ��ȣ���� �����ϴ� ���α׷�.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȭ��ȣ �Է�");
		String num = sc.nextLine();
		String[] numSplit = num.split("-");
		if(num.charAt(3) != '-' || num.charAt(8) != '-' || num.length() > 13) {
			System.out.println("�߸��Է� �߽��ϴ�.");
		} else if(numSplit[0] != "010" || numSplit[0] != "016" || numSplit[0] != "019"){
			System.out.println("��ȣ ���ڸ��� �߸� �Է��߽��ϴ�.");
		} else {
			num = num.replace("-", "");

			if(num.length() != 11) {
				System.out.println("��ȭ��ȣ ���̰� �߸��ƽ��ϴ�");
			} else {
				for(int i = 0; i < num.length() ; i++) {
					if( !(num.charAt(i) >= '0' && num.charAt(i) <= '9') ) {
						System.out.println("��ȣ�Է��� �߸��߽��ϴ�.");
						break;
					}
				}
				System.out.println("��ȭ��ȣ�� ����� �Էµƽ��ϴ�.");
			}
		}
	}

}
