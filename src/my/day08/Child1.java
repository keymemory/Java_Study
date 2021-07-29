package my.day08;

public class Child1 extends LunchMenu {

	public Child1(int rice, int bulgogi, int milk, int amond, int banana) {
		super(rice, bulgogi, milk, amond, banana);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculate() {
		// TODO Auto-generated method stub
		return rice + bulgogi + milk + amond + banana;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
