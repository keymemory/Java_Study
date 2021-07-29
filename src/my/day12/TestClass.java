package my.day12;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest t = new ThreadTest();
		
		Thread thread = new Thread(t, "A");
		thread.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("TestClass");

	}

}
