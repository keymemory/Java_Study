package my.day02;

public class Average {

	/*
	 * 3���� ������ �ڹ�, �̻����, ��ǻ�ͱ����� �������� �����ϴ� �������� �����Ѵ�.
	 * ������������ ����� ���ϴ� �޼ҵ带 �����Ͻÿ�. (��ȯŸ���� ����, �Ű������� 3���� ������ �Է¹޴´�.)
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
