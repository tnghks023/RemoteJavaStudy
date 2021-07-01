package quiz.poker;

import java.util.*;

public class Poker {
	
	ArrayList<Card> table;
	Cards cards;
	Scanner sc;
	
	
	public void newGame() {
		sc = new Scanner(System.in);
		table = new ArrayList<>();
		cards = new Cards();
		
		Player p1 = new Player();
		Player p2 = new Player();
		
		p1.add(cards.next());
		p2.add(cards.next());
		
		p1.add(cards.next());
		p2.add(cards.next());
		
		System.out.println("첫번째 플레이어 카드: " + p1);
		System.out.println("두번째 플레이어 카드: " + p2);
		
		for(int i = 0; i < 5; i++) {
		table.add(cards.next());
		}
		
		System.out.println("공동카드: " + table);
		
		p1.pick(table);
		p1.calc();
		
		p2.pick(table);
		p2.calc();
		
		System.out.println("첫번쨰 플레이어: " + p1.hand+" 조합 결과: "+p1.valueStr);
		System.out.println("두번쨰 플레이어: " + p2.hand+" 조합 결과: "+p2.valueStr);
		
		win(p1, p2);
		
	}
	
	void win(Player p1, Player p2) {
		if(p1.value > p2.value) {
			System.out.println("첫번쨰 플레이어 승리");
		} else if(p1.value < p2.value) {
			System.out.println("두번째 플레이어 승리");
		} else {
			int a = p1.kicker - p2.kicker;
			if(a > 0) {
				System.out.println("첫번쨰 플레이어 승리");
			} else if (a < 0){
				System.out.println("두번째 플레이어 승리");
			} else {
				System.out.println("무승부");
			}
		}
	}

	

	public static void main(String[] args) {
		new Poker().newGame();
	}

}
