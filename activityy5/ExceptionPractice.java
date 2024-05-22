/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description: This program deals with exception handling.
 * Last Modification: 9-23-22
 */
package activityy5;
import java.util.*;

public class ExceptionPractice {

	public static void main(String[] args) {
		int num;
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("Enter a positive integer: ");
		num = kbd.nextInt();
		
		try
		{
			if(num < 0)
			{
				kbd.close();
				throw new NegativeNumberException();
				
			}
			
			else
			{
				System.out.println("The square root of " + num +" is: " + Math.sqrt(num));
				kbd.close();
			}
		}
			catch(NegativeNumberException e)
			{
				System.out.println(e.getMessage());
				System.exit(1);
			}
		}

	}

