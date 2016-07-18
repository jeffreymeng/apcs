package apcs;

public class Day1 {

	public static void main(String[] args) {

		// ===================================================== Pratice 0 ==================================================================

		// int money = 15;
		// // while (money < 100) {
		// // money ++;
		// // System.out.println(money < 10 ? "Get more money!" : "I'm Rich!");
		// // }
		//
		// System.out.println(money < 10 ? "I don't have much money!" : money <
		// 20 ? "I have some money!" : "I'm Rich!");
		// // if (money < 10) {
		// // System.out.println("Get more money!");
		// // } else if (money < 20) {
		// // System.out.println("I don't have much money!");
		// // } else{
		// // System.out.println("I'm Rich!");
		// // }
		// // System.out.println(money);

		// ================================================== Challenge 0 ===========================================================================
/*
		 //create variable for temp of water.
		 //Print out wehter it is solid liquid or gas
		 //using celcius
		 int temp = 34;
		 if (temp < 0) {
		 System.out.println("Solid");
		 } else if (temp > 100) {
		 System.out.println("Gas");
		 } else {
		 System.out.println("Liquid");
		 }
		 //System.out.println(temp < 0 ? "Solid" : temp > 100 ? "Gas" :"Liquid");
*/
		// ================================================== Challenge 1 ===========================================================================
		/* same as # 0 but with grades
		 int grade = 68;
		 int gradeLastDigit = grade % 10;
		
		 if (grade >= 90) {
		 System.out.print("A");
		
		 } else if(grade >= 80) {
		 System.out.print("B");
		 } else if(grade >= 70) {
		 System.out.print("C");
		 } else if(grade >= 60) {
		 System.out.print("D");
		 } else {
		 System.out.print("F");
		 }
		// ============================================ challenge 1.25 extends challenge 1 ===================================================
		 if (grade >= 90 && gradeLastDigit > 3) {
		 System.out.print("+");
		 } else if (gradeLastDigit > 6 && grade > 60 ) {
		 System.out.print("+");
		 } else if (gradeLastDigit < 3 && grade > 60 ) {
		 System.out.print("-");
		 }
		 */
		// ================================================== Challenge 1.5 ===========================================================================
/*		for (int i = 1; i <= 10; i++) {
  			System.out.println(i);
		}
		*/
		// you can also use a while loop
		// ======================================== Challenge 1.75 =================================================================

/*	for (int i = 1000; i >= 1; i--) {
  			System.out.println(i);
		}
		*/
		// ====================================== Challenge 2 ====================================================
		//FIZZ BUZZ
		//if % 3 say Fizz
		//if % 5 say buzz
		/*
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
		*/
		// ==================================== Challenge 3 ==============================================================
		//Coolatz Conjecture
		//if number is even, divide by 2
		//if number is odd. mutiply by 3 and add 1
		//repeat
		//theory is you will always reach 1
		/*
		long start = 999999999;
		System.out.println("number:" + start);
		while (start != 1) {
			
			if (start % 2 == 0) {
				start = start / 2;
			} else {
				start = (start * 3) + 1;
			}
			System.out.println(start);
		}
		*/
		// ========================================== Lesson: Methods =============================================================
		
		//public means that you can use the method in other classes
		//static means it can be accessed directly rather than through an instance
		//void means it returns nothing. void is the output of the method main
		//for the method see end of public static void main bracket
		/*
		for (int i = 1; i <= 100; i ++) {
			collatz(i);
		}
		*/
		for (int i = 1; i <= 100; i ++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	/*
	 * Methods for the methods lesson
	public static void collatz(int start) {
		System.out.println("number:" + start);
		while (start != 1) {
			
			if (start % 2 == 0) {
				start = start / 2;
			} else {
				start = (start * 3) + 1;
			}
			System.out.println(start);
		}
	}
	
	
	//returns int
	// two methods same name. Decided based on input
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
	*/
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
