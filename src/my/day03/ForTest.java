package my.day03;

import java.util.Scanner;

/*
 * 1부터 10까지 짝수의 합을 구하시오.
 */

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("1부터 10까지의 짝수의 합 : " + sum);

	}

}
