package my.day08;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StarCarLowGrade scl = new StarCarLowGrade(CarSpecs.COLOR_RED, CarSpecs.TIRE_A, CarSpecs.DISPLACEMENT_A,
				CarSpecs.HANDLE_A);

		StarCarHighGrade sch = new StarCarHighGrade(CarSpecs.COLOR_BLUE, CarSpecs.TIRE_B, CarSpecs.DISPLACEMENT_B,
				CarSpecs.HANDLE_B);

		scl.getSpec();
		System.out.println();
		sch.getSpec();

	}

}
