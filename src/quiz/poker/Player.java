package quiz.poker;

import java.util.*;

public class Player  {
	
	ArrayList<Card> hand;
	int count;
	Scanner sc;
	int[] suit;
	int[] rank;
	int value;
	int kicker;
	boolean kickerAce;
	boolean suitCheck;
	boolean fullHouseCheck;
	boolean fullHouseCheck2;
	boolean fourCard;
	boolean twoPair;
	String valueStr;
	public Player() {
		suit = new int[4];
		rank = new int[13];
		hand = new ArrayList<>();
		sc = new Scanner(System.in);
	}
	
	void add(Card card) {
		hand.add(card);
	}

	public void pick(ArrayList<Card> table) {
		hand.addAll(table);
		System.out.println("====================================");
		System.out.println("���� ī�带 �ΰ� �����մϴ�.");
		System.out.println(hand);
		System.out.println("ù��° ���� ī�带 �����ϼ���.");
		hand.remove(sc.nextInt()-1);
		System.out.println(hand);
		System.out.println("�ι�° ���� ī�带 �����ϼ���.");
		hand.remove(sc.nextInt()-1);
		System.out.println(hand);
	}
	
	void calc() {
	
		
		for(int i = 0; i < 5 ; i++) {
			suit[hand.get(i).suit]++;
			rank[hand.get(i).rank]++;
		}
		valueStr = "����ī��";
		value = 1;
		
		
		for(int i = 0; i < 4; i++) {
			if(suit[i] == 5) {
				suitCheck=true;
			}
		}
		if(suitCheck) {
			valueStr = "�÷���";
			value = 6;
		}
		
		for(int i = 0; i < 9 ; i++) {
			if(rank[i] == 1 && rank[i+1] == 1 && rank[i+2] == 1 && rank[i+3] == 1 && rank[i+4] == 1) {
				if(suitCheck) {
					valueStr = "��Ʈ����Ʈ �÷���";
					value = 9;
					kicker = i+4;
				} else {
					valueStr = "��Ʈ����Ʈ";
					value = 5;
					kicker = i+4;
				}
			}
		}
		
		if(rank[0] == 1 && rank[9] == 1 && rank[10] == 1 && rank[11] == 1 && rank[12] == 1 ) {
			if(suitCheck) {
				valueStr = "�ξ� ��Ʈ����Ʈ �÷���";
				value = 10;
			} else {
				valueStr = "��Ʈ����Ʈ";
				value = 5;
				kicker = 13;
			}
		}
		
		for(int i = 0; i < 13 ; i++) {
			if(rank[i]== 2) {
				if(fullHouseCheck) {
					twoPair = true;
					kicker = i;
				}
				fullHouseCheck = true;
				kicker = i;
			}
			if(rank[i] == 3) {
				fullHouseCheck2 = true;
				kicker = i;
			}
			if(rank[i] == 4) {
				fourCard = true;
				
			}
			if(suitCheck && rank[i] >= 1) {
				kicker = i;
			}
			
		}
		
		if(fourCard) {
			valueStr = "��ī��";
			value = 8;
		} else if(fullHouseCheck2) {
			if(fullHouseCheck) {
				valueStr = "Ǯ�Ͽ콺";
				value = 7;
			} else {
				valueStr = "Ʈ����";
				value = 4;
			}
		} else if(fullHouseCheck) {
			if(twoPair) {
				valueStr = "�����";
				value = 3;
			} else {
				valueStr = "�����";
				value = 2;
			}
		}
		for(int i = 0; i < 13 ; i++) {
			if(fourCard && rank[i] >= 1) {
				kicker = i;
			}
			if(value == 1) {
				kicker = i;
			}
			if(value == 2 && rank[i] == 2) {
				kicker = i;
			}
		}
		
	}
		
	public String toString() {
		return hand.toString();
	}
}
