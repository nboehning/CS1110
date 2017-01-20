package homework.HW2;

import java.util.Scanner;

/* Nathan Boehning
 * CS 1110
 * HW2
 * Program Description: This program displays the age of a person during a future year given their current age.
 */

public class Prob1 {

	public static void main(String[] args)
	{
		// open scanner
		Scanner scanner = new Scanner(System.in);
		
		// prompt for necessary information, assign the variables
		System.out.print("Enter name: ");
		String inName = scanner.next();
		System.out.print("Enter your age: ");
		int inAge = scanner.nextInt();
		System.out.print("Enter the target year: ");
		int inYear = scanner.nextInt();
		
		// close the scanner
		scanner.close();
		
		// call method to display the age
		displayFutureAge(inName, inAge, inYear);
	}
	
	// Method to display the age of the person in inputed number of years
	static void displayFutureAge(String name, int currentAge, int futureYear)
	{
		// int to hold the current year
		int curYear = 2016;		
		
		// calculate the new age
		int newAge = currentAge + (futureYear - curYear);
		
		// output the information
		System.out.println(name + " will be " + newAge + " years old in the year " + futureYear);
	}
}
