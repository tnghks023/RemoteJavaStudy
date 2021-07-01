package quiz;

import java.util.*;

public class D02_LottoCommentary {

	final private static int LOTTO_SIZE = 45;
	final private static int BONUS_INDEX = 3;

	private int bonus = 0;


	public Set<Integer> generate(int len) {
		HashSet<Integer> lotto = new HashSet<>();

		while ( lotto.size() != len) {
			int ranNum = (int)(Math.random() * LOTTO_SIZE + 1);
			//			System.out.println("Set에 " + ranNum + "이 더해집니다.");
			lotto.add(ranNum);

			if(len == 7 && lotto.size() == BONUS_INDEX) {
				bonus = ranNum;
			}
		}


		return lotto;
	}
	
	public void test() {
		Set<Integer> win = generate(7);
		System.out.println("당첨번호는 " + win + "입니다. 그 중 "
				+ "보너스 번호는" + bonus + "입니다.");
		List<Integer> checkList = new ArrayList<>(7);
		long count = 0;

		while(true) {
			Set<Integer> blackcow = generate(6);
			count++;

			checkList.addAll(win);
			checkList.removeAll(blackcow);

			if(checkList.size() == 1) {
				if(checkList.get(0) == bonus) {
					System.out.println("1등 당첨. 쓴 돈: " + count * 1000);
				} else {
					System.out.println(blackcow);
					System.out.println("2등 당첨. 쓴 돈: " + count * 1000);
				}
				break;
			}
			checkList.clear();

		}
	}

	public static void main(String[] args) {		
		D02_LottoCommentary quiz = new D02_LottoCommentary();

		quiz.test();


	}
}
