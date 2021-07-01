package quiz;

import java.util.Scanner;

public class C16_InputRightThing {

	/*
		사용자로부터 숫자를 입력받되 숫자를 제대로 입력받을 때까지 계속 입력받는 프로그램을 만들어보세요.
		(다른 타입의 값이 입력되어도 프로그램 강제종료되지 않아야함.)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		boolean check= false;

		while(true) {
			try {

				System.out.println("정수 입력: ");
				num = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("정수를 입력하지 않았습니다.");
				sc.nextLine();

			}
		}
	}
}

