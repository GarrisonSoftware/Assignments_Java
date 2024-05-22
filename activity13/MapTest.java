package activity13;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;



public class MapTest {

	public static void main(String[] args) {
		String fileName = "activity13_input.txt";
		Scanner fileInput = null;
		String code;
		String city;
		Scanner kbd = new Scanner(System.in);
		int selection = 0;
		HashMap<String,String> dictionary = new HashMap<String,String>();

		//9981
		
		File inFile = new File(fileName);
		
		try
		{
			fileInput = new Scanner(inFile);
				
			while(fileInput.hasNextLine())
			{
				
				
				StringTokenizer line = new StringTokenizer(fileInput.nextLine(), "\t");
				
				//this loop runs while the StringTokenizer line has tokens
				//the loop takes the tokens and assigns them to their appropriate variables
				//the variable are then plugged into the dictionary
				while(line.hasMoreTokens())
				{
					code = line.nextToken();
					city = line.nextToken();
				
					dictionary.put(code, city);
	
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
		
	
		while(selection != 4)
		{
			System.out.println("1) Display all the airpiorts/cities");
			System.out.println("2) Add a new airport");
			System.out.println("3) Search for an airport");
			System.out.println("4) Exit");
			selection = kbd.nextInt();
			
			switch(selection)
			{
				case 1:
				{
					
					System.out.println(dictionary.entrySet());
					
					System.out.println("Press enter to continue..");
					kbd.nextLine();
					kbd.nextLine();
					

					break;
				}
				
				case 2:
				{
					kbd.nextLine();

					System.out.println("Enter the airport code: ");
					code = kbd.nextLine();
					
					System.out.println("Enter the airport city: ");
					city = kbd.nextLine();
					
					dictionary.put(code,city);
					
					break;
				}
				
				case 3:
				{
					kbd.nextLine();
					System.out.println("Enter a airport code:");
					code = kbd.nextLine();
					
					System.out.println(dictionary.get(code) + "\n");
					break;
				}
				
				case 4:
				{
					
					break;
				}
				
				default :
				{
					System.out.println("That's not an option!");
					break;
				}
			}
			
		
		}
		
		System.out.println("Shutting down...");
		kbd.close();
		System.exit(0);
		

	}
	
	
	
	

	}


