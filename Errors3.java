import java.util.Scanner;

public class Errors3{

	public static void main(String[] args) {
		Scanner kbd = new Scanner (System.in);
		//System.in needs to be in parentheses
		int numerator;
		int denominator;
		// Defined incorrectly and should not be in caps
		System.out.println("This program divides two numbers.");
		System.out.print("Enter the numerator: ");
		numerator = kbd.nextInt();
		System.out.print("Enter the denominator: ");
		denominator = kbd.nextInt();
		// Denominator was spelled wrong
		System.out.print(numerator);
		System.out.print("/");
		System.out.print(denominator);
		System.out.print(" = ");
		System.out.println((double) numerator/denominator);
		// Some prints are in caps
		// Needs .out
		// Line 17 and 19 needed System capitalized
	}
}	
//Needs brackets to open and close class