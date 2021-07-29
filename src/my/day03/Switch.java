package my.day03;

import java.util.Scanner;

/*
 * ���� ��� ���
 * �޴�(1~3), ��뷮(liter)
 * 1. ������ (liter �� 50��)
 * 2. ����� (liter �� 45��)
 * 3. ������ (liter �� 30��)
 * 
 * => �޴��� ������ �� ��뷮�� �Է¹޴´�.
 * 
 * => ��µ� ���� : ����� �ڵ�, ��뷮, �� �������
 * ������� : ��뷮 * ���ʹ� ����
 * �� ������� : �������+����(����� 5%)
 * 
 */

public class Switch {

	// �޴� ��� ��� �޼ҵ� ����
	public static void menu() {
		System.out.println("---------Menu---------");
		System.out.println("1. ������ (liter �� 50��)");
		System.out.println("2. ����� (liter �� 45��)");
		System.out.println("3. ������ (liter �� 30��)");
		System.out.println("----------------------");
		System.out.println("�޴��� �����ϼ��� => ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Switch.menu();

		int code = sc.nextInt();
		System.out.println("��뷮�� �Է��ϼ��� => ");
		int use = sc.nextInt();
		int water = 0;

		switch (code) {
		case 1:
			water = use * 50;
			break;

		case 2:
			water = use * 45;
			break;

		case 3:
			water = use * 30;
			break;

		default:
			System.out.println("�������� �ʴ� �޴� ��ȣ�Դϴ�.");
			break;
		}

		System.out.println("=============================");
		System.out.println("����� �ڵ� : " + code);
		System.out.println("���� ��� : " + water);

		double tax = water * 0.05;
		double money = water+tax;
		System.out.println("�� ���� ��� : " + money);
		System.out.println("=============================");

	}

}
