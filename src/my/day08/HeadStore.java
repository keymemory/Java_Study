package my.day08;

public abstract class HeadStore {

	// �߻� Ŭ���� : ��� 1�� �̻��� �߻� �޼ҵ带 ���� Ŭ������ ����
	// �߻� �޼ҵ� : ����(�ٵ�)�� ���� �޼ҵ�
	public abstract void makeKimchi();
	public abstract void makeBudae();
	public abstract void makeBibim();
	public abstract void makeJang();
	
	public void printInfo() {
		System.out.println("�θ� �߻� Ŭ����");
	}
}
