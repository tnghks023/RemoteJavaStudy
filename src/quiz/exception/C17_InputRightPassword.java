package quiz.exception;

import java.util.Scanner;

public class C17_InputRightPassword {

	/*
		# �ùٸ� �н����带 ����� ���� ��Ģ
		 1. ��� �����̸� �ȵ�
		 2. �빮�ڿ� �ҹ��� ���� Ư�����ڰ� �����־�� ��
		 3. Ư�����ڴ� ! @ # $ % ^  & * �� ��� ����
		 4. ��E��ȣ�� ���̰� 8�ڸ� �̻� 24�ڸ� ���Ͽ��� ��
		  ���� ���� ��� ��� ���ܸ�  �߻����� �˸��� �ȳ� ������ ����� ������
	 */
	public static void main(String[] args) {

		System.out.print("��й�ȣ �Է�: ");
		Scanner sc = new Scanner(System.in);
		String pw = sc.next();

		try {
			pwLengthCheck(pw);
			allNumCheck(pw);
			combineAndSpecialCheck(pw);
			System.out.println("��й�ȣ�� �����Ǿ����ϴ�.");
		} catch (PasswordLengthException e) {
			e.printStackTrace();
		} catch (AllNumberException e) {
			e.printStackTrace();
		} catch (SpecialSymbolException e) {
			e.printStackTrace();
		} catch (UpperLowerConbineException e) {
			e.printStackTrace();
		}

	}



	public static void allNumCheck(String pw) throws AllNumberException {
		boolean[] numCheck = new boolean[pw.length()]; 
		int cnt = 0;
		for(int i = 0; i < pw.length() ; i++) {
			if(pw.charAt(i) >=48 && pw.charAt(i) <= 57) {
				cnt++;
			}
		}

		if(cnt == pw.length()) {
			throw new AllNumberException();
		}
	}

	public static void combineAndSpecialCheck(String pw) throws UpperLowerConbineException, SpecialSymbolException {
		boolean[] combineCheck = new boolean[5];
		for(int i = 0; i < pw.length() ; i++) {
			char pwc = pw.charAt(i);
			if(pwc >= 97 && pwc <= 122) {
				combineCheck[0] = true;
			} else if (pwc >= 65 && pwc <=90) {
				combineCheck[1] = true;
			} else if (pwc >=48 && pwc <= 57) {
				combineCheck[2] = true;
			} else if ((pwc >= 33 && pwc <= 38 )|| pwc == 64 || pwc == 94) {
				combineCheck[3] = true;
			} else {
				combineCheck[4] = true;
			}
		}

		if(combineCheck[0] && combineCheck[1] && combineCheck[2] && combineCheck[3]) {

		} else if(combineCheck[4]) {
			throw new SpecialSymbolException();
		} else {
			throw new UpperLowerConbineException();
		}

	}


	public static void pwLengthCheck(String pw) throws PasswordLengthException {

		if(pw.length() > 24 || pw.length() < 8) {
			throw new PasswordLengthException();
		}


	}
}



