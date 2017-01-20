package homework.HW2;

import java.util.Scanner;

public class Oops2 
{
  public static void main(String[] args) 
  {

	  int sum = 0;

	  Scanner console = new Scanner(System.in);

	  System.out.print("Is your money multiplied 1 or 2 times?");
	  int times = console.nextInt();
	  
	  System.out.println("And how much are you contributing? ");
	  int donation = console.nextInt();
	  
	  console.close();
	  
	  if (times == 1)
	  {
		  sum += donation;
	  }
	  else if (times == 2)
	  {

		  sum = sum + (2 * donation);

	  }
	 
	  System.out.println("The total is " + sum);
	  
  }
}