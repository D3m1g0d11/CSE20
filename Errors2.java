import java.util.Scanner;

public class Errors2 {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int number = 0;
		int theSquare = 0;

		System.out.print("Enter a number and I will");
		// forgot semicolon
		System.out.print(" square it for you: " );
		// Needed closing quotation
		number =  kbd.nextInt();
		// Wrong input
		theSquare = number * number;
		// line 16 was under comments and incorrectly defined
		System.out.print(number + " squared = ");
		System.out.println(theSquare);
		// Line 18 had no closing parenthesis Line 19 prints theSquare not the variable
	}
}