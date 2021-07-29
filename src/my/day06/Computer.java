package my.day06;

public class Computer {

	public static final String[] OSTYPE = { "Wondow7", "Apple OS X", "Android" };
	int OS;
	int memory = 8;

	// 생성자
	public Computer() {

	}

	public Computer(int i, int m) {
		OS = i;
		memory = m;
	}

	public void print() {
		System.out.println("운영체제 : " + OSTYPE[OS] + ",  메인 메모리 : " + memory);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer pc = new Computer(0, 16);
		Computer apple = new Computer(1, 32);
		Computer galaxy = new Computer(2, 16);

		pc.print();
		apple.print();
		galaxy.print();

	}

}
