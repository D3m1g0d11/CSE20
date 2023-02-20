import java.util.Scanner;

public class MultiplesFor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number: ");

		int max = input.nextInt();
		System.out.print("Please enter the number whose multiples to print: ");
		int j = input.nextInt();
		System.out.println("Multiples of " + j + " from 1 till " + max + " are: ");
		for (int i = 0; i <= max; i++) {
			if(i % j == 0 && i != 0) {
			System.out.println("Number " + i);
			}
			
			
		}

	}

}
