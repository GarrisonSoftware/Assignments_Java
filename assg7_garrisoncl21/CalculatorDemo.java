/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description:Calculator Demo Class. Asks the user to enter a infix expression. It then converts it to a postfix
 * Contains the main method 
 * Last Modification: 11-03-22
 */

package assg7_garrisoncl21;
import java.util.*;

public class CalculatorDemo {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		String postfixExp;
		String selection = "Z";
		System.out.println("Convert and Calculate Infix Expression?");
		System.out.println("<Y>es or <N>o?");
		selection = kbd.nextLine();
		
		while(!selection.equals("N"))
		{
			
			
	
			System.out.println("Enter an infix expression:");
			Calculator c1 = new Calculator(kbd.nextLine());
			
			try
			{
				postfixExp = c1.getPostfix();				
				System.out.println("Postfix Expression is: " + postfixExp + "\n");
				System.out.println("The calculated answer is: " + c1.evaluate(postfixExp) + "\n");
			}
			
			catch(IllegalStateException e)
			{
				System.out.println("That expression cannot be computed!");
				
			}
			
			System.out.println("Convert and Calculate Infix Expression?");
			System.out.println("<Y>es or <N>o?");
			selection = kbd.nextLine();
			
			
		}
		
		System.out.println("Shutting down...");
		kbd.close();
		
	
		
		
		
		
	}

}
