package quiz;

import java.util.Scanner;

public class B01_ScoreToGrade {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력: ");
		int score = sc.nextInt();
		
		
		if (score > 100 || score < 0) {
			System.out.println("점수를 잘못입력했습니다.");
		} else if ( score >= 90) {
			System.out.println("A학점입니다");
		} else if (score >= 80) {
			System.out.println("B학점입니다");
		} else if (score >= 70) {
			System.out.println("C학점입니다");
		} else if (score >= 60) {
			System.out.println("D학점입니다");
		} else {
			System.out.println("F학점입니다.");
		}
			
		
	}

}
