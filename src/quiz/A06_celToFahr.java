package quiz;

import java.util.Scanner;

public class A06_celToFahr {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �µ� �Է�: ");
		Double degree = sc.nextDouble();
		
		System.out.println("ȭ�� �µ�: " + (degree * 9 / 5.0 + 32));
	}

}
