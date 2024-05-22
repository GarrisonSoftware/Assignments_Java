/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description:Porgram displays the contents of the library
 * It then lets the user search for books contained in the library by bookId
 * If the user enters a book contained in the library, the book info is then displayed to the user
 * The program will continue to do this until the user enters "STOP"
 * Last Modification: 9-29-22
 */

package assg4_garrisoncl21;
import java.util.*;
import java.io.*;

public class BookSearch {

	public static void main(String[] args) {
		Scanner kbd ;
		
		Scanner fileInput;
		String choice = "GO";
		File inFile = new File("assg4_catalog.txt");
		int bookCount = 0;
		int index = 0;
		Book library[] = new Book [(int)inFile.length()];
		Book tempBook;
		
		//
		try
		{
			fileInput = new Scanner(inFile);
			
			while(fileInput.hasNext())
			{
				 
				 tempBook = new Book(fileInput.next(),fileInput.next(),fileInput.next(),fileInput.next(),fileInput.next().charAt(0));

				
				 
						try
				 
						{
							//if bookSearch returns an integer value then the book is already in the array 
							//and this if statement will be entered
							//otherwise the bookSearch will throw a BookNotFoundException 
							//and the if statement will be skipped
							if(Book.bookSearch(library, bookCount , tempBook.getId())>= 0)
							{
								throw new BookIdAlreadyExistException();
							}
	
					 		
						}
				 
						catch(BookIdAlreadyExistException e)
						{
							e.getMessage();
						}
						
						catch (BookNotFoundException e)
						{	
							library[bookCount] = tempBook;
					 
							bookCount++;
					  
						}
						
							
			}
			
			// for loop that cycles through the library array and displays the contents to the screen
			for(int i = 0 ; i < bookCount ; i++)
			{
				System.out.println(library[i].toString());
			}
			
			System.out.println("The number of books in the library is: " + bookCount);
			
			
		}
		
			
		
		catch(FileNotFoundException e)
			{
				System.out.println(e.getMessage());
			}
		
	
		//do-while loop that asks the user to enter a bookId and then call the bookSearch method to search the library array for the book
		//will continue to run until the user enters "STOP"
		do
		{
			System.out.println("\nEnter a book ID or enter STOP to exit program:");
			kbd= new Scanner (System.in);
			choice = kbd.nextLine();
			
			if(choice.equals("STOP") == false)
			{
				try
				{
			
					if(Book.bookSearch(library, bookCount , choice) >= 0)
					{
						index = Book.bookSearch(library, bookCount , choice);
						System.out.println(library[index].toString());
					}
		
			
				}
		
				catch(BookNotFoundException e)
				{
					System.out.println(e.getMessage());
					System.out.println();
				}
		
			}
		}
	
		while(!choice.equals("STOP"));
	
		System.out.println("Shutting Down...");
		kbd.close();

			
		}	
	}
	
	