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
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("주소 : " + this.address);
		System.out.println("부서 : " + this.part);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Regular r = new Regular("이순신", 35, "서울", "인사부");
		Temporary t = new Temporary("장보고", 25, "인천", "경리부");
		r.setSalary(5000000);
		r.printInfo();
		t.setWorkHours(120);
		t.printInfo();

	}

}
