package quiz;

import java.util.Scanner;

public class A06_GuessAge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("태어난 해 입력 :  ");
		int birth_year = sc.nextInt();
		System.out.print("올해의 년도 :  ");
		int this_year = sc.nextInt();
		System.out.println("나이: " + (this_year - birth_year + 1));
		sc.close();
		
	}
}
