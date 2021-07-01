package quiz.dice;

import java.util.Scanner;

public class C07_FiveDice {
	/*
	 	랜덤으로 5개의 주사위를 굴린 다음에 주사위의 결과를 통해 다음을 구분하는 클래스를 만들기

		 	1. 풀하우스 : 같은 눈이 2개 + 3개 ( 11666/22333/55252)
		 	2. 스몰 스트레이트 : (1234/2345/3456) 
		 	3. 라지 스트레이트 : (12345/23456)
		 	4. 4다이스 : (같은 숫자 4개)
		 	5. 5다이스 (Yacht) : 같은숫자 5개
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dice dice = new Dice();
		int[] num = new int[5]; 
		dice.roll();
		System.out.println(dice);

		while(true) {
			pedigree();
			System.out.print("킵할 주사위 개수 선택(킵을안할려면 0입력): ");
			int dNum = sc.nextInt();
			if(dNum == 0) {
				break;
			}
			for(int i = 0 ; i < dNum ; i++) {
				System.out.print("킵할 주사위 번호: ");
				num[i] = sc.nextInt();
			}
			dice.chooseRoll(num);
			System.out.println(dice);
		}
		
		System.out.println(dice);
		dice.result();

	}

	public static void pedigree() {
		System.out.println("==================================================");
		System.out.println("1. 풀하우스 : 같은 눈이 2개 + 3개");
		System.out.println("2. 스몰 스트레이트 : 1234/2345/3456");
		System.out.println("3. 라지 스트레이트 : 12345/23456");
		System.out.println("4. 4다이스 : 같은 숫자 4개");
		System.out.println("5. 5다이스 (Yacht) : 같은숫자 5개");
		System.out.println("==================================================");
	}
}
