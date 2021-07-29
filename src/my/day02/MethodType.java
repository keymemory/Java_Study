package my.day02;

public class MethodType {

	// 멤버 변수 (2개의 정수)
	int num1 = 40;
	int num2 = 20;

	// 1. 반환타입 x, 매개변수 o (2개의 정수를 더해서 결과 반환하는 메소드)
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	// 2. 반환타입 o, 매개변수 x
	public int sub() {
		return (num1 - num2);
	}

	// 3. 반환타입 x, 매개변수 o
	public void mul(int num1, int num2) {
		System.out.println(num1 * num2);
	}

	// 4. 반환타입 x, 매개변수 x
	public void div() {
		System.out.println(num1 / num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodType m = new MethodType();
		System.out.println(m.add(m.num1, m.num2));
		System.out.println(m.sub());
		m.mul(m.num1, m.num2);
		m.div();
		
	}

}
