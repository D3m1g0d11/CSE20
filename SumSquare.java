import java.util.Scanner;

public class SumSquare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the max number: ");
		int square = 0;
		int total = 0;
		int max = input.nextInt();
		int i = 1;
		do{
			square = i*i;
			System.out.println("Number "+ i + " squared is " + square);
			i++;
			total += square;
			}while(i <= max);
		System.out.println("\nThe sum of squares of all numbers from 1 till " + max + " is: " + total);

	}

}
