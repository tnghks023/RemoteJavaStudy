package quiz;

import java.util.Scanner;

public class B09_31Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int baskin = 0;
		double first = Math.random();
		int com = 0;
		if(first >= 0.5) {
			System.out.println("플레이어 선공");
			System.out.print("숫자입력: ");
			baskin +=sc.nextInt();
		} else {
			System.out.println("플레이어 후공");
			baskin += (int)(Math.random()*3 +1);			 
		}
		while(true) {
			baskin += (int)(Math.random()*3 +1);
			if( baskin >= 31) {
				System.out.println("플레이어 승");
				break;
			}
			System.out.println("현재 숫자: " + baskin);
			System.out.print("숫자입력: ");
			baskin +=sc.nextInt();
			if (baskin >= 31) {
				System.out.println("플레이어 패");
				break;
			}
			
			
		}

	}

}
