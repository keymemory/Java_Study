package my.day07;

public class Employee {

	String name;
	int age;
	String address;
	String part;
	long salary;

	public Employee(String name, int age, String address, String part) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.part = part;
	}

	public void printInfo() {
		System.out.println("�̸� : " + this.name);
		System.out.println("���� : " + this.age);
		System.out.println("�ּ� : " + this.address);
		System.out.println("�μ� : " + this.part);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Regular r = new Regular("�̼���", 35, "����", "�λ��");
		Temporary t = new Temporary("�庸��", 25, "��õ", "�渮��");
		r.setSalary(5000000);
		r.printInfo();
		t.setWorkHours(120);
		t.printInfo();

	}

}
