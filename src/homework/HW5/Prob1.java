package homework.HW5;

// Author: Nathan Boehning
// Purpose: Create and test an n-side polygon class.

public class Prob1 
{

	public static void main(String[] args)
	{
		// Instantiate the polygons
		RegularPolygon poly1 = new RegularPolygon();
		RegularPolygon poly2 = new RegularPolygon(6,4);
		RegularPolygon poly3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		// Display information about polygons
		System.out.println("Polygon 1");
		System.out.println("Perimeter: " + poly1.GetPerimeter());
		System.out.println("Area: " + poly1.GetArea());
		
		System.out.println("Polygon 2");
		System.out.println("Perimeter: " + poly2.GetPerimeter());
		System.out.println("Area: " + poly2.GetArea());
		
		System.out.println("Polygon 3");
		System.out.println("Perimeter: " + poly3.GetPerimeter());
		System.out.println("Area: " + poly3.GetArea());
	}

}

class RegularPolygon
{
	// Variables
	int numSides = 3;
	double sideLength = 1.0;
	double xCoord = 0.0;
	double yCoord = 0.0;
	
	// Constructors
	RegularPolygon(){ }
	
	RegularPolygon(int newSide, double newLength)
	{
		numSides = newSide;
		sideLength = newLength;
	}
	
	RegularPolygon(int newSide, double newLength, double newX, double newY)
	{
		numSides = newSide;
		sideLength = newLength;
		xCoord = newX;
		yCoord = newY;
	}
	
	// Getter and Setters
	int GetNumSides()
	{
		return numSides;
	}
	
	void SetNumSides(int newSide)
	{
		numSides = newSide;
	}
	
	double getSideLength()
	{
		return sideLength;
	}
	
	void SetSideLength(double newLength)
	{
		sideLength = newLength;
	}
	
	double getX()
	{
		return xCoord;
	}
	
	void SetX(double newX)
	{
		xCoord = newX;
	}
	
	double GetY()
	{
		return yCoord;
	}
	
	void SetY(double newY)
	{
		yCoord = newY;
	}
	
	// Methods
	double GetPerimeter()
	{
		return (sideLength * numSides);
	}
	
	double GetArea()
	{
		return (numSides * sideLength * sideLength) / (Math.tan(Math.PI / numSides) * 4);
	}
}