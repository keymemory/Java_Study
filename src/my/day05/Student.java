package my.day05;

public class Student {

	private String hakgwa;
	private int hakbun;
	private String name;

	// 1. ������ �޼ҵ� ����
	// - public ���� ������ ����
	// - ��ȯ Ÿ���� ���X
	// - Ŭ������ �̸��� ���� �޼ҵ� �̸�

	// �⺻ ������
	public Student() {

	}
	/*
	 * public Student() { setHakgwa("��ǻ�Ͱ��а�"); hakbun = 2018; name = "ȫ�浿"; }
	 */

	// ���� ������
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
		Student st2 = new Student("������Ű��а�", 2018, "���浿");
		System.out.println("�а� : " + st1.hakgwa);
		System.out.println(st2.hakgwa);
	}

}
