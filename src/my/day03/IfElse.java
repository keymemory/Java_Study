package my.day03;

import java.util.Scanner;

public class IfElse {

	// ����� ���ϴ� ��� �޼ҵ� �����Ͻÿ�.

	public static int avr(int korean, int english, int math) {
		int average = (korean + math + english) / 3;
		return average;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ �Է��Ͻÿ� : ");
		int korean = sc.nextInt();
		System.out.println("���� ������ �Է��Ͻÿ� : ");
		int math = sc.nextInt();
		System.out.println("���� ������ �Է��Ͻÿ� : ");
		int english = sc.nextInt();
		
		IfElse ie = new IfElse();
		double avr = ie.avr(korean, math, english);
	
		System.out.println("��� ������ " + "�Դϴ�.");
			if (korean > avr) {
				System.out.println("���� ������ ��� �������� �����ϴ�.");
			} 
			else if (korean < avr) {
				System.out.println("���� ������ ��� �������� �����ϴ�.");
			}
			else {
				System.out.println("���� ������ ����Դϴ�.");
			}
			
			
			if (math > avr) {
				System.out.println("���� ������ ��� �������� �����ϴ�.");
			} 
			else if (math < avr) {
				System.out.println("���� ������ ��� �������� �����ϴ�.");
			}
			else {
				System.out.println("���� ������ ����Դϴ�.");
			}
			
			
			if (english > avr) {
				System.out.println("���� ������ ��� �������� �����ϴ�.");
			} 
			else if (english < avr) {
				System.out.println("���� ������ ��� �������� �����ϴ�.");
			}
			else {
				System.out.println("���� ������ ����Դϴ�.");
			}
			
	}

}
