package day1;

public class MethodsPrime {

	public static void main(String[] args) {


	}
	public static boolean isPrime(int value) {
		if (value < 2) {
			return false;
		}
		for (int i = 2; i < value; i ++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

}
