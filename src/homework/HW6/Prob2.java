package homework.HW6;

//Author: Nathan Boehning
//Purpose: Create a 2D circle class. Demonstrate methods of the class.

public class Prob2
{

	public static void main(String[] args)
	{
		// Initialize new circle
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		
		// Display info about c1
		System.out.println("Area of c1: " + c1.getArea());
		System.out.println("Perimeter of c1: " + c1.getPerimeter());
		
		// Display output of methods of c1
		System.out.println("Does c1 contain (3, 3)?: " + c1.contains(3, 3));
		System.out.println("Does c1 contain new circle (4, 5, 10.5)?: " + c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println("Does c1 overlap new circle (3, 5, 2.5)?: " + c1.contains(new Circle2D(3, 5, 2.3)));
	}

}

class Circle2D
{
	// Variables
	double x = 0;
	double y = 0;
	double radius = 1;
	
	// Constructors
	Circle2D(){	}
	
	Circle2D(double newX, double newY, double newRadius)
	{
		x = newX;
		y = newY;
		radius = newRadius;
	}
	
	// Getters
	double getX()
	{
		return x;
	}
	
	double getY()
	{
		return y;
	}
	
	double getRadius()
	{
		return radius;
	}
	
	double getArea()
	{
		return Math.PI * (radius * radius);
	}
	
	double getPerimeter()
	{
		return 2 * Math.PI * radius;
	}
	
	// Public Methods
	boolean contains(double xVal, double yVal)
	{
		return (distance(x, y, xVal, yVal) <= radius);
	}
	
	boolean contains(Circle2D circle)
	{
		return (distance(x, y, circle.getX(), circle.getY()) + circle.getRadius() <= radius);
	}
	
	boolean overlaps(Circle2D circle)
	{
		return (distance(x, y, circle.getX(), circle.getY()) <= (radius + circle.getRadius()));
	}
	
	// Private Methods
	double distance(double x1, double y1, double x2, double y2)
	{
		return Math.sqrt((x1 - x2) * (x1 - x1) + (y1 - y2) * (y1 - y2));
	}
}