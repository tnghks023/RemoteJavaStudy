package quiz;

import java.util.Scanner;

public class B05_ForBasicQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력: ");
		int num = sc.nextInt();
		int sum = 0;
		if(num > 10) {
			for(int i = 10 ; i <= num ; i ++) {
				sum += i;
			}
		} else {
			for(int i = num ; i <= 10 ; i++) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		System.out.println("=========================================");
		
		if(num < 0) {
		
		} else if(num > 1000) {
			for(int i = 1000 ; i <= num ; i ++) {
				System.out.println(i);
			}
		} else {
			for(int i = 1000 ; i >= num ; i--) {
				System.out.println(i);
			}
		}
		
		System.out.println("=========================================");
		
		for( int i = 1 ; i <= num ; i++) {
			if(i % 5== 0) {
				System.out.println(i);
			}
		}
		
		

		
		
		
		
		
		
		
	}// end main

}
