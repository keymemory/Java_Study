package my.day02;

public class Average {

	/*
	 * 3개의 과목인 자바, 이산수학, 컴퓨터구조의 점수들을 저장하는 변수들을 선언한다.
	 * 과목점수들의 평균을 구하는 메소드를 정의하시오. (반환타입은 없고, 매개변수는 3개의 점수를 입력받는다.)
	 * average();
	 */
	
	int java;
	int math;
	int com;
	
	public void average(int java, int math, int com) {
		System.out.println((java+math+com)/3);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Average ar = new Average();
		ar.average(ar.java, ar.math, ar.com);
	}

}
