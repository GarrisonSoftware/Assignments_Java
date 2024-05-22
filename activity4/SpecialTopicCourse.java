/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description: This is a subclass of the Course class.
 * Last Modification: 9-16-22
 */

package activity4;

public class SpecialTopicCourse extends Course {

	private String topic;
	
	//this constructor accepts three parameters CourseNo, Title, and Topic
	SpecialTopicCourse(String givenCourseNo, String givenTitle, String givenTopic)
	{
		
		super(givenCourseNo,givenTitle);
		topic = givenTopic;
	}
	
	//this constructor accepts four parameters CourseNo, Title, Topic, and Credit
	SpecialTopicCourse(String givenCourseNo, String givenTitle, String givenTopic, int givenCredit)
	{
		super(givenCourseNo, givenTitle, givenCredit);
		topic = givenTopic;
	}
	
	//method that returns topic
	public String getTopic()
	{
		return topic;
	}
	
	//method that sets a new topic
	public void setTopic(String newTopic)
	{
	
		topic = newTopic;
	}
	
	//overrides the toString method
	public String toString()
	{
		return getCourseNo() + "-" + getTitle() + "(" + getCredit() + ")" + "(" + topic + ")";
	}
	
	//overrides the printInfo method
	public void printInfo()
	{
		super.printInfo();
		System.out.println( "Topic: " + topic  );
		
	}
	
	//determines if two objects are equal
	public boolean equals(Object obj)
	{
		if (obj == null) 
			{
				return false;
			}
		
		if (obj instanceof SpecialTopicCourse) 
			{
				SpecialTopicCourse temp = (SpecialTopicCourse)obj;
				return (getCourseNo() == temp.getCourseNo() && getTopic() == temp.topic);
			}
		
		else
		{
			return false;
		}

		
	}
	
	
	
}
