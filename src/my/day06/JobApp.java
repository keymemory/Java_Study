package my.day06;

import java.util.Scanner;

public class JobApp {

	// 1. �޴� �޼ҵ� �����
	public void showMenu() {
		System.out.println("==========Job v1.0==========");
		System.out.println("**1.���� ���**");
		System.out.println("**2.���� ���**");
		System.out.println("**3.������ ���� ���**");
		System.out.println("**4.����**");
		System.out.println("============================");
	}

	public static void inputPerson() {
		// �̸�, ����, ����, ��ȭ��ȣ�� �Է¹޾�
		// Person ��ü�� �����ؼ� ��ü ����

		Scanner sc = new Scanner(System.in);
		System.out.println("������� Start");
		System.out.println("�̸� �Է� : ");
		String name = sc.next();
		System.out.println("���� �Է� : ");
		int age = sc.nextInt();
		System.out.println("���� �Է� : ");
		String sex1 = sc.next();
		char sex;
		if (sex1.equals("��")) {
			sex = '��';
		} else {
			sex = '��';
		}
		System.out.println("��ȭ��ȣ �Է� : ");
		String phone = sc.next();

		// �Է¹��� ���� Person���� ������ �ʱ�ȭ�ϸ鼭 ��ü ����
		Person person1 = new Person();
		Person person2 = new Person(name, age, sex, phone);
		/*person1.name = name;
		person1.age = age;
		person1.sex = sex;
		person1.phone = phone;*/

		/////////////////////////////////////////////////////
		person1.showProfile();
		person2.showProfile();
		/////////////////////////////////////////////////////

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JobApp jb = new JobApp();

		Scanner sc = new Scanner(System.in);
		while (true) {
			jb.showMenu();
			int num = sc.nextInt();

			if (num == 4) {
				System.exit(0); // ���α׷� ���� ����
			} else if (num == 1) {
				JobApp.inputPerson(); // ������ ���ϴ� ����� ������ �Է¹޴´�.
			}

		} // while()-----------
	}

}

class Person {

	String name;
	int age;
	char sex;
	String phone;
	
	public Person() {
		
	}

	// ���� ������ ����
	public Person(String name, int age, char sex, String phone) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.phone = phone;
	}

	public void showProfile() {
		System.out.println("======" + name + "������");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + sex);
		System.out.println("��ȭ��ȣ : " + phone);
	}

	public void wantJob(String job, int pay) {
		System.out.println("======" + name + "��======");
		System.out.println("�������� : " + job);
		System.out.println("������� : " + pay);
	}

}