package quiz;

import java.util.Scanner;

public class A06_GuessAge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�¾ �� �Է� :  ");
		int birth_year = sc.nextInt();
		System.out.print("������ �⵵ :  ");
		int this_year = sc.nextInt();
		System.out.println("����: " + (this_year - birth_year + 1));
		sc.close();
		
	}
}
