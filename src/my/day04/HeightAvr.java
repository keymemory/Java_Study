package my.day04;

import java.util.Scanner;

public class HeightAvr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name[] = { "영희", "철수", "길동", "영수", "말자" };
		int[] height = new int[5];
		int sum = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < height.length; i++) {
			System.out.println(name[i] + " 키를 입력하세요 : ");
			height[i] = sc.nextInt();

			sum += height[i];
		}

		int avr = sum / height.length;

		System.out.println("학생들의 평균 신장은 " + avr + "입니다.");

	}

}
