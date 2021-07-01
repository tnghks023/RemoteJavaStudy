package quiz;

import java.util.Scanner;

public class A06_celToFahr {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¼·¾¾ ¿Âµµ ÀÔ·Â: ");
		Double degree = sc.nextDouble();
		
		System.out.println("È­¾¾ ¿Âµµ: " + (degree * 9 / 5.0 + 32));
	}

}
