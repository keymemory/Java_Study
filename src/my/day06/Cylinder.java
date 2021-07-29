package my.day06;

public class Cylinder {
	Circle circle;
	double height;

	// ���� ����*����

	// ������ ����
	public Cylinder() {

	}

	public Cylinder(Circle circle, double height) {
		this.circle = circle;
		this.height = height;

	}

	public double getVolume() {
		return circle.getArea() * height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder cylinder = new Cylinder(); // �⺻ ������
		Circle circle = new Circle(2.8);

		Cylinder cylinder2 = new Cylinder(circle, 5.6);
		Cylinder cylinder3 = new Cylinder(new Circle(2.8), 5.6);
		System.out.println("������ ���� : " + cylinder3.getVolume());

	}

}

class Circle {
	double radius;
	static double PI = 3.141592;

	// ������
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getArea(double radius) {
		return radius * radius * PI;
	}

	public double getArea() {
		return radius * radius * PI;
	}
}