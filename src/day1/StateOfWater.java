package day1;

public class StateOfWater {

	public static void main(String[] args) {
		 int temp = 34;
		 if (temp < 0) {
		 System.out.println("Solid");
		 } else if (temp > 100) {
		 System.out.println("Gas");
		 } else {
		 System.out.println("Liquid");
		 }
		 //System.out.println(temp < 0 ? "Solid" : temp > 100 ? "Gas" :"Liquid");
	}

}
