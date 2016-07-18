package apcs;

public class FizzBuzz {


	public static void main(String[] args) {
int stop = 100;
		
		for (int i = 1;i <= stop; i ++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0 && i % 5 != 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0 && i % 3 != 0 ) {
				System.out.println("Buzz");
			} else if (i % 3 != 0 && i % 5 != 0) {
				System.out.println(i);
			}
		}

	}

}
