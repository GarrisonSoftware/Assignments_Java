/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description: This is the Student class which implements Comparable<Student>. 
 * The Student class has variables Id, Name, Standing, and Major.
 * Last Modification: 10-22-22
 */
package assg6_garrisoncl21;


public class Student implements Comparable<Student> {

	private String id , name , standing, major;
	
	/**Four parameter Student Constructor
	 * 
	 * @param givenId
	 * @param givenName
	 * @param givenStanding
	 * @param givenMajor
	 */
	public Student(String givenId, String givenName, String givenStanding, String givenMajor)
	{
		id = givenId;
		name = givenName;
		standing = givenStanding;
		major = givenMajor;
	}
	
	/**getId method that returns the Student id.
	 * 
	 * @return
	 */
	public String getId()
	{
		return id;
	}
	
	/**getName method that returns the Student name.
	 * 
	 * @return
	 */
	public String getName()
	{
		return name;
	}
	
	/**getStanding method that returns the Student standing
	 * 
	 * @return
	 */
	public String getStanding()
	{
		return standing;
	}
	
	/**getMajor method that returns the Student major
	 * 
	 * @return
	 */
	public String getMajor()
	{
		return major;
	}
	
	/**setMajor method. It has a givenMajor parameter. It sets the Student major to the givenMajor.
	 * 
	 * @param givenMajor
	 */
	public void setMajor(String givenMajor)
	{
		major = givenMajor;
	}
	
	/**Overrides the toString method
	 * 
	 * @Overide
	 * @return
	 */
	public String toString()
	{
		return id +"," + name + "," + standing + "," + major ;
	}
	
	/**equals method. Has an Object parameter. If the Student id and the Object's id are the same return true, otherwise return false.
	 * 
	 * @return
	 */
	public boolean equals(Object obj)
	{
		if(obj == null)
		{
			return false;
		}
		
		if(obj instanceof Student)
		{
			Student temp = (Student)obj;
			return (this.id == temp.id);
		}
		
		else
		{
			return false;
		}
	}
	
	/**Overrides the compareTo method. Has a Student as a parameter. Compares two student ids. Returns a -1, 0, 1 depending on the order of the ids.
	 * 
	 * @Override
	 * @return
	 */
	public int compareTo(Student s1)
	{
		//returns a negative integer id this.id is first
		if(this.id.compareTo(s1.id) > 0)
		{
			return 1;
		}
		
		//if the two student ids (Strings) are equal returns a 0
		else if(this.id.compareTo(s1.id) == 0 )
		{
			return 0; 
		}
		
		//if s1.id is before this.id return -1
		else
		{
			return -1;
		}
	}
	
}
