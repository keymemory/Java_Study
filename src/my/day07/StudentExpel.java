package my.day07;

import java.util.ArrayList;

public class StudentExpel {

	ArrayList<Student> expelStudents;

	public StudentExpel() {
		expelStudents = new ArrayList<Student>();

	}

	public void addExpelStudents(String n, String hakbun, String major, int age) {
		expelStudents.add(new Student(n, hakbun, major, age));
	}
}
