import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a number 1-26: ");
		double num = input.nextInt();
		char alpha;

		System.out.println("You have entered " + num);
		if(num >=1 && num <= 26) {
			alpha = (char) (num + 64);
			System.out.println("Character " + num + " of the alphabet is " + alpha);
		}else {
			System.out.println("Invalid Input! Number is outside of \n acceptable range");
		}
	}

}
