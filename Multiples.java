import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number: ");

		int max = input.nextInt();
		System.out.print("Please enter the number whose multiples to print: ");
		int j = input.nextInt();
		int i = 0;
		System.out.println("Multiples of " + j + " from 1 till " + max + " are: ");
		while ( i <= max) {
			if(i % j == 0 && i != 0) {
			System.out.println("Number " + i);
			}
			i++;
			
		}

	}

}
