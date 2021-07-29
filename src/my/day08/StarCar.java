package my.day08;

public abstract class StarCar {

	String color;
	String tire;
	int displacement;
	String handle;

	public StarCar(String color, String tire, int displacement, String handle) {
		this.color = color;
		this.tire = tire;
		this.displacement = displacement;
		this.handle = handle;
	}

	public abstract void getSpec();
}
