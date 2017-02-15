package homework.HW5;

import java.util.Scanner;

// Author: Nathan Boehning
// Create class and functions to determine if two lines intersect.

public class Prob2 
{

	public static void main(String[] args) 
	{
		// Start a scanner
		Scanner scanner =  new Scanner(System.in);
		
		// Prompt user for information
		System.out.println("Following the standard:\nAx + By = E\nCx + Dy = F\nEnter the values:");
		
		System.out.print("A: ");
		double a = scanner.nextDouble();
		System.out.print("B: ");
		double b = scanner.nextDouble();	
		System.out.print("C: ");
		double c = scanner.nextDouble();
		System.out.print("D: ");
		double d = scanner.nextDouble();
		System.out.print("E: ");
		double e = scanner.nextDouble();
		System.out.print("F: ");
		double f = scanner.nextDouble();
		
		// Create the equation
		LinearEquation equation = new LinearEquation(a, b, c, d, e, f);
		
		// Perform check and output results
		if(equation.IsSolvable())
			System.out.println("The solution is: (" + equation.GetX() + ", " + equation.GetY() + ").");
		else
			System.out.println("The equation has no solution.");
		
		scanner.close();
	}

}

class LinearEquation
{
	// Variables
	double a;
	double b;
	double c;
	double d;
	double e;
	double f;
	
	// Constructor
	LinearEquation(double newA, double newB, double newC, double newD, double newE, double newF)
	{
		a = newA;
		b = newB;
		c = newC;
		d = newD;
		e = newE;
		f = newF;
	}
	
	// Getters
	double GetA()
	{
		return a;
	}
	
	double GetB()
	{
		return b;
	}
	
	double GetC()
	{
		 return c;
	}
	
	double GetD()
	{
		return d;
	}
	
	double GetE()
	{
		return e;
	}
	
	double GetF()
	{
		return f;
	}
	
	// Return x intersection
	double GetX()
	{
		return ((e * d) - (b * f)) / ((a * d) - (b * c));
	}
	
	// return y intersection
	double GetY()
	{
		return ((a * f) - (e * c)) / ((a * d) - (b * c));
	}
	
	boolean IsSolvable()
	{
		if((a * d) - (b * c) != 0)
			return true;
		else
			return false;
	}
}
