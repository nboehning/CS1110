package homework.HW2;

import java.util.Random;

/* Nathan Boehning
 * CS 1110
 * HW2
 * Program Description: This program displays the number of occurrences of each number that is 
 * randomly generated from 1 to 5 inclusively.
 */

public class Prob2 
{

	public static void main(String[] args)
	{
		// variables to randomly generate numbers, and store the instances of each number
		Random rand = new Random();
		int numOne = 0;
		int numTwo = 0;
		int numThree = 0;
		int numFour = 0;
		int numFive = 0;
		
		// loop through 10 times
		for(int i = 0; i < 10; i++)
		{
			// get a new random number between 1 and 5
			int newNum = rand.nextInt(5) + 1;
			
			// switch to determine what the new number was
			// increments the respective variable
			switch(newNum)
			{
				case(1):
					numOne++;
					break;
				case(2):
					numTwo++;
					break;
				case(3):
					numThree++;
					break;
				case(4):
					numFour++;
					break;
				case(5):
					numFive++;
					break;
				default:
					System.out.println("Error occurred, invalid number generated");
					break;
			}
		}
		
		// output the results
		System.out.println("Number		Appears");
		System.out.println("  1                " + numOne);
		System.out.println("  2                " + numTwo);
		System.out.println("  3                " + numThree);
		System.out.println("  4                " + numFour);
		System.out.println("  5                " + numFive);
	}

}
