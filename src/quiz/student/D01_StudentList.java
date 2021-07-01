package quiz.student;

import java.util.ArrayList;

public class D01_StudentList {

	public static void main(String[] args) {
	
		ArrayList<Student> stu = new ArrayList<>();
		
		int sum = 0;
		for(int i = 0 ; i < 30 ; i++) {
			Student e = new Student(i);
			stu.add(e);
		}
		
		double highAvg = 0;
		int highAvgStu = 0;
		for(int i = 0 ; i< 30 ; i++) {
			Student a = stu.get(i);
			sum += a.avg;
			if(a.avg >= highAvg) {
				highAvg = a.avg;
				highAvgStu = i;
			}
		}
		
		System.out.println("30명의 평균 점수: " + (sum / stu.size()));
		System.out.println("가장 평균 점수가 높은 학생: " + (highAvgStu+1) + "번 평균점수: "
				+ highAvg);
		
	}
	
}
