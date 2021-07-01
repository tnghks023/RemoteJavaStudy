package quiz;

import java.util.Scanner;

public class B06_is_contain_alpha3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		String str = sc.next();
		char str_char;
		boolean check = false;
		char strF = str.charAt(0);
		for(int i = 0; i < str.length(); i++) {
			str_char = str.charAt(i);
			if ( str_char >= 'a' && str_char <='z' || str_char >= '0' && str_char <= '9' || str_char=='_' || str_char == '$') {
				check = true;
			} else {
				check = false;
				break;
			}
		}
		
		if(strF >= '0' && strF <='9') {
			check = false;
		}
		
		System.out.println(check);


	}

}
