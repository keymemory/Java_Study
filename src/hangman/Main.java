package hangman;

import java.util.Scanner;

public class Main {

	Scanner m_key;
	Computer m_com;

	public Main() {
		m_key = new Scanner(System.in);
		m_com = new Computer();

	}

	public char getKey() {
		String msg = "error";
		char a;
		System.out.println("¾ËÆÄºª ÀÔ·Â : ");
		msg = m_key.nextLine();
		a = msg.charAt(0);

		return a;

	}

	public void run() {
		int result;
		char msg;

		while (true) {
			System.out.println("ÈùÆ® : " + m_com.m_user);
			msg = getKey();
			result = m_com.checkLevel(msg);
			m_com.showHangMan();

			if (result == 1) {
				m_com.showEndMsg(true);
				break;
			} else if (result == 2) {
				m_com.showEndMsg(false);
				break;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main ma = new Main();
		ma.getKey();
		ma.run();

	}

}
