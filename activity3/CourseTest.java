/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description: This program uses the Course class to create and run tests on courses.
 * Last Modification: 9-9-22
 */

package activity3;


public class CourseTest {

	
	public static void main(String[] args) {
		//creates a course using the 2-parameter constructor
		Course c1 = new Course("CSCI 2540","Advance Data Structures ");
		
		//creates a course using the 3-parameter constructor
		Course c2 = new Course("CSCI 1010","Intro to Data Structures ",4);
		
		//prints out course c1's description using the toString method
		System.out.println("c1's description: ");
		System.out.println(c1.toString());
		System.out.println();
		
		//prints out course c2's description using the toString method
		System.out.println("c2's description: ");
		System.out.println(c2.toString());
		System.out.println();
		
		//sets the new title and credits for course c2 using the set method
		c2.setTitle("Data for babies");
		c2.setCredit(2);
		
		//Prints out the title and credits for course c2 using the get method
		System.out.println("The new title for course c2 after the set method is: " + c2.getTitle());
		System.out.println();
		System.out.println("The new credit for course c2 after set method is: " + c2.getCredit());
		System.out.println();
		
		
		
		System.out.println("The info of the courses using the printInfo method is:");
		System.out.println();
		
		//prints out the info of courses c1 and c2 using the printInfo method
		c1.printInfo();
		c2.printInfo();
	}
	
}


