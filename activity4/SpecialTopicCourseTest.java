/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description: This program tests the Special Topic Course subclass. 
 * Last Modification: 9-16-22
 */

package activity4;

public class SpecialTopicCourseTest {

	public static void main(String[] args) {
		
		//uses the three parameter constructor to initialize the CourseNo, Title, and Topic
		SpecialTopicCourse c1 = new SpecialTopicCourse("8585","Algorithms for Astronauts","This class prepares astronauts for deep space travel.");
		
		//uses the four parameter constructor to initialize the CourseNo, Title, Topic, and Credit
		SpecialTopicCourse c2 = new SpecialTopicCourse("9090", "History of Peripherals","Historical overview on computer peripherals.", 5);
		
		//uses the three parameter constructor to initialize the CourseNo, Title, and Topic
		Course c3 = new SpecialTopicCourse("8585","Algorithms for Astronauts","This class prepares astronauts for deep space travel.");
		
		
		//uses the getTopic method to print c2's topic
		System.out.println("c2's topic: " + c2.getTopic());
		System.out.println();
		
		//the set method sets a new topic for c2
		c2.setTopic("This is a long and boring REQUIRED class on the history of peripherals. ");
		
		//uses the getTopic method to print c2's topic
		System.out.println("c2's topic after set method: " + c2.getTopic());
		System.out.println();
		
		//uses the toString method to print c1's info
		System.out.println("c1's info using the toString method: " + c1.toString());
		System.out.println();
		
		//uses the toString method to print c2's info
		System.out.println("c2's info using the toString method: " + c2.toString());
		System.out.println();
		
		//uses the toString method to print c3's info
		System.out.println("c3's info using the toString method: " + c3.toString());
		System.out.println();
		
		System.out.print("c1: ");
		//prints c1's info using the printInfo method
		c1.printInfo();
		System.out.println();
		
		System.out.print("c2: ");
		//prints c2's info using the printInfo method
		c2.printInfo();
		System.out.println();
		
		System.out.print("c3: ");
		//prints c3's info using the printInfo method
		c3.printInfo();
		System.out.println();
		
		//if statement to test whether c1 and c2 are equal or not
		if(c1.equals(c2))
		{
			System.out.println("c1 and c2 are equal.");
			
		}
		
		else
		{
			System.out.println("c1 and c2 are not equal.");
		}
		
		//if statement to test whether c1 and c3 are equal or not
		if(c1.equals(c3))
		{
			System.out.println("c1 and c3 are equal.");
		}
		
		else
		{
			System.out.println("c1 and c3 are not equal.");
		}
		
		
		
	}

}
