package my.day04;

import java.util.Random;
import java.util.Scanner;

public class GameJava {

	public static void menu() {
		System.out.println("---------Menu---------");
		System.out.println("1.가위  2.바위  3.보  9.게임종료");
		System.out.println("----------------------");
		System.out.println("입력 하세요 => ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {
			GameJava.menu();
			Scanner sc = new Scanner(System.in);
			int no = sc.nextInt();
			System.out.println("no : " + no);

			if (no == 9) {
				System.out.println("종료합니다.");
				break;
			}

			// 컴퓨터 측 난수 발생
			Random random = new Random();
			int comno = random.nextInt(3) + 1;
			System.out.println("컴퓨터 : " + comno);
			System.out.println("당신 : " + no);
			
			// 1. 비길경우
			// 2. 당신이 이길 경우
			// 3. 그외 당신이 질 경우
			
			if(no==comno) {
				System.out.println("비겼습니다.");
			}
			else if((no==1)&&(comno==3)||
					(no==2)&&(comno==1)||(no==3)&&(comno==2)) {
				System.out.println("이겼습니다.");
			}
			else {
				System.out.println("졌습니다.");
			}

		} // while()-----------

	}// main()---------------

}
