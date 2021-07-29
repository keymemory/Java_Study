package my.day07;

public class ChildMenu extends ParentMenu {

	public void makeGoGiChung() {
		System.out.println("쇠고기 청국장");
	}

	public void makeHotJang() {
		System.out.println("얼큰 된장국");
	}

	public void makeKongNaMul() {
		System.out.println("콩나물국");
	}

	public void makeNoSmellChung() {
		System.out.println("냄새 없는 청국장");
	}

	// 오버 라이딩
	public void makeJang() {
		System.out.println("냉이 된장국");
	}
}
