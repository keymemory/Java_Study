package my.day09;

public class AirPlane implements Missile, Light, Toy {

	public void AirPlane() {
		System.out.println("������Դϴ�.");
	}
	
	@Override
	public void light() {
		// TODO Auto-generated method stub
		System.out.println("�Һ� �߻簡 �����մϴ�.");

	}

	@Override
	public void missile() {
		// TODO Auto-generated method stub
		System.out.println("�̻����� �߻� �� �� �ֽ��ϴ�.");

	}

}
