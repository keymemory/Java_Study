package my.day10;

import java.io.IOException;

public class BIStream {

	/*
	 * Ű����κ��� �����͸� �о�ͼ� ǥ�������ġ(�����)�� ����ϱ�
	 * ������ �ҽ� : Ű����(System.in)
	 * ������ ������ : ȭ��(System.out)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int in = (int) System.in.read();
			while (in != 1) {
				System.out.write(in);

			}
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("�Է� ����");
		}

	}

}
