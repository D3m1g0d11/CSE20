import java.util.Scanner;

public class PosAverage {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 0 or less to stop entering numbers.");
		double average = 0;
		int value = 0;
		int total = 0;
		int i = 1;
		int j = 0;
		do{
			System.out.print("Enter value #" + i + ": ");
			value = input.nextInt();
			i++;
			if(value > 0) {
			total += value;
			j++;
			}
			}while(value > 0);
		average = (double) total/j;
		System.out.println("\nAverage is " + average);

	}

}
