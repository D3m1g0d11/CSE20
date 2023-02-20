import java.util.Scanner;

public class Errors5 {

	public static void main(String[] args) {

		
		Scanner keyboard = new Scanner(System.in);
		//needed Scanner
		int weight, age;
		//needed definition
		System.out.print("What is your weight in kg? " );
		weight = keyboard.nextInt();
		System.out.print("What is your age? ");
		age = keyboard.nextInt();

		System.out.println("Wow! You are " + (int) (age*6.9) + " in dog years.");
		System.out.println("Your weight in lbs is " + (int) (weight * 2.2) + " with no decimal point");
		keyboard.close();
		// close scanner
	}

}