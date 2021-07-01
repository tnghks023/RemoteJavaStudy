package quiz;

import java.util.Scanner;

public class B07_Prime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자(양수) 입력: ");

		int num = 0;
		
		for(;num < 2;) {
			num = sc.nextInt();
			if (num <= 0) {
				System.out.print("숫자 다시입력: ");
			} else {
				break;
			}
		}
		boolean prime = true;
		System.out.println("2");
		for (int i = 3; i <= num ; i+=2) {
			
			for (int j = 2; j <= Math.sqrt(i) ; j++) {
				if( i % j ==0) {
					prime = false;
				}
			}
			
			if(prime) {
				System.out.print(i+" ");
			}
		}
		
	}

}
