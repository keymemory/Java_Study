package my.day06;

public class SalaryMan {
	int pay = 1000000;

	public int getPay() {
		return pay * 12 * 5;
	}

	// 생성자 오버로딩
	public SalaryMan() {

	}

	public SalaryMan(int pay) {
		this.pay = pay;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalaryMan sm = new SalaryMan();
		System.out.println(sm.getPay());
		
		System.out.println(new SalaryMan().getPay());
		
		System.out.println(new SalaryMan(2000000).getPay());

	}

}
