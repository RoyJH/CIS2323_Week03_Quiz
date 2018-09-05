import java.util.Scanner;

public class WhoGoesThere {
	public static void main (String[] args) {
		String first, last;
		int age;
		
		Scanner inputDevice = new Scanner (System.in);
		
		System.out.println("What is your first name?");
		first = inputDevice.nextLine();
		System.out.println("And what about your last name?");
		last = inputDevice.nextLine();
		System.out.println("How old are you?");
		age = inputDevice.nextInt();
		System.out.println("As long as you are over the age of " + (age-10) + " then");
		System.out.println("you are free to pass, " + first + " " + last + "!");
	}
}