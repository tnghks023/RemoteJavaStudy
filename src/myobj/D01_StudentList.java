package myobj;

import java.util.ArrayList;

public class D01_StudentList {

	public static void main(String[] args) {
		
		ArrayList<Student> student_list = new ArrayList<>();
		
		for (int i =0; i < 30; i++) {
			student_list.add(new Student());
		}
		
		for(Student student : student_list) {
			System.out.println(student);
		}

	}

}
