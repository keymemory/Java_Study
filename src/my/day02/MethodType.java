package my.day02;

public class MethodType {

	// ��� ���� (2���� ����)
	int num1 = 40;
	int num2 = 20;

	// 1. ��ȯŸ�� x, �Ű����� o (2���� ������ ���ؼ� ��� ��ȯ�ϴ� �޼ҵ�)
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	// 2. ��ȯŸ�� o, �Ű����� x
	public int sub() {
		return (num1 - num2);
	}

	// 3. ��ȯŸ�� x, �Ű����� o
	public void mul(int num1, int num2) {
		System.out.println(num1 * num2);
	}

	// 4. ��ȯŸ�� x, �Ű����� x
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
