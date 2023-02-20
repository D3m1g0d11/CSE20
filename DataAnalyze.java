import java.util.Scanner;

public class DataAnalyze {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int totalOne = 0;
		int totalTwo = 0;
		int totalThree = 0;
		int totalFour = 0;
		
		int average1 = 0;
		int average2 = 0;
		int average3 = 0;
		int average4 = 0;
		
		int min;
		int max = 0;
		
		System.out.print("Please enter the sample size: ");
		int repeats = input.nextInt();
		if(repeats == 0) {
			System.out.println("No data to analyze. Ending program.");
		}else {
		int [] arr1 = new int[repeats];
		int [] arr2 = new int[repeats];
		int [] arr3 = new int[repeats];
		int [] arr4 = new int[repeats];
		int [] averageArray = new int[4];
		
		System.out.println("\nEnter numbers for Trial 1");
		
		for(int i = 1; i <= repeats; i++) {
			
			System.out.print("Enter sample #" + i + ": "); 
			arr1 [i-1] = input.nextInt();
			totalOne += arr1 [i-1];
			
		}
		
		System.out.println("\nEnter numbers for Trial 2");
	
		for(int i = 1; i <= repeats; i++) {
			System.out.print("Enter sample #" + i + ": "); 
			arr2 [i-1] = input.nextInt();
			totalTwo += arr2 [i-1];
			
		}
		System.out.println("\nEnter numbers for Trial 3");
		
		for(int i = 1; i <= repeats; i++) {
			System.out.print("Enter sample #" + i + ": "); 
			arr3 [i-1] = input.nextInt();
			totalThree += arr3 [i-1];
			
		}
		System.out.println("\nEnter numbers for Trial 4");
		for(int i = 1; i <= repeats; i++) {
			System.out.print("Enter sample #" + i + ": "); 
			arr4 [i-1] = input.nextInt();
			totalFour += arr4 [i-1];
			
		}
		average1 = totalOne/repeats;
		average2 = totalTwo/repeats;
		average3 = totalThree/repeats;
		average4 = totalFour/repeats;
		averageArray[0] = average1;
		averageArray[1] = average2;
		averageArray[2] = average3;
		averageArray[3] = average4;
		min = averageArray[0];
		max = averageArray[0];
		for(int i=0; i < 4; i++) {
		  
			if(averageArray[i] < min){
			min = averageArray[i];
		}
		for(int j=0; j < 4; j++) {
			
			if(averageArray[j] > max){
				max = averageArray[j];
			}
		}
		
		System.out.println("\tSample #\tTrial 1\tTrial 2\tTrial 3\tTrial 4");
		for(int j = 1; j <= repeats; j++) {
		System.out.println("\t"+ j +"\t\t"+ arr1 [j-1] + "\t" + arr2 [j-1] + "\t" + arr3 [j-1] + "\t" + arr4 [j-1]);
		}
		System.out.println("      ------------------------------------------------------------");
		System.out.println("Averages:\t\t"+ average1+"\t" +average2 + "\t"+ average3 +  "\t"+ average4 +" ");
	
		System.out.println("\nMin Average: " + min);
		System.out.println("Max Average: " + max);
		if(max == min) {
			System.out.println("\nThe trials match EXACTLY!");
		}else if(max < 2*min) {
			System.out.println("\nThe trials concur with each other!");
		}else {
			System.out.println("\nThe trials do NOT concur!");
		}
		}
	}
		

	}
}
