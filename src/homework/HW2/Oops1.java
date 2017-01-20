package homework.HW2;
//This program will display the smaller of the two
//numbers a and b. Assume that a and b will never be
//equal.

/*
 * Syntax errors:
 * 1 - Comma between a = 7, b = 42. Not semicolon
 * 2 - line 19, the methods return isn't being set to a variable
 * 3 - line 21, should be smaller == a
 * 4 - line 38, is already an int, doesn't need to be int again
 * 5 - set return type of minimum to int
 * 6 - smaller in the minimum method wasn't declared correctly
 * 7 - line 24, variables a and b are already declared as ints
 * 8 - else statement doesn't get a conditional statement
 * 	   switched to else if, does require conditional. Switched => to >=
 */

public class Oops1 
{
  public static void main(String[] args)
  {
	  int a = 7, b = 42;  //declaration of local variables.
	  int smaller = minimum(a, b);  //call method to find the min. of a and b.
	  if (smaller == a)  // this branch is taken if a is < b.
		  System.out.println("a is the smallest!");
	  else System.out.println("b is the smallest!");

  }

  public static int minimum(int a, int b)
  {
	  int smaller = 0;
	  if (a < b)
	  {
		  smaller = a;
	  }
	  else if(a >= b)
	  {
		  smaller = b;
	  }
	  //return the variable smaller, which should contain the smaller of a & b.
	  return smaller;
  }
}