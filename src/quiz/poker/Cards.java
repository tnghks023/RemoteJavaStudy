package quiz.poker;

import java.util.*;

public class Cards {
	
	final public static int NUM_OF_SUITS = 4;
	final public static int NUM_OF_RANKS = 13;
	final public static int CARD_SIZE = NUM_OF_RANKS * NUM_OF_SUITS;
	
	private int cursor;
	
	ArrayList<Card> cards;
	
	public Cards() {
		cards = new ArrayList<>();
		for(int i = 0; i < NUM_OF_SUITS ; i++) {
			for(int j = 0; j < NUM_OF_RANKS; j++) {
				cards.add(new Card(i, j));
			}
		}
		Collections.shuffle(cards);
	}
	
	public Card next() {
		return cards.get(cursor++);
	}
		
	@Override
	public String toString() {
		return cards.toString();
	}

}

class Card {
	final public static char[] SUITS = {'¢¼', '¢À', '¡Þ', '¢½'};
	final public static String[] RANKS = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"}; 
	
	int suit;
	int rank;
	
	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;	
	}
	
	@Override
	public String toString() {
	
		return SUITS[suit] + RANKS[rank];
	}
}
