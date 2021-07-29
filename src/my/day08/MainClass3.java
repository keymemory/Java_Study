package my.day08;

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		IFunction aPhone = new APhone();
		IFunction bPhone = new BPhone();
		IFunction cPhone = new CPhone();

		IFunction[] ifunctions = { aPhone, bPhone, cPhone };
		*/
		
		IFunction[] ifunctions = { new APhone(), new BPhone(), new CPhone() };
		
		for(int i=0;i<ifunctions.length;i++) {
			ifunctions[i].callSenderRecive();
			ifunctions[i].canLte();
			ifunctions[i].tvRemoteController();
			System.out.println();
		}

	}

}
