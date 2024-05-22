/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description:This is the Event class.
 * Last Modification: 11-15-22
 */


package assg8_garrisoncl21;

public class Event implements Comparable<Event> {
	
	//int arrivalTime;
	private int transactionTime;
	private int departureTime;
	private int time;
	private char eventType;
	
	/**three parameter constructor creates an Arrival Event
	 * 
	 * @param event
	 * @param arrived
	 * @param processTime
	 */
	public Event(char event, int arrived , int processTime)
	{
		eventType = event;
		
		time = arrived;
		
		transactionTime = processTime;
		
		//departureTime = 
		
	}
	
	/**two parameter constructor that creates a departure event
	 * 
	 * @param event
	 * @param givenDepartureTime
	 */
	public Event(char event, int givenDepartureTime)
	{
		eventType = event;
		time = givenDepartureTime;
	}
	
	/**returns the event type
	 * 
	 * @return
	 */
	public char getEvent()
	{
		return eventType;
	}
	
	/**method that returns the Time
	 * 
	 * @return
	 */
	public int getTime()
	{
		return time;
	}
	
	/**method that returns Transaction Time
	 * 
	 * @return
	 */
	public int getTransactionTime()
	{
		return transactionTime;
	}
	
	/**method that returns Departure Time
	 * 
	 * @return
	 */
	public int getDepartureTime()
	{
		return departureTime;
	}
	
	/**takes a givenEvent and returns an 'A' for an arrival and a 'D" for a departure event
	 * @param givenEvent
	 * @return
	 */
	public char typeOfEvent(Event givenEvent)
	{
		return givenEvent.eventType;
	}
	
	/**if this.arrival time is greater than givenEvent arrival time return -1
	 * else if this.arrival time is less than givenEvent arrival time return 1
	 * else return 0
	 * @param givenEvent
	 * @return
	 */
	public int compareTo(Event givenEvent)
	{
		
		
		if(this.time > givenEvent.time)
		{
			return 1;
		}
		
		else if(this.time < givenEvent.time)
		{
			return -1;
		}
		
		else
		{
			
			if(this.typeOfEvent(this) == 'A')
			{
				return -1;
			}
			
			else if(givenEvent.typeOfEvent(givenEvent) == 'A')
			{
				return 1;
			}
			else
			{
				return 0;
			}
			
		}
	}
	
}
