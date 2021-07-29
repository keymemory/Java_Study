package my.day09;

public class Actress implements PoliceMan, FireFighter, Chef{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PoliceMan act1 = new Actress();
		act1.canSearch();
		act1.canCatch();
		System.out.println();
		
		FireFighter act2 = new Actress();
		act2.canFire();
		act2.canSave();
		System.out.println();
		
		Chef act3 = new Actress();
		act3.canPizza();
		act3.canSpaghetti();

	}

	@Override
	public void canPizza() {
		// TODO Auto-generated method stub
		System.out.println("피자를 만들 수 있습니다.");
		
	}

	@Override
	public void canSpaghetti() {
		// TODO Auto-generated method stub
		System.out.println("스파게티를 만들 수 있습니다.");
		
	}

	@Override
	public void canFire() {
		// TODO Auto-generated method stub
		System.out.println("불을 끌 수 있습니다.");
		
	}

	@Override
	public void canSave() {
		// TODO Auto-generated method stub
		System.out.println("사람을 구할 수 있습니다.");
		
	}

	@Override
	public void canSearch() {
		// TODO Auto-generated method stub
		System.out.println("잃어버린 물건을 찾을 수 있습니다.");
		
	}

	@Override
	public void canCatch() {
		// TODO Auto-generated method stub
		System.out.println("범인을 찾을 수 있습니다.");
		
	}

}
