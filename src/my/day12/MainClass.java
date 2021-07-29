package my.day12;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VoteThread voteLovation1 = new VoteThread();
		VoteThread voteLovation2 = new VoteThread();
		VoteThread voteLovation3 = new VoteThread();

		Thread location1 = new Thread(voteLovation1, "Location1");
		Thread location2 = new Thread(voteLovation2, "Location2");
		Thread location3 = new Thread(voteLovation3, "Location3");
		
		location1.start();
		location2.start();
		location3.start();

	}

}
