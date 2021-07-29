package hangman;

import java.util.Random;

public class Computer {

	String[] m_key = { "Boolean", "Integer", "System", "Thread", "StringBuffer", "Package", "Class", "Object", "Void" };

	StringBuffer m_user;
	String m_word;
	int m_level;
	int index;

	// ������ �޼ҵ忡�� Random��ü �̿��Ͽ� m_key �� �ϳ��� �����ϰ� �� ���� m_user�� '-'�� �ʱ�ȭ
	// m_level�� �غ�(0)���� �ʱ�ȭ
	public Computer() {
		Random rand = new Random();
		index = rand.nextInt(m_key.length - 1);
		m_word = m_key[index];
		m_level = 0;
		m_user = new StringBuffer();

		for (int i = 0; i < m_word.length(); i++)
			m_user.append("-");
	}// ������

	public void showEndMsg(boolean isWin) {
		String msg;

		if (isWin == true)
			msg = "�������� ���ϼ̽��ϴ�.";
		else
			msg = "������ ���� �Ǿ����ϴ�.";

		System.out.println(msg);
	}

	public void showHangMan() {
		System.out.println("=== ���� �ܰ�===");
		switch (m_level) {
		case 0:
			System.out.println(" ����������������");
			System.out.println(" ��      ��");
			System.out.println("        ��");
			System.out.println("        ��");
			System.out.println("        ��");
			System.out.println("        ��");
			System.out.println();
			break;

		case 1:
			System.out.println(" ����������������");
			System.out.println(" ��      ��");
			System.out.println("����      ��");
			System.out.println("        ��");
			System.out.println("        ��");
			System.out.println();
			break;

		case 2:
			System.out.println(" ����������������");
			System.out.println(" ��      ��");
			System.out.println("������     ��");
			System.out.println("        ��");
			System.out.println("        ��");
			System.out.println();
			break;

		case 3:
			System.out.println(" ����������������");
			System.out.println(" ��      ��");
			System.out.println("������     ��");
			System.out.println(" ��      ��");
			System.out.println("        ��");
			System.out.println();
			break;

		case 4:
			System.out.println(" ����������������");
			System.out.println(" ��      ��");
			System.out.println("������     ��");
			System.out.println(" ��      ��");
			System.out.println("����      ��");
			System.out.println();
			break;

		case 5:
			System.out.println(" ����������������");
			System.out.println(" ��      ��");
			System.out.println("������     ��");
			System.out.println(" ��      ��");
			System.out.println("������     ��");
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
