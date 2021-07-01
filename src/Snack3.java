import java.util.Random;

public class Snack3 implements Comparable<Snack3> {
	
	public int pNum;
	public int calc;
	public int price;
	
	private static int curr_pNum=1;
	private static Random ran = new Random();

	public Snack3() {
		pNum = curr_pNum++;
		calc = ran.nextInt(1000+ 1);
		price = ran.nextInt(2000 + 1);
	}


	public int compareTo(Snack3 o) {
		return Integer.compare(this.calc, o.calc) != 0 ?  Integer.compare(this.calc, o.calc)
				: this.pNum - o.pNum;
	}
}
