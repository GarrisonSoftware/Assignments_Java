/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description:This is the EventList class.
 * Last Modification: 11-15-22
 */


package assg8_garrisoncl21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;




public class EventList {

	ArrayList<Event> list = new ArrayList<Event>();
	/**this is the EventList default constructor
	 * it takes no parameters
	 */
	public EventList()
	{
		//ArrayList<Event> list = new ArrayList<Event>(); 

	}
	
	/**this method takes a givenEvent and adds it to the EventList
	 * 
	 * @param givenEvent
	 */
	public void insertEventList(Event givenEvent)
	{
	
		list.add(givenEvent);
		Collections.sort(list);

	}
	
	/**this method takes a givenEvent and removes it from the EventList
	 * 
	 * @param givenEvent
	 */
	public void removeEventList(Event givenEvent)
	{
		list.remove(givenEvent);
	}
	
	/**method that returns the event from the front of the EventList
	 * @return
	 */
	public Event getEvent()
	{
		
		return list.get(0);
		
	}
	
	/**method checks if the EventList is empty
	 * returns true if the EventList is empty 
	 * else return false
	 * @return
	 */
	public boolean eventListEmpty()
	{
		return list.isEmpty();
	}
	
	/**method loads data from a txt file
	 * takes a filename as the parameter
	 * 
	 * @param givenFileName
	 */
	public void loadData(String givenFileName)
	{
		String fileName = givenFileName;
		Scanner fileInput = null;
		int arrivalTime;
		int transactionTime;
		
		
		File inFile = new File(fileName);
		
		try
		{
			fileInput = new Scanner(inFile);
				
			while(fileInput.hasNextLine())
			{
				
				
				StringTokenizer line = new StringTokenizer(fileInput.nextLine());
				
				//this loop runs while the StringTokenizer line has tokens
				//the loop takes the tokens and assigns them to their appropriate variables
				//the variable are then plugged into the Event constructor
				while(line.hasMoreTokens())
				{
					arrivalTime = (Integer.parseInt(line.nextToken()));
					transactionTime = (Integer.parseInt(line.nextToken()));

				
					list.add(new Event('A',arrivalTime, transactionTime));
					
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
	
	
}
