package my.day09;

public class Mazinger implements Missile, Move, Toy {

	public void Mazinger() {
		System.out.println("��¡���Դϴ�.");
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("�ȴٸ��� ������ �� �ֽ��ϴ�.");

	}

	@Override
	public void missile() {
		// TODO Auto-generated method stub
		System.out.println("�̻����� �߻� �� �� �ֽ��ϴ�.");

	}

}
