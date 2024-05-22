/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description: This is the Course class created to be used in the CourseTest program.
 * Last Modification: 9-9-22
 */
package JunitTest;

public class Course {

	private String courseNo, title;
	private int credit;
	
	//this constructor takes givenCourseNo and givenTitle and initializes the variables courseNo and title
	//the credit is set to 3 by default
	public Course(String givenCourseNo,String givenTitle )
	{
		courseNo = givenCourseNo;
		title = givenTitle;
		credit = 3;
	}
	
	//this constructor takes givenCourseNo, givenTitle, and givenCredit 
	//it then initializes the variables courseNo, title, and credit with the given variables
	public Course(String givenCourseNo,String givenTitle, int givenCredit)
	{
		courseNo = givenCourseNo;
		title = givenTitle;
		credit = givenCredit;
	}
	
	//get method returns the courseNo
	public String getCourseNo() 
	{
		return courseNo;
	}
	
	//get method returns the title
	public String getTitle()
	{
		return title;
	}
	
	//get method returns the credit
	public int getCredit()
	{
		return credit;
	}
	
	//set method changes the title
	public void setTitle(String newTitle)
	{
		title = newTitle;
	}
	
	//set method changes the credit
	public void setCredit(int newCredit)
	{
		credit = newCredit;
	}
	
	//toString method over rides the toString with a new message
	public String toString()
	{
		return courseNo + " - " + title + "(" + credit + ")";
	}
	
	//prints the information of the course
	public void printInfo()
	{
		System.out.println(courseNo + " - " + title);
	}
}
