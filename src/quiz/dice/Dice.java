package quiz.dice;

public class Dice {

	int[] dice = new int[5];
	int[] diceValue = new int[6];
	boolean[] cRoll = new boolean[5];
	boolean[] oCheck = new boolean[6];
	boolean[] smallStrait = new boolean[3];

	public void roll() {
		for (int i = 0; i < dice.length ; i++) {
			int diceNum = (int)(Math.random() * 6 + 1);
			dice[i] = diceNum;
			diceValue[diceNum-1]++;
		}
	}//end roll

	public void chooseRoll(int[] num) {

		for (int i = 0; i < 5 ; i++) {
			if(num[i] == 0) {
				break;
			}
			for(int j =0; j < 5 ; j++) {
				if(num[i]-1 == j) {
					cRoll[j] = true;
				}
			}
		}
		for(int i =0 ; i< 5; i++) {
			if(!cRoll[i]) {
				diceValue[dice[i]-1]--;
				int diceNum = (int)(Math.random() * 6 + 1);
				dice[i] = diceNum;
				diceValue[diceNum-1]++;
			}
		}
	}//end chooseRoll

	public void result() {

		for(int i = 0; i< 6 ; i++) {
			if(diceValue[i] == 5) {
				System.out.println("5다이스");
				break;
			} else if(diceValue[i] == 4) {
				System.out.println("4다이스");
				break;
			} else if (diceValue[i] == 1) {
				oCheck[i] = true;
			}
		}
		for(int i =0 ; i< 3 ; i++) {
			smallStrait[i] = oCheck[i] && oCheck[i+1] && oCheck[i+2] && oCheck[i+3]; 
		}

		if(smallStrait[0] && oCheck[4] || smallStrait[2] && oCheck[0]) {
			System.out.println("라지 스트레이트");
		} else if( smallStrait[0] || smallStrait[1] || smallStrait[2]) {
			System.out.println("스몰 스트레이트");
		}


		boolean fHCheck2 = false;
		boolean fHCheck3 = false;
		for(int j = 0; j < 6 ; j++) {
			if(diceValue[j] == 2 ) {
				fHCheck2 = true;
			}
			if (diceValue[j] == 3) {
				fHCheck3 = true;
			}
		}
		if(fHCheck2 && fHCheck3) {
			System.out.println("풀하우스");
		}
		
	}//end result

	@Override
	public String toString() {
		String str = "";
		for(int i = 0 ; i < 5 ; i++) {
			str += "[" + dice[i] + "]";
		}
		return str;

	}
}