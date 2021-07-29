package my.day08;

public abstract class LunchMenu {

	int rice;
	int bulgogi;
	int milk;
	int amond;
	int banana;

	public LunchMenu(int rice, int bulgogi, int milk, int amond, int banana) {
		this.rice = rice;
		this.bulgogi = bulgogi;
		this.milk = milk;
		this.amond = amond;
		this.banana = banana;

	}

	// 가격 계산 추상 메소드
	public abstract int calculate();
}
