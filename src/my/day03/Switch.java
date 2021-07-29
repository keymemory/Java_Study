package my.day03;

import java.util.Scanner;

/*
 * 수도 요금 계산
 * 메뉴(1~3), 사용량(liter)
 * 1. 가정용 (liter 당 50원)
 * 2. 상업용 (liter 당 45원)
 * 3. 공업용 (liter 당 30원)
 * 
 * => 메뉴를 선택한 후 사용량을 입력받는다.
 * 
 * => 출력될 내용 : 사용자 코드, 사용량, 총 수도요금
 * 수도요금 : 사용량 * 리터당 가격
 * 총 수도요금 : 수도요금+세금(요금의 5%)
 * 
 */

public class Switch {

	// 메뉴 출력 멤버 메소드 정의
	public static void menu() {
		System.out.println("---------Menu---------");
		System.out.println("1. 가정용 (liter 당 50원)");
		System.out.println("2. 상업용 (liter 당 45원)");
		System.out.println("3. 공업용 (liter 당 30원)");
		System.out.println("----------------------");
		System.out.println("메뉴를 선택하세요 => ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Switch.menu();

		int code = sc.nextInt();
		System.out.println("사용량을 입력하세요 => ");
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
			System.out.println("지원하지 않는 메뉴 번호입니다.");
			break;
		}

		System.out.println("=============================");
		System.out.println("사용자 코드 : " + code);
		System.out.println("수도 요금 : " + water);

		double tax = water * 0.05;
		double money = water+tax;
		System.out.println("총 수도 요금 : " + money);
		System.out.println("=============================");

	}

}
