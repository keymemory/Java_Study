package my.day02;

import java.util.Scanner;

public class MethodTest {

	/*
	 * 1. ���簢���� �ѷ��� ����ϴ� �޼ҵ� ���� (���� ���� : length, ���� ���� : width)
	 * 
	 * ��ȯŸ���� �ְ�, �Ű������� �ִ� calculate()
	 */
	double length;
	double width;
	static double area; // Ŭ���� ���� or static ����

	public double calculate(double length, double width) {
		return (length + width) * 2;
	}

	/*
	 * 2. ���簢���� ������ ����ϴ� �޼ҵ� ����
	 * 
	 * ��ȯŸ���� �ְ�, �Ű������� �ִ� area()
	 */
	public double area(double length, double width) {
		return length * width;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է� : ");
		double num1 = sc.nextDouble();
		System.out.println("�ι�° ���ڸ� �Է� : ");
		double num2 = sc.nextDouble();

		MethodTest mt = new MethodTest();

		System.out.println("�ѷ� : " + mt.calculate(num1, num2));
		System.out.println("���� : " + mt.area(num1, num2));

		mt.area = 30.12;
		MethodTest.area = 30.12;
	}

}
