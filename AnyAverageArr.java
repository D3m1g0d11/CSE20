import java.util.Scanner;

public class AnyAverageArr {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will find the average of any set numbers.");
		System.out.print("\nPlease choose number of values to average: ");

		int max = input.nextInt();
		double ave = 0;
		double total = 0;
		
		System.out.print("Please choose column width for output formatting: ");
		
		int col = input.nextInt();
		
		int[] arr1 = new int[max];
		
		System.out.println("");
		int i = 1;
		if(max == 0) {
			System.out.println("\nNo numbers to average. Exiting program.");
		}else {
		for(i= 1; i<= max; i++) {
			System.out.print("Please enter value #" + i +": ");
			arr1[i-1] = input.nextInt();
			total += arr1[i-1];
		}
		System.out.println("\nThe numbers being averaged are ...");
		for(int k=1; k <= max; k++) {
			System.out.print(arr1[k-1] + " ");
			if(k%col == 0) {
				System.out.println("");
			
		}
		}
		ave = (double)(total/max);
		System.out.println("\nAverage is: " + ave);
		input.close();
		}
	}

}
