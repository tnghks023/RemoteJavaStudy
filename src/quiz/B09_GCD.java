package quiz;

import java.util.Scanner;

public class B09_GCD {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("1��° ���� �Է�: ");
		int firstN = sc.nextInt();
		System.out.print("2��° ���� �Է�: ");
		int secondN = sc.nextInt();
		int gcd = 0;
		int min = 0;
		if (firstN < secondN) {
			min = firstN;
		}
		
		for (int j = 1; j <= min; j++) {
			if(secondN % j ==0 && firstN % j == 0) {
					gcd = j;
			}
		}
		System.out.println(gcd);

	}

}
