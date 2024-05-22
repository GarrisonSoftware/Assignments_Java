/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description: This is the StudentMIS class. This class contains the main method. It displays a menu for the user.
 * It allows the user to 1) display roster, 2) search for student by id, 3) add new student, 4) remove student, 
 * 5) search for student by major, 6)sort and save to file, 7) save to file, 8) and exit.
 * Last Modification: 10-22-22
 */

package assg6_garrisoncl21;

import java.util.*;

public class StudentMIS {

	public static void main(String[] args) {
		
		StudentList roster = new StudentList();
		String fileName = "assg6_data.txt";
		String id,name,standing,major;
		Student result;
		String selection = "0";
		ArrayList<Student> majorRoster;
		
		
		
		
		
		roster.loadData(fileName);
		Scanner kbd = new Scanner(System.in);
		
	
		while(!selection.equals("8"))
		{
			
			
			System.out.println("1. Display the Roster");
			System.out.println("2. Search for a Student by Id");
			System.out.println("3. Add a new Student");
			System.out.println("4. Remove a Student");
			System.out.println("5. Search for Students by Major");
			System.out.println("6. Sort and Save to File");
			System.out.println("7. Save to File");
			System.out.println("8. Exit");
			
			selection = kbd.nextLine();
			
			
			switch (selection)
			{
				case "1":
				{
					roster.displayRoster();
					System.out.println();
					
					
					
					System.out.println("Press Enter to continue...");
					kbd.nextLine();
					//kbd.nextLine();
					
					
					break;
				}
				
				case "2":
				{
					System.out.println("Enter an id to search for a Student:");
					
					
					result = roster.searchForStudent(kbd.next());
					if( result == null)
					{
						System.out.println("Student was not found!");	
					}
					
					else
					{
						System.out.println();
						System.out.println(result);
					}
					
					System.out.println("Press Enter to continue...\n");
					kbd.nextLine();
					kbd.nextLine();
					
					break;
				}
				
				case "3":
				{
					System.out.println("Enter an id for a new Student: ");
					id = kbd.next();
					
					if(roster.searchForStudent(id) != null)
					{
						System.out.println();
						System.out.println("That id is already in the roster!");
					}
					
					else
					{
						
						System.out.println("What is the Student's name?");
						name = kbd.next() + " " + kbd.next();
						
						
						System.out.println("What is the Student's academic standing?");
						standing = kbd.next();
						
						System.out.println("What is the Student's major?");
						major = kbd.next();
						
						roster.addStudent(id,name,standing,major);
						
					}
					
					System.out.println("Press Enter to continue...\n");
					kbd.nextLine();
					kbd.nextLine();
					
					break;
				}
				
				case "4":
				{
					System.out.println("Enter the id for the Student:");
					
					
					if(roster.removeStudent(kbd.next()))
					{
						System.out.println();
						System.out.println("Student removed!");
						
					}
					
					System.out.println("Press Enter to continue...\n");
					kbd.nextLine();
					kbd.nextLine();
					
					break;
				}
				
				case "5":
				{
					System.out.println("Enter a major: ");
					
					majorRoster = roster.getStudentsByMajor(kbd.next());
					
					if( majorRoster.size() > 0)
					{
						Iterator<Student> iter = majorRoster.iterator();
						while(iter.hasNext())
						{
							System.out.println(iter.next());
						}
					}
					
				
					else
					{
						System.out.println("There isn't a student with that major!");
					}
					
					System.out.println();
					System.out.println("Press Enter to continue...\n");
					kbd.nextLine();
					kbd.nextLine();
					
					break;
				}
				
				case "6":
				{
					
					roster.sort();
					roster.save();
					
					System.out.println();
					System.out.println("Press Enter to continue...\n");
					kbd.nextLine();
					kbd.nextLine();
					
					break;
				}
				
				case "7":
				{
					roster.save();
					
					System.out.println();
					System.out.println("Press Enter to continue...\n");
					kbd.nextLine();
					
					
					break;
				}
				
				case "8":
				{
					System.out.println();
					roster.save();
					System.out.println("Shutting down...");
					
					kbd.close();
					System.exit(0);
					
					break;
				}
				
				default:
				{
					System.out.println("That's not an option!");
					
					System.out.println("Press Enter to continue...");
					kbd.nextLine();
					//kbd.nextLine();
					
					break;
				}
			}
			
			
		}
		
		
		
	}
	


}
