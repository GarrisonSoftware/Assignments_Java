/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description: This program gets the size of a triangle
 * from the user and prints the triangle to the screen.
 * Last Modification: 9-2-22
 */

package activity2;
import java.util.Scanner;


public class Triangle {
	
	//This method receives an integer and prints an asterisk (*) to the screen
	//The number of asterisks (*) printed to the screen is based off the number passed to the method 
	static void printLine(int num)
	{
		for(int i = 0; i < num; i++)
		{
			System.out.print("*");
		}
	}
	//This method receives the size of a triangle from the user
	//It then calls the printLine method to print the triangle to the screen
	static void printTriangle(int num)
	{
		
		for(int i = 0; i <= num ; i++)
		{
			printLine(i);
			System.out.println();
		}
		
		for(int i = num - 1; i > 0 ;i--)
		{
			printLine(i);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
	
	
	System.out.println("What size is the triangle?");
	
	Scanner keyboard = new Scanner (System.in);
	int size = keyboard.nextInt();
	
	printTriangle(size);
	
	keyboard.close();

	}


}
