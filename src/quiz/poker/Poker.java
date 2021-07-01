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
		
		System.out.println("ù��° �÷��̾� ī��: " + p1);
		System.out.println("�ι�° �÷��̾� ī��: " + p2);
		
		for(int i = 0; i < 5; i++) {
		table.add(cards.next());
		}
		
		System.out.println("����ī��: " + table);
		
		p1.pick(table);
		p1.calc();
		
		p2.pick(table);
		p2.calc();
		
		System.out.println("ù���� �÷��̾�: " + p1.hand+" ���� ���: "+p1.valueStr);
		System.out.println("�ι��� �÷��̾�: " + p2.hand+" ���� ���: "+p2.valueStr);
		
		win(p1, p2);
		
	}
	
	void win(Player p1, Player p2) {
		if(p1.value > p2.value) {
			System.out.println("ù���� �÷��̾� �¸�");
		} else if(p1.value < p2.value) {
			System.out.println("�ι�° �÷��̾� �¸�");
		} else {
			int a = p1.kicker - p2.kicker;
			if(a > 0) {
				System.out.println("ù���� �÷��̾� �¸�");
			} else if (a < 0){
				System.out.println("�ι�° �÷��̾� �¸�");
			} else {
				System.out.println("���º�");
			}
		}
	}

	

	public static void main(String[] args) {
		new Poker().newGame();
	}

}
