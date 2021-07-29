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

	// 반환 타입X, 인자O
	public void getMilkCoffee(int c, int cr, int su) {
		coffee = c;
		cream = cr;
		sugar = su;
		System.out.println("밀크 커피");
	}

	// 반환 타입X, 인자O
	public void getBlackCoffee(int coffee) {
		this.coffee = coffee;
		System.out.println("블랙 커피");
	}

	// 오버로딩
	public void getTea(int coffee) {
		this.coffee = coffee;
		System.out.println("블랙 커피");
	}

	public void getTea(int co, int cr) {
		coffee = co;
		cream = cr;
		System.out.println("크림 커피");
	}
	
	public void getTea(int cof, int cr, int su) {
		coffee = cof;
		cream = cr;
		sugar = su;
		System.out.println("밀크 커피");
	}
}
