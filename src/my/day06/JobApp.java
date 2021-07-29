package my.day06;

import java.util.Scanner;

public class JobApp {

	// 1. 메뉴 메소드 만들기
	public void showMenu() {
		System.out.println("==========Job v1.0==========");
		System.out.println("**1.구직 등록**");
		System.out.println("**2.구인 등록**");
		System.out.println("**3.구직자 정보 출력**");
		System.out.println("**4.종료**");
		System.out.println("============================");
	}

	public static void inputPerson() {
		// 이름, 나이, 성별, 전화번호를 입력받아
		// Person 객체에 전달해서 객체 생성

		Scanner sc = new Scanner(System.in);
		System.out.println("구직등록 Start");
		System.out.println("이름 입력 : ");
		String name = sc.next();
		System.out.println("나이 입력 : ");
		int age = sc.nextInt();
		System.out.println("성별 입력 : ");
		String sex1 = sc.next();
		char sex;
		if (sex1.equals("남")) {
			sex = '남';
		} else {
			sex = '여';
		}
		System.out.println("전화번호 입력 : ");
		String phone = sc.next();

		// 입력받은 값을 Person에게 전달해 초기화하면서 객체 생성
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
				System.exit(0); // 프로그램 정상 종료
			} else if (num == 1) {
				JobApp.inputPerson(); // 구직을 원하는 사람의 정보를 입력받는다.
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

	// 인자 생성자 정의
	public Person(String name, int age, char sex, String phone) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.phone = phone;
	}

	public void showProfile() {
		System.out.println("======" + name + "프로필");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + sex);
		System.out.println("전화번호 : " + phone);
	}

	public void wantJob(String job, int pay) {
		System.out.println("======" + name + "님======");
		System.out.println("희장직종 : " + job);
		System.out.println("희망연봉 : " + pay);
	}

}