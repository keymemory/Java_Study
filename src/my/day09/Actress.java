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
		System.out.println("���ڸ� ���� �� �ֽ��ϴ�.");
		
	}

	@Override
	public void canSpaghetti() {
		// TODO Auto-generated method stub
		System.out.println("���İ�Ƽ�� ���� �� �ֽ��ϴ�.");
		
	}

	@Override
	public void canFire() {
		// TODO Auto-generated method stub
		System.out.println("���� �� �� �ֽ��ϴ�.");
		
	}

	@Override
	public void canSave() {
		// TODO Auto-generated method stub
		System.out.println("����� ���� �� �ֽ��ϴ�.");
		
	}

	@Override
	public void canSearch() {
		// TODO Auto-generated method stub
		System.out.println("�Ҿ���� ������ ã�� �� �ֽ��ϴ�.");
		
	}

	@Override
	public void canCatch() {
		// TODO Auto-generated method stub
		System.out.println("������ ã�� �� �ֽ��ϴ�.");
		
	}

}
