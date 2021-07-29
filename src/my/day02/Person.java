package my.day02;

public class Person {
	
	// 멤버 변수
		int age = 20;
		double height = 170.55;
		double weight = 40.55;
		String name = "홍길동";

		// 메소드 정의
		public void printAll() {
			System.out.println("나이 : " + age);
			System.out.println("키 : " + height);
			System.out.println("몸무게 : " + weight);
			System.out.println("이름 : " + name);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Person p = new Person();
			p.printAll();
		}
}
