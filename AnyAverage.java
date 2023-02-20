import java.util.Scanner;

public class AnyAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program will find the average of as many numbers as you like.");
		
		System.out.print("\nPlease choose the number of values to average: ");
		int max = input.nextInt();
		int i = 1;
		int total = 0;
		int j = 0;
		while ( i <= max) {
			System.out.print("Please enter the " + i + " number: ");
			j = input.nextInt();
			i++;
			total += j;
		}
		double avg = (double)(total/max);
		System.out.println("\nThe average of all the numbers is: " + avg);
	}

}
