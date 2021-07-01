package quiz;

public class FailHole {
	
	int failHoleNum;
	int[] failHole;
	
	public FailHole(int holeNum) {
		failHoleNum = (int)(Math.random() * holeNum / 3 + 1);
		failHole = new int[failHoleNum];
		for(int i = 0; i < failHole.length ; i++) {
			failHole[i] = (int)(Math.random() * holeNum+1);
		}
	}
}
