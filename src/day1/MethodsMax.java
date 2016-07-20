package day1;

public class MethodsMax {


	public static void main(String[] args) {
		
	}
	public static int max(int a,int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
		
		//return a > b ? a : b;
	}
	public static int max(int a,int b, int c) {
		return max(max(a, b), c);
	}
}
