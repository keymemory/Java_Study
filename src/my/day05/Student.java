package my.day05;

public class Student {

	private String hakgwa;
	private int hakbun;
	private String name;

	// 1. 생정자 메소드 정의
	// - public 접근 지정자 정의
	// - 반환 타입을 명시X
	// - 클래스의 이름과 같은 메소드 이름

	// 기본 생성자
	public Student() {

	}
	/*
	 * public Student() { setHakgwa("컴퓨터공학과"); hakbun = 2018; name = "홍길동"; }
	 */

	// 인자 생성자
	public Student(String h, int hb, String name) {
		hakgwa = h;
		hakbun = hb;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHakgwa(String hakgwa) {
		this.hakgwa = hakgwa;
	}

	public void sethakbun(int hakbun) {
		this.hakbun = hakbun;
	}

	public String getHakgwa() {
		return hakgwa;
	}

	public int getHakbun() {
		return hakbun;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student();
		Student st2 = new Student("정보통신공학과", 2018, "강길동");
		System.out.println("학과 : " + st1.hakgwa);
		System.out.println(st2.hakgwa);
	}

}
