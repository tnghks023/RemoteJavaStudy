package quiz;

import java.util.Scanner;

public class D04_isJavaVariable {
	
	/*
		사용자로부터 문자열을 입력받으면 해당 문자열이 자바의 변수로써 사용될 수 있는지 
		검사하는 메서드를 만들고 테스트해보세요.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
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
			System.out.println("가능");
		} else {
			System.out.println("불가능");
		}
	}
}
