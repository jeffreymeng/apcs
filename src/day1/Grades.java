package day1;

public class Grades {

	public static void main(String[] args) {
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
		// Challenge
		 if (grade >= 90 && gradeLastDigit > 3) {
		 System.out.print("+");
		 } else if (gradeLastDigit > 6 && grade > 60 ) {
		 System.out.print("+");
		 } else if (gradeLastDigit < 3 && grade > 60 ) {
		 System.out.print("-");
		 }

	}

}
