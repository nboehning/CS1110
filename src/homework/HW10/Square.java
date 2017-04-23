package homework.HW10;

public class Square extends GeometricThing
{
	// Variables
	private double side = 1.0;
	
	// Constructors
	Square(){  }
	
	Square(double sideLen)
	{
		side = sideLen;
	}
	
	public double getSide()
	{
		return side;
	}
	
	public String toString()
	{
		return "Side length: " + side;
	}

	@Override
	public double getArea() 
	{
		return side * side;
	}

	@Override
	public double getPerimeter() 
	{
		return side * 4;
	}
}



