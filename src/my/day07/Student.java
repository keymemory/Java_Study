package my.day07;

public class Student {
	private String hakgwa;
	private String hakbun;
	private String name;
	private int age;

	// 1. ������ �޼ҵ� ����
	// - public ���� ������ ����
	// - ��ȯ Ÿ���� ���X
	// - Ŭ������ �̸��� ���� �޼ҵ� �̸�

	// �⺻ ������
	public Student() {

	}

	// ���� ������
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

	// �л� ���� ������Ʈ �޼ҵ� ����
	public void updata(int i, String info) {

		switch (i) {
		case 1: // �̸� ����
			setName(info);
			break;
		case 2: // �а� ����
			setHakgwa(info);
			break;
		case 3: // �й� ����
			setHakbun(info);
			break;
		default:
			System.out.println("�߸��� ��ȣ �Է�");
			break;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student();
		Student st2 = new Student("������Ű��а�", "2018", "���浿", 24);
		System.out.println("�а� : " + st1.hakgwa);
		System.out.println(st2.hakgwa);
		
	}

}