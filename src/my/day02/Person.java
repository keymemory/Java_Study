package my.day02;

public class Person {
	
	// ��� ����
		int age = 20;
		double height = 170.55;
		double weight = 40.55;
		String name = "ȫ�浿";

		// �޼ҵ� ����
		public void printAll() {
			System.out.println("���� : " + age);
			System.out.println("Ű : " + height);
			System.out.println("������ : " + weight);
			System.out.println("�̸� : " + name);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Person p = new Person();
			p.printAll();
		}
}
