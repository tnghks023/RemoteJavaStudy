package quiz;

import java.util.Scanner;

public class A10_ConditionQuiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char a = 0;
		char b = 0;
		char c = 0;
		char d = 0;
		char e = 0;
		char f = 0;
		
		System.out.println(a == 'Q' || a == 'q');
		System.out.println(b != ' ' || b != '	');
		System.out.println(c >= 48 && c <= 57);
		System.out.println(d >= 'A' && d <='Z' || d >='a' && d <= 'z');
		System.out.println(e >= 44032 && e <= 55215);
		System.out.println(f >= 12448 && f <= 12543);
		
		System.out.print("문자 입력: ");
		String iP = sc.next();
		
		System.out.println(iP.equals("exit"));
		
		
	}
}
