package quiz;

import java.util.Scanner;

public class B01_ScoreToGrade {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int score = sc.nextInt();
		
		
		if (score > 100 || score < 0) {
			System.out.println("������ �߸��Է��߽��ϴ�.");
		} else if ( score >= 90) {
			System.out.println("A�����Դϴ�");
		} else if (score >= 80) {
			System.out.println("B�����Դϴ�");
		} else if (score >= 70) {
			System.out.println("C�����Դϴ�");
		} else if (score >= 60) {
			System.out.println("D�����Դϴ�");
		} else {
			System.out.println("F�����Դϴ�.");
		}
			
		
	}

}
