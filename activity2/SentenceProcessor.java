/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description: This program gets a sentence from the user
 * and returns a statement based on defined parameters.
 * Last Modification: 9-2-22
 */

package activity2;
import java.util.Scanner;

public class SentenceProcessor {

	public static void main(String[] args) {
		System.out.println("Enter a sentence");
		
Scanner keyboard = new Scanner (System.in);
		
		String sentence = keyboard.nextLine();
		
		
		switch(sentence.charAt(sentence.length()-1)) //Determines the char at the end of the sentence
		{
			//This case is executed if the last char is a question mark.
			case '?':
			{
				//Determines if the sentence is of even or odd length.
				if(sentence.length()% 2 == 0)
				{
					System.out.println("That's an even question.");
					break;
				}
			
				else
				{
					System.out.println("That's an odd question.");
					break;
				}
			}
		
			//This case is executed if the last char is a exclamation point.
			case '!':
				{
					System.out.println("Wow!");
					break;
				}
		
			//This case is executed if the last char is a comma.
			case ',':
				{
					System.out.println("More to come!");
					break;
				}
		
			//The default is executed if the last char does not meet any of the cases.	
			default:
				{
					System.out.println("You always say, " + "\"" + sentence + "\""  );
					break;
			
				}
		
		}
		
		keyboard.close();
		
	}
}
	
	

