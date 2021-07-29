package my.day03;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		Scanner sc = new Scanner(System.in);

		while (true) {
			str = sc.next();
			System.out.println("str = " + str);

			if (str.equals("x") || str.equals("X")) {
				break;
			}
		}
		System.out.println("종료합니다.");

	}

}
