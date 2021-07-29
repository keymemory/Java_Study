package my.day08;

public abstract class HeadStore {

	// 추상 클래스 : 적어도 1개 이상의 추상 메소드를 갖는 클래스를 말함
	// 추상 메소드 : 본문(바디)가 없는 메소드
	public abstract void makeKimchi();
	public abstract void makeBudae();
	public abstract void makeBibim();
	public abstract void makeJang();
	
	public void printInfo() {
		System.out.println("부모 추상 클래스");
	}
}
