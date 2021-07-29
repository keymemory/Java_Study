package my.day07;

public class Student {
	private String hakgwa;
	private String hakbun;
	private String name;
	private int age;

	// 1. 생정자 메소드 정의
	// - public 접근 지정자 정의
	// - 반환 타입을 명시X
	// - 클래스의 이름과 같은 메소드 이름

	// 기본 생성자
	public Student() {

	}

	// 인자 생성자
	public Student(String h, String hb, String name, int age) {
		hakgwa = h;
		hakbun = hb;
		this.name = name;
		this.age = age;
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

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public String getHakgwa() {
		return hakgwa;
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	// 학생 정보 업데이트 메소드 정의
	public void updata(int i, String info) {

		switch (i) {
		case 1: // 이름 수정
			setName(info);
			break;
		case 2: // 학과 수정
			setHakgwa(info);
			break;
		case 3: // 학번 수정
			setHakbun(info);
			break;
		default:
			System.out.println("잘못된 번호 입력");
			break;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student();
		Student st2 = new Student("정보통신공학과", "2018", "강길동", 24);
		System.out.println("학과 : " + st1.hakgwa);
		System.out.println(st2.hakgwa);
		
	}

}