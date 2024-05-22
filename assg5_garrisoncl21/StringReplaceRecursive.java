/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description: This program takes a string and replaces an oldChar with a newChar
 * Last Modification: 10-08-22
 */

package assg5_garrisoncl21;


import java.util.*;
public class StringReplaceRecursive {
	
	/**helper recursive method for replace method
	 * 
	 * @param index
	 * @param str
	 * @param oldChar
	 * @return
	 */
	public static int helper(int index, String str, char oldChar )
	{
		
	
		
			
		if(str.charAt(index) != oldChar)
		{
			index++;
			
			index = helper(index,str,oldChar);
	
		}
		
		else if(index >= str.length())
		{
			return -1;
		}
		
		
		return index;
		
		
		
	}
	
	
	/**recursive method that replaces an oldChar with a newChar
	 * 
	 * @param str
	 * @param oldChar
	 * @param newChar
	 * @return
	 */
	public static String replace(String str , char oldChar, char newChar)
	{
		
		int index = 0; 
		int check = 0;
		
		check = helper(index,str,oldChar);
		
		if(check == -1)
		{
			return str;
		}
		
		
		return str.substring(0,check) + newChar + str.substring(check + 1,str.length());
		
		
		
	}
	
	/**recursive method that is suppose to replace all oldChar with newChar
	 * 
	 * @param str
	 * @param oldChar
	 * @param newChar
	 * @return
	 */
	public static String replaceAll(String str, char oldChar, char newChar)
	{
		
		int index = 0;
		String temp = replace(str,oldChar,newChar);
		
		

		if(helper(index,temp,oldChar) != -1)
		{
			
			temp = replaceAll(replace(str,oldChar,newChar),oldChar,newChar);
			
		}
		
		return temp;
	}

	public static void main(String[] args) {
		
		
		
		
		
			
				Scanner kbd = new Scanner(System.in);
			
			
				System.out.println("Enter a String:");
				
				String str = kbd.nextLine();
			
				System.out.println("Enter a character to replace: ");
			
				char oldChar = kbd.next().charAt(0);
				
				System.out.println("Enter a new character to replace the old one with: ");
			
				char newChar = kbd.next().charAt(0);
			
				System.out.println("The old String is: " + str);
			
				System.out.println("The new String is: " + replace(str, oldChar, newChar));
			
			
			
			
			
			
		}
	


	}


