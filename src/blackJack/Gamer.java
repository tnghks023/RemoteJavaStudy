package blackJack;

public class Gamer {

	String haveNum = "";
	boolean aCheck;
	boolean aCheck2;
	int sum;
	
	public Gamer() {
	}
	
	public void Count(String kind, String strNum) {
		int num = 0;
		if(strNum == "J" || strNum == "Q" || strNum == "K" ) {
			num = 10;
		} else if( strNum == "A") {
			num = 1;
			if (aCheck) { 
				aCheck2 = true;
			}
			aCheck = true;
		} else {
			num = Integer.parseInt(strNum);
		}
		haveNum = haveNum + kind + " " + strNum + ", ";
		sum += num;
	}
	
}
