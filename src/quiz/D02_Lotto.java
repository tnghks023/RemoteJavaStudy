package quiz;

import java.util.*;

public class D02_Lotto {

	public static void main(String[] args) {

		HashSet<Integer> lotto = new HashSet<>();
		HashSet<Integer> myLotto = new HashSet<>();
		long buy = 0;
		while(true) {
			buy++;
			int bonus = 0;
			while(lotto.size() < 7) {
				int rn = (int)(Math.random()*45 + 1);
				lotto.add(rn);
				if(lotto.size()==7) {
					bonus = rn;
				}
			}
			
			ArrayList<Integer> lottoList = new ArrayList<>(lotto);
			lottoList.remove((Integer)bonus);
			lotto.removeAll(lotto);
			Collections.sort(lottoList);
			
			while(myLotto.size()< 6) {
				myLotto.add((int)(Math.random()*45 + 1));
			}
			ArrayList<Integer> myLottoList = new ArrayList<>(myLotto);
			myLotto.removeAll(myLotto);
			Collections.sort(myLottoList);
			
			boolean bonusCheck = false;
			int cnt=0;
			for(int lottoNum : lottoList) {
				for(int myLottoNum : myLottoList ) {
					if(lottoNum == myLottoNum) {
						cnt++;
					}
					if(bonus == myLottoNum) {
						bonusCheck = true;
					}
				}
			}
			
			System.out.println("랜덤 번호 : " + myLottoList);
			System.out.println("당첨 번호 : " + lottoList);
			System.out.println("맞춘 개수: " +  cnt + ", 보너스 번호: " + bonus);
			System.out.println("지금까지 쓴 돈: " + buy * 1000);
			
			if(cnt == 6) {
				System.out.println("1등");
				break;
			} else if(cnt == 5 && bonusCheck) {
				System.out.println("2등");
				break;
			}
			
			
		}// end while
	}// end main
}// end class
