import java.util.Scanner;

public class SumAll {
	
	public static void main(String[] args) {
		
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("This program will find the sum of all numbers till a specified maximum. ");
	
	System.out.print("Please enter the max number: ");
	int total = 0;
	int max = input.nextInt();
	int i = 0;
	while ( i <= max) {
		total += i;
		System.out.println("Number " + i);
		i++;
		}
	System.out.println("\nThe sum of all numbers from 0 till " + max + " is: " + total);
	}
}
