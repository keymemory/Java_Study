package my.day04;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scores[] = new int[5];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			System.out.println("������ �Է��Ͻÿ� : ");
			scores[i] = sc.nextInt();
			sum += scores[i];
		}
		int avr = sum / scores.length;
		System.out.println("��� ������ " + avr + "�Դϴ�.");
	}

}
