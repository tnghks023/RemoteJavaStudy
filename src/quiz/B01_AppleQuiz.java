package quiz;

import java.util.Scanner;

public class B01_AppleQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구매하고 싶은 사과의 개수: ");
		
		int apple = sc.nextInt();
		
		//Math.ceil(a) : a를 소수 첫째 자리에서 올린다.
		//Math.floor(a) : a를 소수 첫째 자리에서 내린다
		System.out.println( "바구니가 "+ (Math.ceil(apple/10)) +"개 필요합니다.");
		
				
	}

}