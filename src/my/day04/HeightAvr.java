package my.day04;

import java.util.Scanner;

public class HeightAvr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name[] = { "����", "ö��", "�浿", "����", "����" };
		int[] height = new int[5];
		int sum = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < height.length; i++) {
			System.out.println(name[i] + " Ű�� �Է��ϼ��� : ");
			height[i] = sc.nextInt();

			sum += height[i];
		}

		int avr = sum / height.length;

		System.out.println("�л����� ��� ������ " + avr + "�Դϴ�.");

	}

}
