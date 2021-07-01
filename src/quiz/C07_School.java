package quiz;

import quiz.Machine;
import quiz.Network;
import quiz.Programing;
import quiz.Student;

public class C07_School {

	/*
 		1. 각 반의 정원은 30명이다.
 		
 		2-1. 프로그래밍 반 학생들은 각자의 국어,영어, 수학, 프로그래밍 언어, 알고리즘, 자료구조 점수가 있다.
 		
 		2-2. 네트워크 반 학생들은 각자의 국어,영어, 리눅스, 네트워크, CCNA 점수가 있다.
 		
 		2-3. 머신러닝 반 학생들은 각자의 국어,영어,수학, 통계학, 프로그램 언어 점수
 		
 		3.모든 학생의 점수와 이름을 랜덤으로 생성.
 		  학번은 중복없이 순차적으로 생성되어야 한다.(또는 중복없이 랜덤도 가능)
 		  
 		4. 성적표 메서드를 통해 각 학생의 이름/총점/평균점수를 볼 수 있어야 한다.

	 */
	
	public static void main(String[] args) {
		
		String[] name = new String[] {"하나", "둘", "셋", "넷", "다섯", "여섯", "일곱", "여덞", "아홉", "열"};
		String[] fName = new String[] {"김", "박", "이", "최", "정", "조","강", "윤", "장", "임"};
		
		Student[] pg = new Programing[30];
		Student[] nw = new Network[30];
		Student[] mr = new Machine[30];
		
		
		for(int i = 0; i < 30; i ++) {
			int rn = name.length;
			int rn2 = fName.length;
			String fullName = fName[rn2] + name[rn];
			pg[i] = new Programing(fullName, i+1);
		}
		for(int i = 0; i < 30; i ++) {
			int rn = name.length;
			int rn2 = fName.length;;
			String fullName = fName[rn2] + name[rn];
			nw[i] = new Network(fullName, i+31);
		}
		for(int i = 0; i < 30; i ++) {
			int rn = name.length;
			int rn2 = fName.length;
			String fullName = fName[rn2] + name[rn];
			mr[i] = new Machine(fullName, i+61);
		}
		
		for(int i= 0; i<30; i++) {
			pg[i].info();
			System.out.println("========================================");
			nw[i].info();
			System.out.println("========================================");
			mr[i].info();
			System.out.println("========================================");
		}
	
	}
}
