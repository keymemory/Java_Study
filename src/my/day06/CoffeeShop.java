package my.day06;

public class CoffeeShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee coffee = new Coffee();
		coffee.getTea(2, 2, 2);
		coffee.getTea(2, 3);
		coffee.getTea(2);
	}

}

class Coffee {

	int coffee;
	int cream;
	int sugar;

	// ��ȯ Ÿ��X, ����O
	public void getMilkCoffee(int c, int cr, int su) {
		coffee = c;
		cream = cr;
		sugar = su;
		System.out.println("��ũ Ŀ��");
	}

	// ��ȯ Ÿ��X, ����O
	public void getBlackCoffee(int coffee) {
		this.coffee = coffee;
		System.out.println("�� Ŀ��");
	}

	// �����ε�
	public void getTea(int coffee) {
		this.coffee = coffee;
		System.out.println("�� Ŀ��");
	}

	public void getTea(int co, int cr) {
		coffee = co;
		cream = cr;
		System.out.println("ũ�� Ŀ��");
	}
	
	public void getTea(int cof, int cr, int su) {
		coffee = cof;
		cream = cr;
		sugar = su;
		System.out.println("��ũ Ŀ��");
	}
}
