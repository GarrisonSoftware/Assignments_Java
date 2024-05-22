/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description: This is the StudentList class which implements StudentListInterface. 
 * The StudentList creates a roster,majorRoster, and backupRoster, which are an ArrayList of Students. 
 * Last Modification: 10-22-22
 */

package assg6_garrisoncl21;

import java.util.*; 
import java.io.*;

public class StudentList implements StudentListInterface {
	
	private ArrayList<Student> roster , majorRoster; //,backupRoster ;
	private boolean changes = false;
	private String fileName;
	
	/**StudentList default constructor. Creates an ArrayList<Student> named roster.
	 * 
	 */
	public StudentList()
	{
		roster = new ArrayList<Student>();
		//majorRoster = new ArrayList<Student>();
		//backupRoster = new ArrayList<Student>();
	}

	
	/**loadData method. This method is given a file name as the parameter. 
	 * It loads the data into the roster (an ArrayList of Students).
	 * 
	 * @param fileName
	 */
	public void loadData(String givenFileName)
	{
		fileName = givenFileName;
		Scanner fileInput = null;
		String givenId;
		String givenName;
		String givenStanding; 
		String givenMajor;
		
		
		File inFile = new File(fileName);
		
		try
		{
			fileInput = new Scanner(inFile);
				
			while(fileInput.hasNextLine())
			{
				
				//uses "," as the delimiter and breaks the line up into Id, Name, Standing, and Major
				StringTokenizer line = new StringTokenizer(fileInput.nextLine(),",");
				
				//this loop runs while the StringTokenizer line has tokens
				//the loop takes the tokens and assigns them to their appropriate variables
				//the variable are then plugged into the Student constructor and a new Student is added to the roster
				while(line.hasMoreTokens())
				{
					givenId = (line.nextToken());
					givenName = (line.nextToken());
					givenStanding = (line.nextToken());
					givenMajor = (line.nextToken());
					
					roster.add(new Student(givenId,givenName,givenStanding,givenMajor));
					
				}
		
				
			}
			
			
			fileInput.close();
			
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println();
			System.out.println(e.getMessage());
			System.out.println();
		}
	}
	
	
	/**displayRoster method. This method displays all the students in the ArrayList<Student> (roster).
	 * 
	 */
	public void displayRoster()
	{
		Iterator<Student> iter = roster.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
	
	
	/**searchForStudent method. This method receives an id as the parameter. 
	 * It searches the roster for the student with the given id. If a matching id is found the method returns the Student object.
	 * Otherwise it will return null if no student is found for the given id.
	 * @param id
	 * @return
	 */
	public Student searchForStudent(String id)
	{
		Student temp;
		Iterator<Student> iter = roster.iterator();
		while(iter.hasNext())
		{
			temp = iter.next();
			
			if(temp.getId().equals(id))
			{
				
				return temp;
				
			}
		}
		
		return null;
		
	}
	
	
	/**addStudent method. This method has four parameters id, name, standing, major. 
	 * If the student is not already apart of the roster then they will be added.
	 * If the student is added the method returns true, otherwise it will return false.
	 * @param id
	 * @param name
	 * @param standing
	 * @param major
	 * @return
	 */
	public boolean addStudent(String id, String name, String standing, String major)
	{
		if(searchForStudent(id) != null)
		{
			System.out.println("Student is already on the roster. ");
			return false;
		}
		
		else
		{
			
			roster.add(new Student(id,name,standing,major));
			changes = true;
			return true;
		}
	}
	
	
	/**removeStudent method. This method receives an id as a parrameter. It searches the roster for the given id. 
	 * If a student is found with the given id, then they are removed and the method returns true.
	 * If the student is not found in the roster then the method returns false.
	 * @param id
	 * @return
	 */
	public boolean removeStudent(String id)
	{
		if(searchForStudent(id) != null)
		{
			roster.remove(searchForStudent(id));
			changes = true;
			return true;
		}
		
		else
		{
			System.out.println("The student isn't part of the roster! ");
			return false;
		}
	}
	
	
	/**getStudentsbyMajor method. This method is given a major as the parameter. 
	 * It searches the roster for student with the given major it then adds the students to the majorRoster which is an ArrayList<Student>.
	 * The method then returns the majorRoster.
	 * @param givenMajor
	 * @return
	 */
	public ArrayList<Student> getStudentsByMajor(String givenMajor)
	{
		
		majorRoster = new ArrayList<Student> ();
		Student temp;
		Iterator<Student> iter = roster.iterator();
		
		while(iter.hasNext())
		{
			temp = iter.next();
			if(temp.getMajor().equals(givenMajor))
			{
				majorRoster.add(new Student(temp.getId(),temp.getName(),temp.getStanding(),temp.getMajor()));
				
			}
		}
		
		return majorRoster;
	}
	
	
	/**sort method. This method sorts all the students in the roster.
	 * It uses the compareTo method to accomplish this.
	 */
	public void sort()
	{
		Collections.sort(roster);
		changes = true;
	}
	
	/**save method. This method saves the current roster to a .txt file.
	 * 
	 */
	public void save()
	{
		if(changes)
		{	
			try
			{
				PrintWriter output = new PrintWriter(fileName);
			
				Iterator<Student> iter = roster.iterator();
				while(iter.hasNext())
				{
					output.println(iter.next());
				}
				
				changes = false;
				
				output.close();
				System.out.println("There were some changes!");
			}
		
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
		
	   }
		
		else if(!changes)
		{
			System.out.println("No changes have been made!");
		}
	}
	
	

}
