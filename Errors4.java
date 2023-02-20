import java.util.Scanner;

public class Errors4 {

	public static void main(String[] args) {

		int n1, n2;

		Scanner kbd = new Scanner(System.in);
		// no scanner
		System.out.println("This program asks the user for two integers and calculates their sum as an integer.");

		kbd = new Scanner(System.in);

		
// n1 input is in the wrong spot
		System.out.print("Enter the first number: ");
		n1 = kbd.nextInt();
		System.out.print("Enter the second number: ");
		n2 = kbd.nextInt();
		//Should be Int
		System.out.println("The sum of the numbers is " + (int)(n1+n2));
		// Should be Int
		kbd.close();
		// close the scanner
	}

}