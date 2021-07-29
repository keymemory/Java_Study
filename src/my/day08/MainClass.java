package my.day08;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 ch1 = new Child1(PriceTable.RICE, PriceTable.BULGOGI,
				PriceTable.MILK, PriceTable.BANANA, PriceTable.AMOND);
		
		System.out.println(ch1.calculate());

	}

}
