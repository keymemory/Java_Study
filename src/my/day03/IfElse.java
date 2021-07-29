package my.day03;

import java.util.Scanner;

public class IfElse {

	// 평균을 구하는 멤버 메소드 정의하시오.

	public static int avr(int korean, int english, int math) {
		int average = (korean + math + english) / 3;
		return average;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하시오 : ");
		int korean = sc.nextInt();
		System.out.println("수학 점수를 입력하시오 : ");
		int math = sc.nextInt();
		System.out.println("영어 점수를 입력하시오 : ");
		int english = sc.nextInt();
		
		IfElse ie = new IfElse();
		double avr = ie.avr(korean, math, english);
	
		System.out.println("평균 점수는 " + "입니다.");
			if (korean > avr) {
				System.out.println("국어 점수는 평균 점수보다 높습니다.");
			} 
			else if (korean < avr) {
				System.out.println("국어 점수는 평균 점수보다 낮습니다.");
			}
			else {
				System.out.println("국어 점수는 평균입니다.");
			}
			
			
			if (math > avr) {
				System.out.println("수학 점수는 평균 점수보다 높습니다.");
			} 
			else if (math < avr) {
				System.out.println("수학 점수는 평균 점수보다 낮습니다.");
			}
			else {
				System.out.println("수학 점수는 평균입니다.");
			}
			
			
			if (english > avr) {
				System.out.println("영어 점수는 평균 점수보다 높습니다.");
			} 
			else if (english < avr) {
				System.out.println("영어 점수는 평균 점수보다 낮습니다.");
			}
			else {
				System.out.println("영어 점수는 평균입니다.");
			}
			
	}

}
