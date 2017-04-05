package homework.HW9;

import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;
// Author: Nathan Boehning
// Purpose: Incorporate an array index out of bounds exception into a program.



public class Prob2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[100];
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = (int)(Math.random() * 1000);
		
		try
		{
			System.out.print("Input an index to retrieve that data: ");
			int index = scan.nextInt();
			System.out.println("Value at index is: " + numbers[index]);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Index out of bounds");
			System.out.println(ex);
		}
		
		scan.close();
		System.out.println("Exiting...");
	}
}
