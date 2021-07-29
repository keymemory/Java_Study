package my.day08;

public class Store1 extends HeadStore{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Store1 store1 = new Store1();
		store1.makeJang();

	}

	@Override
	public void makeKimchi() {
		// TODO Auto-generated method stub
		System.out.println("±èÄ¡Âî°³");
	}

	@Override
	public void makeBudae() {
		// TODO Auto-generated method stub
		System.out.println("ºÎ´ëÂî°³");
	}

	@Override
	public void makeBibim() {
		// TODO Auto-generated method stub
		System.out.println("ºñºö¹ä");
	}

	@Override
	public void makeJang() {
		// TODO Auto-generated method stub
		System.out.println("µÈÀåÂî°³");
	}

}
