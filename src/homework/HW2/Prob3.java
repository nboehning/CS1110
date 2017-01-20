package homework.HW2;

import java.util.Scanner;

/* Nathan Boehning
 * CS 1110
 * HW2
 * Program Description: This program returns the index of the last instance of an inputed value.
 */

public class Prob3 {

	public static void main(String[] args) 
	{
		// Start a scanner
		Scanner scanner =  new Scanner(System.in);
		
		// Prompt for desired length of the array
		System.out.println("Enter the length of the array: ");
		
		// Store desired amount
		int arrayLen = scanner.nextInt();
		
		// Create an int array of the desired length
		int myArray[] = new int[arrayLen];
		
		// Prompt for the integers
		System.out.println("Enter " + myArray.length + " integers:");
		
		// Loop through and assign the integers
		for(int i = 0; i < myArray.length; i++)
		{
			myArray[i] = scanner.nextInt();
		}
		
		// Prompt for integer to search for index
		System.out.println("Enter an integer to find last index of: ");
		
		// Store the value
		int val = scanner.nextInt();
		
		// Close scanner
		scanner.close();
		
		// Get the value by calling the method.
		val = lastIndexOf(myArray, val);
		
		// switch statement to determine whether value is in array or not
		switch(val)
		{
			case(-1):
				// return -1, the value was not in the array
				System.out.println(val + ": the value you gave is not in the array.");
				break;
			default:
				// the value was in the array, return the index it was located at
				System.out.println("The last index of the value is: " + val);
				break;
		}
	}
	
	// Method to find the last index of an inputed value
	static int lastIndexOf(int[] array, int someIndex)
	{
		// Initialize to -1, where the value isn't in array
		int lastIndex = -1;
		
		// Loop through the array
		for(int i = 0; i < array.length; i++)
		{
			// if the current selection in array is the same as the inputed value
			if(array[i] == someIndex)
				// set the last index to the current index in array
				lastIndex = i;
		}
		
		// return the index
		return lastIndex;
	}
}
