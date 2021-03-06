package pushproject;

import java.util.Scanner;

public class ProjectFortuneTeller {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Hello! May I have your first name?");
		String firstName = input.nextLine().toUpperCase().trim();
		checkForQuit(firstName);

		System.out.println("How about your last name?");
		String lastName = input.nextLine().toUpperCase().trim();

		System.out.println("How about your age?");
		int age = input.nextInt();

		System.out.println("What about your birth month? (Input as Number!)");
		int monthBirth = input.nextInt();

		System.out.println("What is your favorite ROYGBIV color? (Type Help for help!)");
		String favColor = input.next().toLowerCase().trim();

		if (favColor.contains("help")) {

			System.out.println("Red Orange Yellow Green Blue Indigo Violet");
			System.out.println("");
			System.out.println("What is your favorite ROYGBIV color?");
			favColor = input.next().trim().toLowerCase();
		}

		System.out.println("");
		System.out.println("How many siblings do you have? (Number please!)");
		int siblings = input.nextInt();

		System.out.println("Ready for your fortune to be told?");
		System.out.println("");

		// AGE

		if (age % 2 != 0) {
			age = 82;
			// 82 YEARS TO RETIRE

		} else if (age % 2 == 0) {
			age = 16;
			// 16 YEARS TO RETIRE

		} else {
			System.out.println("Follow Instructions!");
			System.exit(0);
		}

		// COLORS

		if (favColor.contains("blue")) {
			favColor = "Truck";
			// TRUCK IS CAR

		} else if (favColor.contains("red")) {
			favColor = "Horse";
			// HORSE IS CAR

		} else if (favColor.contains("green")) {
			favColor = "Falcon";
			// FALCON IS CAR

		} else if (favColor.contains("orange")) {
			favColor = "Fancy Car";
			// FANCY CAR IS CAR

		} else if (favColor.contains("yellow")) {
			favColor = "Dumb Car";
			// DUMB CAR IS CAR

		} else if (favColor.contains("indigo")) {
			favColor = "Tesla";
			// ELON MUSK IS CAR

		} else if (favColor.contains("violet")) {
			favColor = "Starship";
			// STARSHIP IS CAR

		} else {
			System.out.println("Follow Instructions!");
			System.exit(0);
		}

		// Siblings

		String houseLoc;

		if (siblings == 0) {
			houseLoc = "Hollywood";
			// HOUSE HOLLYWOOD

		} else if (siblings == 1) {
			houseLoc = "Westerville Ohio";
			// HOUSE WESTERVILLE OHIO

		} else if (siblings == 2) {
			houseLoc = "England";
			// HOUSE ENGLAND

		} else if (siblings == 3) {
			houseLoc = "Japan";
			// HOUSE JAPAN

		} else if (siblings > 3) {
			houseLoc = "Trailer Park";
			// HOUSE TRAILER PARK

		} else {
			houseLoc = "Trash";
			System.out.println("Follow Instructions!");
			System.exit(0);
		}

		// Month

		if (monthBirth > 1 && monthBirth < 4) {
			monthBirth = 2792;
			// 2792 SALARY
		} else if (monthBirth > 5 && monthBirth < 8) {
			monthBirth = 50;
			// 50 SALARY
		} else if (monthBirth > 9 && monthBirth < 12) {
			monthBirth = 4206;
			// 4206 SALARY
		} else {
			System.out.println("Follow Instructions");
			System.exit(0);
		}

		System.out.println(firstName + " " + lastName + " will retire in " + age + " years with $" + monthBirth
				+ " in the bank a vacation home in " + houseLoc + " and travel by " + favColor);

	}

	// Will we get marked if we have comments in here

	public static void checkForQuit(String userInput) {

		if (userInput.contains("QUIT")) {
			System.out.println("No one likes a quitter");
			System.exit(0);

		}
	}
}
