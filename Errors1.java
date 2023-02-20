import java.util.Scanner;
// Did not have scanner
public class Errors1 {

	public static void main(String[] args) { 
		// Needed a bracket 
		System.out.println("Can you spot and fix the errors?");
//Wrong quotations
		System.out.println("Enter two numbers and I will ");
		System.out.println("add them for you");

		int n1, n2;

		Scanner keyboard = new Scanner(System.in);
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();
		// Needs a scanner and semicolon
		System.out.println("The sum of the numbers is");
		// Forgot the .out
		System.out.println(n1 + n2);
//Subtracted instead of added		
}
}