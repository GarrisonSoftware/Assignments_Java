/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description:This program simulates the line in a bank using one teller.
 * Last Modification: 11-15-22
 */

package assg8_garrisoncl21;

import java.util.*;
public class Simulation {

	public static void main(String[] args) {
		
		String fileName = "assg8_input.txt";
		int currentTime = 0;
		int departureTime = 0;
		int people = 0;
		double averageTime = 0;
		int waitTime = 0;
		
		Event nextEvent;
		Queue<Event> line = new LinkedList<>();
		EventList list = new EventList();
		
		
	
		
		//loads the data from the txt file
		list.loadData(fileName);
		
		
		
		System.out.println("Simulation begins.");

	
		while(!list.eventListEmpty()) 
		{
			
			nextEvent = list.getEvent();
			list.removeEventList(nextEvent);
		
			if(nextEvent.typeOfEvent(nextEvent) == 'A')
			{
				
				
				currentTime = nextEvent.getTime();
				line.add(nextEvent);
				
				System.out.println("Processing an arrival event at time: " + currentTime);
				
				if(line.peek().getTime() == nextEvent.getTime())
				{
					people++;
					departureTime = currentTime + nextEvent.getTransactionTime();
					
				}
				
				else
				{
					waitTime += (departureTime - currentTime);
				
					people++;
					
					departureTime = departureTime + nextEvent.getTransactionTime(); 
					
				}
				
				
				list.insertEventList(new Event('D',departureTime));
				
			}
			
			else
			{
						
				currentTime = nextEvent.getTime();
				
				System.out.println("Processing a departure event at time: " + currentTime);
				line.remove();

			}
			
		}
		

		
		
		averageTime = (double)waitTime/people;
			
		System.out.println("Simulation ends.\n");
		System.out.println("Final Statistics:\n");
		System.out.println("Number of people processed: " + people);
		System.out.println("Average time spent in line: " + averageTime);

		
	}

}
