package quiz;

import java.util.Scanner;

public class B09_ConvertSecond {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է�: ");
		int inputS = sc.nextInt();
		
		int second = inputS % 60;
		int minute = inputS / 60 % 60 ;
		int hour = inputS / 60 / 60 % 24;
		int day = inputS / 60 / 60 / 24 % 365;
		int year = inputS / 60 / 60 / 24 / 365;
		
		boolean check = false;
		
		if(year != 0) {
			System.out.printf("%d�� ", year);
			check = true;
		}
		if ( day != 0 || check ) { 
			System.out.printf("%d�� ", day);
			check = true;
		}
		if ( hour != 0 || check ) {
			System.out.printf("%d�ð� ", hour);
			check = true;
		}
		if ( minute != 0 || check ) { 
			System.out.printf("%d�� ", minute);
			check = true;
		}
		if ( second != 0 || check ) {
			System.out.printf("%d�� ", second);
			check = true;
		}
	}
}
