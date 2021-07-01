

import java.util.Random;

public class Student {
	public int snum;
	public int kor; 
	public int eng;
	public int math;
	double avg;
	
	final private int MAX_SCORE = 100;
	
	
	private static int curr_snum = 1000;
	private static Random ran = new Random();

	public Student() {
		snum = curr_snum++;
		kor = ran.nextInt(MAX_SCORE + 1);
		eng = ran.nextInt(MAX_SCORE + 1);
		math = ran.nextInt(MAX_SCORE + 1);
		avg = (kor + eng + math) / (double) 3;

	}
	
}
