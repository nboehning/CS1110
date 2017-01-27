package homework.HW4;

// Author: Nathan Boehning
// Purpose: Implement a rectangle class and demonstrate the GetPerimeter and GetArea methods of that class.

public class Prob1 
{

	public static void main(String[] args)
	{
		// Instantiate the two rectangles
		Rectangle rec1 = new Rectangle(40, 4);
		Rectangle rec2 = new Rectangle(35.9, 3.5);
		
		// Print information for rectangle 1
		System.out.println("Rectangle 1");
		System.out.println("Width: " + rec1.width);
		System.out.println("Height: " + rec1.height);
		System.out.println("Area: " + rec1.GetArea());
		System.out.println("Perimeter: " + rec1.GetPerimeter());
		
		// Print information for rectangle 2
		System.out.println("Rectangle 2");
		System.out.println("Width: " + rec2.width);
		System.out.println("Height: " + rec2.height);
		System.out.println("Area: " + rec2.GetArea());
		System.out.println("Perimeter: " + rec2.GetPerimeter());
	}

}

class Rectangle
{
	// Variables
	double width = 1.0;
	double height = 1.0;
	
	// Constructors
	Rectangle(){ }
	
	Rectangle(double newHeight, double newWidth)
	{
		height = newHeight;
		width = newWidth;
	}
	
	// Methods
	double GetArea()
	{
		return width*height;
	}
	
	double GetPerimeter()
	{
		return (2 * width) + (2 * height);
	}
}
