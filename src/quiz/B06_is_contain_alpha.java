package quiz;

import java.util.Scanner;

public class B06_is_contain_alpha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		String str = sc.next();
		char str_char;
		boolean check = false;
		for(int i = 0; i < str.length(); i++) {
			str_char = str.charAt(i);
			if ( str_char >= 'A' && str_char <='Z' || str_char >= 'a' && str_char <='z') {
				check = true;
				break;
			}
		}
		
		System.out.println(check);
	}

}
