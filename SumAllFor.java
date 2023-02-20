import java.util.Scanner;

public class SumAllFor {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program will find the sum of all numbers till a specified maximum. ");
		
		System.out.print("Please enter the max number: ");
		int total = 0;
		int max = input.nextInt();
		for (int i=0; i <= max; i++) {
			total += i;
			System.out.println("Number " + i);
			}
		System.out.println("\nThe sum of all numbers from 0 till " + max + " is: " + total);

	}
}
