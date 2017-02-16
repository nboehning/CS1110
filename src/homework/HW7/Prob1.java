package homework.HW7;

import java.util.Scanner;

// Author: Nathan Boehning
// Purpose: Create a program that swaps the case (upper/lower) of a user inputed string.

public class Prob1 
{

	public static void main(String[] args) 
	{
		// Open scanner
		Scanner scanner = new Scanner(System.in);

		// Prompt user and get input
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		
		// Call swapCase function and assign output to variable
		String output = swapCase(input);
		
		// Display the output
		System.out.println("The new string is: " + output);
		
		// Close the scanner
		scanner.close();
	}
	
	public static String swapCase(String s)
	{
		// Convert inputed string to char array
		char[] charArrayOfString = s.toCharArray();
		
		// Loop through the character array and swap the cases
		for(int i = 0; i < charArrayOfString.length; i++)
		{
			if(Character.isUpperCase(charArrayOfString[i]))
				charArrayOfString[i] = Character.toLowerCase(charArrayOfString[i]);
			else
				charArrayOfString[i] = Character.toUpperCase(charArrayOfString[i]);
		}
		
		// Convert character array back to string
		String returnString = new String(charArrayOfString);
		
		// Return the string
		return returnString;
		
	}

}
