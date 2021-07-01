package quiz;

import java.util.Scanner;

public class B11_CountRandomFruit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력: ");
		int num = sc.nextInt();
		int[] fruit_count = new int[6];
		String[] fruits = {"apple", "banana", "kiwi", "orange", "grape", "peach"};
		for(int i =1; i<=num; i++) {
			int randomNum = (int)(Math.random() * 6);			
			System.out.println(fruits[randomNum]);
			fruit_count[randomNum]++;
		}
	

}
}
