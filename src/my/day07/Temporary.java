package my.day07;

public class Temporary extends Employee {

	int workHours;
	int payOfHour = 10000;

	public Temporary(String name, int age, String address, String part) {
		super(name, age, address, part);
		// TODO Auto-generated constructor stub
	}

	public void setWorkHours(int hour) {
		this.workHours = hour;
		this.salary = this.workHours * this.payOfHour;
	}

	public void printInfo() {
		super.printInfo();
		System.out.println("�ð��� �޿� : " + this.payOfHour);
		System.out.println("���� �ð� : " + this.workHours);
		System.out.println("�������� : " + salary);
	}

}
