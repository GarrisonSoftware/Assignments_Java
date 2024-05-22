/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description: This is the StudentListInterface. It holds the declarations of all the methods in the StudentList.
 * Last Modification: 10-22-22
 */

package assg6_garrisoncl21;

import java.util.ArrayList;

public interface StudentListInterface {

	/**loadData method. This method is given a file name as the parameter. 
	 * It loads the data into the roster (an ArrayList of Students).
	 * 
	 * @param fileName
	 */
	public void loadData(String givenFileName);
	
	
	/**displayRoster method. This method displays all the students in the ArrayList<Student> (roster).
	 * 
	 */
	public void displayRoster();
	
	
	/**searchForStudent method. This method receives an id as the parameter. 
	 * It searches the roster for the student with the given id. If a matching id is found the method returns the Student object.
	 * Otherwise it will return null if no student is found for the given id.
	 * @param id
	 * @return
	 */
	public Student searchForStudent(String id);
	
	
	/**addStudent method. This method has four parameters id, name, standing, major. 
	 * If the student is not already apart of the roster then they will be added.
	 * If the student is added the method returns true, otherwise it will return false.
	 * @param id
	 * @param name
	 * @param standing
	 * @param major
	 * @return
	 */
	public boolean addStudent(String id, String name, String standing, String major);
	
	
	/**removeStudent method. This method receives an id as a parrameter. It searches the roster for the given id. 
	 * If a student is found with the given id, then they are removed and the method returns true.
	 * If the student is not found in the roster then the method returns false.
	 * @param id
	 * @return
	 */
	public boolean removeStudent(String id);
	
	
	/**getStudentsbyMajor method. This method is given a major as the parameter. 
	 * It searches the roster for student with the given major it then adds the students to the majorRoster which is an ArrayList<Student>.
	 * The method then returns the majorRoster.
	 * @param givenMajor
	 * @return
	 */
	public ArrayList<Student> getStudentsByMajor(String givenMajor);
	
	
	/**sort method. This method sorts all the students in the roster.
	 * It uses the compareTo method to accomplish this.
	 */
	public void sort();
	
	
	/**save method. This method saves the current roster to a .txt file.
	 * 
	 */
	public void save();
	
}
