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
		System.out.println("시간당 급여 : " + this.payOfHour);
		System.out.println("일한 시간 : " + this.workHours);
		System.out.println("비정규직 : " + salary);
	}

}
