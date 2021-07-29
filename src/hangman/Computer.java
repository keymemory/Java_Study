package hangman;

import java.util.Random;

public class Computer {

	String[] m_key = { "Boolean", "Integer", "System", "Thread", "StringBuffer", "Package", "Class", "Object", "Void" };

	StringBuffer m_user;
	String m_word;
	int m_level;
	int index;

	// 생성자 메소드에서 Random객체 이용하여 m_key 중 하나를 선택하고 그 값을 m_user에 '-'로 초기화
	// m_level은 준비(0)으로 초기화
	public Computer() {
		Random rand = new Random();
		index = rand.nextInt(m_key.length - 1);
		m_word = m_key[index];
		m_level = 0;
		m_user = new StringBuffer();

		for (int i = 0; i < m_word.length(); i++)
			m_user.append("-");
	}// 생성자

	public void showEndMsg(boolean isWin) {
		String msg;

		if (isWin == true)
			msg = "사형수를 구하셨습니다.";
		else
			msg = "사형이 집행 되었습니다.";

		System.out.println(msg);
	}

	public void showHangMan() {
		System.out.println("=== 집행 단계===");
		switch (m_level) {
		case 0:
			System.out.println(" ┌──────┐");
			System.out.println(" ○      │");
			System.out.println("        │");
			System.out.println("        │");
			System.out.println("        │");
			System.out.println("        │");
			System.out.println();
			break;

		case 1:
			System.out.println(" ┌──────┐");
			System.out.println(" ○      │");
			System.out.println("┌┤      │");
			System.out.println("        │");
			System.out.println("        │");
			System.out.println();
			break;

		case 2:
			System.out.println(" ┌──────┐");
			System.out.println(" ○      │");
			System.out.println("┌┼┐     │");
			System.out.println("        │");
			System.out.println("        │");
			System.out.println();
			break;

		case 3:
			System.out.println(" ┌──────┐");
			System.out.println(" ○      │");
			System.out.println("┌┼┐     │");
			System.out.println(" │      │");
			System.out.println("        │");
			System.out.println();
			break;

		case 4:
			System.out.println(" ┌──────┐");
			System.out.println(" ○      │");
			System.out.println("┌┼┐     │");
			System.out.println(" │      │");
			System.out.println("┌┴      │");
			System.out.println();
			break;

		case 5:
			System.out.println(" ┌──────┐");
			System.out.println(" ○      │");
			System.out.println("┌┼┐     │");
			System.out.println(" │      │");
			System.out.println("┌┴┐     │");
			System.out.println();
			break;

		}
	}

	public int checkEnd() {
		String t_msg;
		t_msg = m_user.toString();

		if (t_msg.equals(m_key[index]))
			return 1;
		if (m_level >= 5)
			return 2;

		return 0;

	}

	public int checkLevel(char msg) {
		boolean find = false;

		for (int i = 0; i < m_key[index].length(); i++) {
			if (m_key[index].charAt(i) == msg) {
				if (m_user.charAt(i) == '-') {
					m_user.setCharAt(i, msg);
					find = true;
					break;
				}
			}
		} // for()-----------

		if (find == false)
			m_level++;

		return checkEnd();
	}
	
	

}
