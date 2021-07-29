package my.day10;

import java.io.IOException;

public class BIStream {

	/*
	 * 키보드로부터 데이터를 읽어와서 표준출력장치(모니터)로 출력하기
	 * 데이터 소스 : 키보드(System.in)
	 * 데이터 목적지 : 화면(System.out)
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
			System.out.println("입력 오류");
		}

	}

}
