package my.day07;

import java.util.ArrayList;

public class StudentManager {
	ArrayList<Student> lists = new ArrayList<Student>();

	// ��� �޼ҵ�
	public void addExpelStudents(String major, String hakbun, String n, int age) {
		lists.add(new Student(major, hakbun, n, age));
		// System.out.println("�л� ���� �Է� ����");
		System.out.println(n + "���� �Է� ����");
	}

	public void update() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentManager sm = new StudentManager();
		sm.addExpelStudents("��ǻ�Ͱ��а�", "20181101", "ȫ�浿", 20);
		sm.addExpelStudents("������Ű��а�", "20181102", "���浿", 21);
		sm.addExpelStudents("��ŷ�����а�", "20181103", "�̱���", 22);
		sm.addExpelStudents("ü���а�", "20181104", "������", 23);
		
		// �л��� �̸� ������Ʈ �ϱ�
		sm.lists.get(0).updata(1, "�ڱ浿");
		System.out.println(sm.lists.get(0).getName());

	}

}
