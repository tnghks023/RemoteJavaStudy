package quiz.exception;

import java.util.Scanner;

public class C17_InputRightPassword {

	/*
		# 올바른 패스워드를 만들기 위한 규칙
		 1. 모두 숫자이면 안됨
		 2. 대문자와 소문자 숫자 특수문자가 섞여있어야 함
		 3. 특수문자는 ! @ # $ % ^  & * 만 사용 가능
		 4. 비밇번호의 길이가 8자리 이상 24자리 이하여야 함
		  위의 규을 어긴 경우 예외를  발생시켜 알맞은 안내 문구를 출력해 보세요
	 */
	public static void main(String[] args) {

		System.out.print("비밀번호 입력: ");
		Scanner sc = new Scanner(System.in);
		String pw = sc.next();

		try {
			pwLengthCheck(pw);
			allNumCheck(pw);
			combineAndSpecialCheck(pw);
			System.out.println("비밀번호가 생성되었습니다.");
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



