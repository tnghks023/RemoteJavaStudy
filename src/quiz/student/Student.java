package quiz.student;

public class Student {
	
	int StuId;
	int kor;
	int eng;
	int math;
	double avg;
	
	public Student(int i) {
		StuId = i;
		kor = (int)(Math.random() * 99 +1);
		eng = (int)(Math.random() * 99 +1);
		math = (int)(Math.random() * 99 +1);
		avg = (kor + eng + math) / 3.0;
	}
	
}
