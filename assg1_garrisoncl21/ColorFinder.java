/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description: This program gets a sentence from the user.
 * If the program finds an additive color or a subtractive color then it will tell the user.
 * Last Modification: 9-2-22
 */


package assg1_garrisoncl21;
import java.util.Scanner;

public class ColorFinder {

	
	//This method receives a string as a parameter.
	//The method searches the string for an additive or subtractive color.
	static void stringSearch(String sentence)
	{
		if(sentence.lastIndexOf("red") > -1)
		{
			System.out.println("Additive primary color found.");
		}
		
		else if(sentence.lastIndexOf("green") > -1)
		{
			System.out.println("Additive primary color found.");
		}
		
		else if(sentence.lastIndexOf("blue") > -1)
		{
			System.out.println("Additive primary color found.");
		}
		
		else if(sentence.lastIndexOf("magenta") > -1)
		{
			System.out.println("Subtractive primary color found.");
		}
		
		else if(sentence.lastIndexOf("yellow") > -1)
		{
			System.out.println("Subtractive primary color found.");
		}
		
		else if(sentence.lastIndexOf("cyan") > -1)
		{
			System.out.println("Subtractive primary color found.");
		}
		
		else
		{
			System.out.println("No primary colors found.");
		}
	}
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		
		
		System.out.println("Enter a sentence:");
		
		String sentence = keyboard.nextLine();
		
		sentence = sentence.toLowerCase();
		
		
		stringSearch(sentence);
		
		keyboard.close();
		

	}

}
