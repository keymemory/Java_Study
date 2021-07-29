package my.day02;

import java.util.Scanner;

public class MethodTest {

	/*
	 * 1. 직사각형의 둘레를 계산하는 메소드 정의 (가로 길이 : length, 세로 길이 : width)
	 * 
	 * 반환타입이 있고, 매개변수가 있는 calculate()
	 */
	double length;
	double width;
	static double area; // 클래스 변수 or static 변수

	public double calculate(double length, double width) {
		return (length + width) * 2;
	}

	/*
	 * 2. 직사각형의 면적을 계산하는 메소드 정의
	 * 
	 * 반환타입이 있고, 매개변수가 있는 area()
	 */
	public double area(double length, double width) {
		return length * width;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력 : ");
		double num1 = sc.nextDouble();
		System.out.println("두번째 숫자를 입력 : ");
		double num2 = sc.nextDouble();

		MethodTest mt = new MethodTest();

		System.out.println("둘레 : " + mt.calculate(num1, num2));
		System.out.println("면적 : " + mt.area(num1, num2));

		mt.area = 30.12;
		MethodTest.area = 30.12;
	}

}
