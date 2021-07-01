package quiz;

import java.util.Scanner;

public class C07_PirateGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� ���� �Է�: ");
		int holeNum = sc.nextInt();
		System.out.printf("����� �÷���(�ּ�2��, �ִ� %d��): ", holeNum);
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
			System.out.printf("%d�÷��̾� �����Է�: ", p1[playerNum].num);
			int answer = sc.nextInt();
			for(int i =0 ; i < fh1.failHoleNum; i++) {
				if( answer == fh1.failHole[i]) {
					check = true;
				}
			}
			if(check) {
				System.out.printf("%d�÷��̾� �й�\n", p1[playerNum].num);
				break;
			} else {
				System.out.printf("%d�÷��̾� ���\n", p1[playerNum].num);
			}
			playerNum++;
		}
	}
}
