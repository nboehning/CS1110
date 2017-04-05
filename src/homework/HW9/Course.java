package homework.HW9;

import java.util.ArrayList;

// Author: Nathan Boehning
// Purpose: Create a functioning course class
public class Course 
{
	// variables
	private String courseName;
	private ArrayList<String> students = new ArrayList<>();
	private int numberOfStudents;
	
	// Constructor with course name argument
	public Course(String courseName)
	{
		this.courseName = courseName;
	}
	
	// Adds a student to the course
	public void addStudent(String student)
	{
		students.add(student);
		numberOfStudents++;
	}
	
	// Converts the array list to array string, returns the array string
	public String[] getStudents()
	{
		String[] studentsArray = new String[students.size()];
		for(int i = 0; i < studentsArray.length; i++)
			studentsArray[i] = students.get(i);
		
		return studentsArray;
	}
	
	
	// Returns the number of students
	public int getNumberOfStudents()
	{
		return numberOfStudents;
	}
	
	// Returns the course name
	public String getCourseName()
	{
		return courseName;
	}
	
	// Method to drop student.
	public void dropStudent(String student)
	{
		// This was empty but I went ahead and implemented it since it was an exercise for ch 10 and
		// we are in chapter 11. Maybe done in class?
		
		// Only removes the first instance of that name to ensure all people with same name don't get removed.
		for(int i = 0; i < students.size(); i++)
		{
			if(students.get(i).equals(student))
			{
				students.remove(i);
				break;
			}
		}
	}

public static void main(String[] args) {
    Course course1 = new Course("Data Structures");
    Course course2 = new Course("Database Systems");

    course1.addStudent("Peter Jones");
    course1.addStudent("Brian Smith");
    course1.addStudent("Anne Kennedy");

    course2.addStudent("Peter Jones");
    course2.addStudent("Steve Smith");

    System.out.println("Number of students in course1: "
        + course1.getNumberOfStudents());
    String[] students = course1.getStudents();
    for (int i = 0; i < course1.getNumberOfStudents(); i++)
      System.out.print(students[i] + ", ");

    System.out.println();
    System.out.print("Number of students in course2: "
        + course2.getNumberOfStudents());
  }
}
