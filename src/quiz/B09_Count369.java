package quiz;

import java.util.Scanner;

public class B09_Count369 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력: ");
		int num = sc.nextInt();
		int cnt =  0;
		for ( int i = 1; i <= num ; i++) {
			int remain = i;
			int quotient = i;
			while(quotient > 1) {
				remain = quotient % 10;
				if(remain % 3 ==0 && remain != 0) {
					cnt++;
				}
				quotient /=10;
			}
		}
		System.out.println(cnt);
		

	}

}
