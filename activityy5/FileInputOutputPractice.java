/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description: This program deals with input and output file handling.
 * Last Modification: 9-23-22
 */

package activityy5;
import java.io.*;
import java.util.*;

public class FileInputOutputPractice {

	public static void main(String[] args) {
		String file_1 = "activity5_input1.txt";
		String file_2 = "activity5_input2.txt";
		String file[] = new String [file_1.length() + file_2.length()];
		int count = 0;
		Scanner inputStream = null;
		
		
		String line;
		
		
		PrintWriter outputStream = null;
		try
		{
			outputStream = new PrintWriter("activity5_output.txt");
		
			
		}
		
		catch (IOException e)
		{
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
		try
		{
			inputStream = new Scanner(new File("activity5_input1.txt"));
		}
		
		catch(FileNotFoundException e)
		{
			inputStream.close();
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
		while(inputStream.hasNextLine())
		{
			line = inputStream.nextLine();
			file[count++] = line;
		
			
		}
		
		try
		{
			inputStream = new Scanner(new File("activity5_input2.txt"));
		}
		
		catch(FileNotFoundException e)
		{
			inputStream.close();
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
		while(inputStream.hasNextLine())
		{
			line = inputStream.nextLine();
			file[count++] = line;
		
			
		}
		
		
		for(int i = 0 ; i < count ; i++) 
		{
			outputStream.println(file[i]);
		}
		
		outputStream.close();
		System.out.println("Those files were written to activity5_output.txt");
		System.out.println("Count was: " + count);
		
		
		
	
		
	}	
}

