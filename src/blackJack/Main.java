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

		System.out.println("딜러가 뽑습니다.");
		pC = pickCard(card);
		dealer.Count(pC[0], pC[1]);
		pC = card.pick();		
		dealer.Count(pC[0], pC[1]);

		System.out.println("플레이어가 뽑습니다.");
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
				System.out.println("플레이어가 STAND 합니다.");
				standCheckPlayer = true;
			}

			if((dealer.sum > 16) || (dealer.aCheck && (dealer.sum + 10) > 16)) {
				System.out.println("딜러가 STAND 합니다.");
				standCheckDealer = true;
			} else {
				System.out.println("딜러가 HIT 합니다.");
				pC =  card.pick();
				dealer.Count(card.pick()[0], card.pick()[1]);
			}

			if(standCheckDealer && standCheckPlayer) {
				break;
			}
		}		
		System.out.println("플레이어의 카드: " + player.haveNum);
		if(player.sum + 10 < 22 && player.aCheck) {
			dealer.sum += 10;
		} 
		if (player.sum + 10 < 22 && player.aCheck2) {
			player.sum += 10;
		}
		System.out.println("플레이어의 합: " + player.sum );

		System.out.println("딜러의 카드: " + dealer.haveNum);
		if(dealer.sum + 10 < 22 && dealer.aCheck) {
			dealer.sum += 10;
		}
		if (dealer.sum + 10 < 22 && dealer.aCheck2) {
			dealer.sum += 10;
		}
		System.out.println("딜러 합: " + dealer.sum );

		if(player.sum > 21) {
			System.out.println("딜러 승");
		} else if (dealer.sum > 21) {
			System.out.println("플레이어 승");
		} else if (player.sum > dealer.sum) {
			System.out.println("플레이어 승");
		} else {
			System.out.println("딜러 승");
		}

	} // end main

	public static String[] pickCard(Card card) {
		String[] pC = card.pick();
		System.out.println(pC[0] + " " + pC[1]);
		return pC;
	}
}
