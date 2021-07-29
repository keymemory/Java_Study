package my.day09;

public class AirPlane implements Missile, Light, Toy {

	public void AirPlane() {
		System.out.println("비행기입니다.");
	}
	
	@Override
	public void light() {
		// TODO Auto-generated method stub
		System.out.println("불빛 발사가 가능합니다.");

	}

	@Override
	public void missile() {
		// TODO Auto-generated method stub
		System.out.println("미사일을 발사 할 수 있습니다.");

	}

}
