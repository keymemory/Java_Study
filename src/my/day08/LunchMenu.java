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

	// ���� ��� �߻� �޼ҵ�
	public abstract int calculate();
}
