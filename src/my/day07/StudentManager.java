package my.day07;

import java.util.ArrayList;

public class StudentManager {
	ArrayList<Student> lists = new ArrayList<Student>();

	// 멤버 메소드
	public void addExpelStudents(String major, String hakbun, String n, int age) {
		lists.add(new Student(major, hakbun, n, age));
		// System.out.println("학생 정보 입력 성공");
		System.out.println(n + "정보 입력 성공");
	}

	public void update() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentManager sm = new StudentManager();
		sm.addExpelStudents("컴퓨터공학과", "20181101", "홍길동", 20);
		sm.addExpelStudents("정보통신공학과", "20181102", "강길동", 21);
		sm.addExpelStudents("해킹보안학과", "20181103", "이기자", 22);
		sm.addExpelStudents("체육학과", "20181104", "강기자", 23);
		
		// 학생의 이름 업데이트 하기
		sm.lists.get(0).updata(1, "박길동");
		System.out.println(sm.lists.get(0).getName());

	}

}
