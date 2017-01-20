package homework.HW2;

/* Nathan Boehning
 * CS 1110
 * HW2
 * Program Description: This program overloads the "printMe" method to include different types of
 * parameters.
 */

public class Prob4 
{

	public static void main(String[] args)
	{
		// First overload
		System.out.println("First printMe overload: ");
		PrintMeOverload.printMe('a', 5);
		System.out.println();
		
		// Second overload
		System.out.println("Second printMe overload: ");
		PrintMeOverload.printMe(6, 5);
		System.out.println();
		
		// Third overload
		System.out.println("Third printMe overload: ");
		PrintMeOverload.printMe(5.2, 'a', 5);
		System.out.println();
		
		// Fourth overload
		System.out.println("Fourth printMe overload: ");
		PrintMeOverload.printMe("z", 5);
	}

}

class PrintMeOverload
{
	public static void printMe(char c, int n)
	{
		for(int i = 0; i < n; i++)
		{
			System.out.print(c);
		}
		
		System.out.println();
	}
	
	public static void printMe(int someInt, int n)
	{
		for(int i = 0; i < n; i++)
		{
			System.out.print(someInt);
		}
		
		System.out.println();
	}
	
	public static void printMe(double someDouble, char c, int n)
	{
		for(int i = 0; i < n; i++)
		{
			System.out.printf(someDouble + "" + c);
		}
		
		System.out.println();
	}
	
	public static void printMe(String s, int n)
	{
		for(int i = 0; i < n; i++)
		{
			System.out.print(s);
		}
		
		System.out.println();
	}
}
