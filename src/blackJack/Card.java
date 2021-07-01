package blackJack;

public class Card {

	String[] card;
	String[] kinds;
	static String[] allCard = new String[14];
	static String[] allCardKind = new String[14];
	static int cnt = 0;

	public Card() {
		kinds = new String[] {"heart", "diamond", "spade", "clover"};
		card = new String[] {"A", "2", "3", "4","5","6","7","8","9","10","J","Q","K"};

	}

	public String[] pick() {
		
		String[] pickCard = null;
		boolean check = true;
		while(check) {
			int rnk = (int)(Math.random() * 4);
			int rn = (int)(Math.random()* 13);
			pickCard = new String[] {kinds[rnk], card[rn]};
			allCardKind[cnt] = pickCard[0];
			allCard[cnt] = pickCard[1];
			check = false;
			for (int i = 0 ; i < cnt ; i++) {
				if ((allCard[i].equals(pickCard[1])) && (allCardKind[i].equals(pickCard[0]))) {
					check = true;
					break;
				} else {
					check = false;
				}
			}
		}
		cnt++;
		return pickCard;
	}
}
