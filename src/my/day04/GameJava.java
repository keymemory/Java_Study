package my.day04;

import java.util.Random;
import java.util.Scanner;

public class GameJava {

	public static void menu() {
		System.out.println("---------Menu---------");
		System.out.println("1.����  2.����  3.��  9.��������");
		System.out.println("----------------------");
		System.out.println("�Է� �ϼ��� => ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {
			GameJava.menu();
			Scanner sc = new Scanner(System.in);
			int no = sc.nextInt();
			System.out.println("no : " + no);

			if (no == 9) {
				System.out.println("�����մϴ�.");
				break;
			}

			// ��ǻ�� �� ���� �߻�
			Random random = new Random();
			int comno = random.nextInt(3) + 1;
			System.out.println("��ǻ�� : " + comno);
			System.out.println("��� : " + no);
			
			// 1. �����
			// 2. ����� �̱� ���
			// 3. �׿� ����� �� ���
			
			if(no==comno) {
				System.out.println("�����ϴ�.");
			}
			else if((no==1)&&(comno==3)||
					(no==2)&&(comno==1)||(no==3)&&(comno==2)) {
				System.out.println("�̰���ϴ�.");
			}
			else {
				System.out.println("�����ϴ�.");
			}

		} // while()-----------

	}// main()---------------

}
