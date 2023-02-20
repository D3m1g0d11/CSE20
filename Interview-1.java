import java.util.Scanner;

public class InterviewThree {
	
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);

	String name;
	String hometown;
	String major;
	String music;
	String pressure;
	int age;
	
	System.out.println("What is your name? ");
	name = scan.nextLine();
	
	System.out.println("Where are you from? ");
	hometown = scan.nextLine();
	
	System.out.println("What is your major? ");
	major = scan.nextLine();
	
	System.out.println("How do you work under pressure in one adjective? ");
	pressure = scan.nextLine();
	
	System.out.println("How old are you? ");
	age = scan.nextInt();
	
	System.out.println("Who is your favorite artist? ");
	music = scan.next();
	
	
	System.out.println("Their name is " + name + ".");
	System.out.println("They are from " + hometown + ".");
	System.out.println("Their major is " + major + ".");
	System.out.println("They are " + age + " years old.");
	System.out.println("They listen to " + music + ".");
	System.out.print("They work " + pressure + " under pressure.");
	}
}