package my.day07;

public class Regular extends Employee {

	private long salary;
	public Regular(String name, int age, String address, String part) {
		super(name, age, address, part);
		// TODO Auto-generated constructor stub
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public void printInfo() {
		super.printInfo();
		System.out.println("Á¤±ÔÁ÷ : " + this.salary);
	}

}
