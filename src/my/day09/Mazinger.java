package my.day09;

public class Mazinger implements Missile, Move, Toy {

	public void Mazinger() {
		System.out.println("마징가입니다.");
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("팔다리를 움직일 수 있습니다.");

	}

	@Override
	public void missile() {
		// TODO Auto-generated method stub
		System.out.println("미사일을 발사 할 수 있습니다.");

	}

}
