import java.util.Scanner;
import java.util.Random;

public class BobcatHotel {

	public static void main(String[] args) {
		Random ranGen = new Random();
		Scanner scan = new Scanner(System.in);
		
//Room Prices		
		double singleBed = 50.50;
		double doubleBed = 75.00;
		double queenBed = 100.75;
		double kingBed = 150.25;
		double masterBed = 225.50;
//Meal Prices
		double standard = 30.00;
		double deluxe = 50.00;
		double indulgence = 85.00; //Only for Master Suites

		double total = 0;
		int guests;
		int roomChoice;
		int nights;
		int tripA;
		int clubMem;
		boolean tripleA = true;
		boolean clubMember = true;
		
		int randomNumber = 0; 
		int clubNights;
		
		double roomPricePerNight = 0;
		
		int mealPackage;
		double baseRoomCost = 0;
		double mealCost = 0;
		double aDiscount = 0;
		double clubDiscount = 0;
		double prelimCost = 0;

		System.out.println("ROOM OPTIONS");
		System.out.println("1. Single @ $50.50 per night");
		System.out.println("2. Double @ $75.00 per night");
		System.out.println("3. Queen @ $100.75 per night");
		System.out.println("4. King @ $150.25 per night");
		System.out.println("5. Master Suite @ $225.50 per night");

		System.out.println("");
/*inputs numbers such as :
 * guests
 * room choice 
 * nights
 * discounts applicable 
*/	
		System.out.print("Number of guests: ");
		guests = scan.nextInt();
		System.out.print("Please your choice of room (enter 1/2/3/4/5 corresponding to the options shown above): ");
		roomChoice = scan.nextInt();
		System.out.print("Please enter the number of nights: ");
		nights =scan.nextInt();
		System.out.print("Are you a AAA member (enter 1 for yes 0 for no)? ");
		tripA = scan.nextInt();
		if(tripA == 1) {
			tripleA = true;
		}else if (tripA == 0) {
			tripleA = false;	
		}
		System.out.print("Are you a club member (enter 1 for yes 0 for no)? ");
		clubMem = scan.nextInt();
		if(clubMem == 1) {
			clubMember = true;
			randomNumber = ranGen.nextInt(10);
			
		}else if (clubMem == 0){
			clubMember = false;
			randomNumber = 0;
		}

		System.out.println("");
//Club member discount
		if(clubMember == true && randomNumber >= 4) {
			System.out.println("Congratulations! You've qualified for our \"Stay 4 nights get 1 free promotion\" \r\nDiscount will be applied during checkout depending on the number of days");
			//System.out.println(randomNumber);
			System.out.println("");
		}else if(randomNumber < 4 && clubMember == true){
			System.out.println("Unfortunately, you didn't qualify for our \"Stay 4 nights get 1 free promotion\". Better luck \nnext time!");
			//System.out.println(randomNumber);
			System.out.println("");
		}

		
//Meal Plans
		System.out.println("MEAL PACKAGES (PRICES SHOWN ARE PER NIGHT)");
		System.out.println("0. Complementary @ $0 per guest");
		System.out.println("1. Standard @ $30 per guest");
		System.out.println("2. Deluxe @ $50 per guest");
		if (roomChoice == 5) {
			System.out.println("3. Indulgence @ $85 per guest");
		}
		System.out.println("");
//offers the indulgence if the customer wants Masters
		if (roomChoice == 5) {
			System.out.print("Please select your desired meal package (enter 0/1/2/3 corresponding to the options shown\r\n" + 
					"above): ");
			mealPackage = scan.nextInt();
		}else{
			System.out.print("Please select your desired meal package (enter 0/1/2 corresponding to the options shown\n" + 
					"above): ");
			mealPackage = scan.nextInt();
		}
//sets the room price and room math		
		if(roomChoice == 1) {
			roomPricePerNight = singleBed; 
		}else if(roomChoice == 2) {
			roomPricePerNight = doubleBed; 
		}else if(roomChoice == 3) {
			roomPricePerNight = queenBed; 
		}else if(roomChoice == 4) {
			roomPricePerNight = kingBed; 
		}else if(roomChoice == 5) {
			roomPricePerNight = masterBed; 
		}
		baseRoomCost = nights * roomPricePerNight;
//Sets the meal package and meal math
		if(mealPackage == 0) {
			mealCost = 0; 
		}else if(mealPackage == 1) {
			mealCost = guests * standard * nights; 
		}else if(mealPackage == 2) {
			mealCost = guests * deluxe * nights; 
		}else if(mealPackage == 3) {
			mealCost = guests * indulgence * nights; 
		}
//Sets sets the Preliminary cost
		prelimCost = mealCost + baseRoomCost;
//Triple A discount
		if(tripleA == true) {
		aDiscount = prelimCost * .1;	
		}
//Club Discount
		if(clubMember == true && randomNumber >= 4) {
		clubNights = nights/4;	
		clubDiscount = clubNights * roomPricePerNight;
		}
//Total
		total = prelimCost - aDiscount - clubDiscount; 
// Receipt 
		System.out.println(" ");
		System.out.println("CHECKOUT");
		System.out.println("Room Cost:               $" + baseRoomCost);
		if(mealPackage != 0) {
			System.out.println("Meal Cost:              +$" + mealCost);
		}
		System.out.println("Prelinary Total Cost: \t $" + prelimCost);
		if(tripleA == false && randomNumber < 4) {
			System.out.println("No Discounts Applied");
		}
		if(tripleA == true) {
			System.out.println("AAA Discount:           -$" + aDiscount);

		}if(randomNumber >= 4) {
			System.out.println("Club Member Discount:   -$"+clubDiscount);
		}
		System.out.println("Total Cost of Booking:\t $" + total);
	}
}


