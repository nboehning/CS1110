package homework.HW7;

import java.util.Scanner;

// Author: Nathan Boehning
/*
 * Purpose: Write a method to determine if a user inputed password meets require rules. Rules are:
 * 1- Most contain at lease 8 alpha or digit characters
 * 2- No other symbols besides alpha or digit
 * 3- Must contain at least 2 digits.
 */
public class Prob2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a password: ");
		String input = scan.nextLine();
		
		// Check for first solution
		if(checkPassword1(input))
			System.out.println(input + " is an acceptable password per checkPassword1 solution.");
		else
			System.out.println(input + " is not an acceptable password per checkPassword1 solution.");
		
		// Check for second solution
		if(checkPassword2(input))
			System.out.println(input + " is an acceptable password per checkPassword2 solution.");
		else
			System.out.println(input + " is not an acceptable password per checkPassword2 solution.");
		
		scan.close();
			
	}

	static boolean checkPassword1(String s)
	{
		// Create necessary variables and convert inputed string to character array
		boolean isAcceptable = false;
		char[] charArray = s.toCharArray();
		int REQUIRED_DIGITS = 2;
		int numDigits = 0;
		
		// Named block to escape from loop if invalid character is found
		passwordTest:
		{
			// If the inputed length is long enough
			if(charArray.length >= 8)
			{
				for(int i = 0; i < charArray.length; i++)
				{
					if(Character.isDigit(charArray[i]))
					{
						numDigits++;
					}
					else if(!Character.isAlphabetic(charArray[i]))
					{
						break passwordTest;
					}
				}
				if(numDigits >= REQUIRED_DIGITS)
					isAcceptable = true;
			}
		}
		
		// Otherwise output is acceptable is false as initialized
		return isAcceptable;
	}
	
	static boolean checkPassword2(String s)
	{			
		// Create necessary variables and convert inputed string to character array
		boolean isAcceptable = false;
		char[] charArray = s.toCharArray();
		int REQUIRED_DIGITS = 2;
		int numDigits = 0;
		boolean hasInvalidChar = false;
 
		// If the inputed length is long enough
		if(charArray.length >= 8)
		{
			for(int i = 0; i < charArray.length; i++)
			{
				if(Character.isDigit(charArray[i]))
					numDigits++;
				else if(!Character.isAlphabetic(charArray[i]))
				{
					hasInvalidChar = true;
					break;
				}
			}
		if(numDigits >= REQUIRED_DIGITS && hasInvalidChar == false)
			isAcceptable = true;
		}
		
		return isAcceptable;
	}
}
