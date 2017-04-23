package homework.HW10;

import java.util.ArrayList;

public class TestGeometricThing
{
  /** Main method */
  public static void main(String[] args) 
  {
    // Declare and initialize two geometric objects
    GeometricThing geoThing1 = new Circle(5);
    GeometricThing geoThing2 = new Rectangle(5, 3);
    GeometricThing geoThing3 = new Square(5);
    GeometricThing geoThing4 = new Square(15);
    GeometricThing geoThing5 = new Square(25);
    GeometricThing geoThing6 = new Square(35);

    // Declare and initialize array list of GeometricThings
    ArrayList<GeometricThing> geoThings = new ArrayList<GeometricThing>();
    
    // Add the previously created things to the list
    geoThings.add(geoThing1);
    geoThings.add(geoThing2);
    geoThings.add(geoThing3);
    geoThings.add(geoThing4);
    geoThings.add(geoThing5);
    geoThings.add(geoThing6);
    
    System.out.println("The two objects have the same area? " +
      equalArea(geoThing1, geoThing2));

    // Display circle
    System.out.println("Circle");
    displayGeometricThing(geoThing1);

    // Display rectangle
    System.out.println("Rectangle");
    displayGeometricThing(geoThing2);

	// Display square
    System.out.println("Square");
	displayGeometricThing(geoThing3);
	
	System.out.println("Biggest Geometric Object info:");
	displayGeometricThing(findBiggestThing(geoThings));
	
	System.out.println("Sum of all areas: " + sumArea(geoThings) + "\n");
	
	System.out.println("Do circle and rectangle have same area? " +
	  equalArea(geoThing1, geoThing3));

  }

  /** A method for comparing the areas of two geometric objects */
  public static boolean equalArea(GeometricThing object1,GeometricThing object2) 
  {
   return object1.getArea() == object2.getArea();
  }

  /** A method for displaying a geometric object */
  public static void displayGeometricThing(GeometricThing object) 
  {

    System.out.println("The area is " + object.getArea());
    System.out.println("The perimeter is " + object.getPerimeter());
    System.out.println();

  }

  /** A method for summing all areas of the geometric objects in an array list  */
  public static double sumArea(ArrayList<GeometricThing> list)
  {
	  double returnVal = 0;
	  
	  for(int i = 0; i < list.size(); i++)
		  returnVal += list.get(i).getArea();
	  
	  return returnVal;
  }
  
  public static GeometricThing findBiggestThing(ArrayList<GeometricThing> list)
  {
	  int biggestIndex = 0;
	  
	  for(int i = 1; i < list.size(); i++)
	  {
		  if(list.get(i).getArea() > list.get(biggestIndex).getArea())
			  biggestIndex = i;
	  }
	  
	  return list.get(biggestIndex);
  }
}
