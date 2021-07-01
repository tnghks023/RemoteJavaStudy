package myobj;

import java.util.Random;

public class Student {
	public int snum;
	public int kor; 
	public int eng;
	public int math;
	double avg;
	
	public static double best_avg = 0;
	public static int best_avg_snum = 0;
	
	final private int MAX_SCORE = 100;
	
	
	private static int curr_snum = 1000;
	private static Random ran = new Random();

	public Student() {
		snum = curr_snum++;
		kor = ran.nextInt(MAX_SCORE + 1);
		eng = ran.nextInt(MAX_SCORE + 1);
		math = ran.nextInt(MAX_SCORE + 1);
		avg = (kor + eng + math) / (double) 3;
		
		if(avg > best_avg) {
			best_avg = avg;
			best_avg_snum = snum;
		}
	}
	
	@Override
	public String toString() {
	
		return String.format("[%d]번 학생 평균 점수 %.2f", snum, avg);
				
	}
}
