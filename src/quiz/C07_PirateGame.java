package quiz;

import java.util.Scanner;

public class C07_PirateGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("구멍 개수 입력: ");
		int holeNum = sc.nextInt();
		System.out.printf("몇명에서 플레이(최소2명, 최대 %d명): ", holeNum);
		int peopleNum = sc.nextInt();

		People[] p1 = new People[peopleNum];

		for(int i = 0; i< peopleNum ; i++) {
			p1[i] = new People(i);
		}
		FailHole fh1 = new FailHole(holeNum);	
		
		int playerNum = 0;
		boolean check = false;
		
		while(true) {
			if (playerNum >= peopleNum) {
				playerNum = 0;
			}
			System.out.printf("%d플레이어 숫자입력: ", p1[playerNum].num);
			int answer = sc.nextInt();
			for(int i =0 ; i < fh1.failHoleNum; i++) {
				if( answer == fh1.failHole[i]) {
					check = true;
				}
			}
			if(check) {
				System.out.printf("%d플레이어 패배\n", p1[playerNum].num);
				break;
			} else {
				System.out.printf("%d플레이어 통과\n", p1[playerNum].num);
			}
			playerNum++;
		}
	}
}
