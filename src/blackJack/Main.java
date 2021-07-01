package blackJack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Card card = new Card();	
		Gamer dealer = new Gamer();
		Gamer player = new Gamer();
		String[] pC;
		boolean standCheckPlayer = false;
		boolean standCheckDealer = false;

		System.out.println("������ �̽��ϴ�.");
		pC = pickCard(card);
		dealer.Count(pC[0], pC[1]);
		pC = card.pick();		
		dealer.Count(pC[0], pC[1]);

		System.out.println("�÷��̾ �̽��ϴ�.");
		pC = pickCard(card);
		player.Count(pC[0], pC[1]);
		pC = pickCard(card);
		player.Count(pC[0], pC[1]);

		while (true) {
			System.out.println("HIT or STAND");
			String choose = sc.next();

			if(choose.toLowerCase().charAt(0) == 'h') {
				pC = pickCard(card);
				player.Count(pC[0], pC[1]);
				if( player.sum > 21) {
					break;
				}
			} else if(choose.toLowerCase().charAt(0) == 's'){
				System.out.println("�÷��̾ STAND �մϴ�.");
				standCheckPlayer = true;
			}

			if((dealer.sum > 16) || (dealer.aCheck && (dealer.sum + 10) > 16)) {
				System.out.println("������ STAND �մϴ�.");
				standCheckDealer = true;
			} else {
				System.out.println("������ HIT �մϴ�.");
				pC =  card.pick();
				dealer.Count(card.pick()[0], card.pick()[1]);
			}

			if(standCheckDealer && standCheckPlayer) {
				break;
			}
		}		
		System.out.println("�÷��̾��� ī��: " + player.haveNum);
		if(player.sum + 10 < 22 && player.aCheck) {
			dealer.sum += 10;
		} 
		if (player.sum + 10 < 22 && player.aCheck2) {
			player.sum += 10;
		}
		System.out.println("�÷��̾��� ��: " + player.sum );

		System.out.println("������ ī��: " + dealer.haveNum);
		if(dealer.sum + 10 < 22 && dealer.aCheck) {
			dealer.sum += 10;
		}
		if (dealer.sum + 10 < 22 && dealer.aCheck2) {
			dealer.sum += 10;
		}
		System.out.println("���� ��: " + dealer.sum );

		if(player.sum > 21) {
			System.out.println("���� ��");
		} else if (dealer.sum > 21) {
			System.out.println("�÷��̾� ��");
		} else if (player.sum > dealer.sum) {
			System.out.println("�÷��̾� ��");
		} else {
			System.out.println("���� ��");
		}

	} // end main

	public static String[] pickCard(Card card) {
		String[] pC = card.pick();
		System.out.println(pC[0] + " " + pC[1]);
		return pC;
	}
}
