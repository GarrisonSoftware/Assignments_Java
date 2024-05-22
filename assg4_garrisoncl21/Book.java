/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description:Book class 
 * Last Modification: 9-29-22
 */
package assg4_garrisoncl21;

public class Book {

	private String bookId , title , isbn , author;
	private char category = 'z';
	
	
	/** constructor of the Book class that receives five parameters
	 *  
	 * @param givenBookId
	 * @param givenTitle
	 * @param givenIsbn
	 * @param givenAuthor
	 * @param givenCategory
	 */
	public Book(String givenBookId, String givenTitle, String givenIsbn , String givenAuthor , char givenCategory)
	{
		bookId = givenBookId;
		title = givenTitle;
		isbn = givenIsbn;
		author = givenAuthor;
		category = givenCategory;
	}
	
	/**get method that returns the bookId
	 * 
	 * @return
	 */
	public String getId()
	{
		return bookId;
	}
	
	/**get method that returns the getTitle
	 * 
	 * @return
	 */
	public String getTitle()
	{
		return title;
	}
	
	/**get method that returns Isbn
	 * 
	 * @return
	 */
	public String getIsbn()
	{
		return isbn;
	}
	
	/**get method returns author
	 * 
	 * @return
	 */
	public String getAuthor()
	{
		return author;
	}
	
	/**get method that returns category
	 * 
	 * @return
	 */
	public char getCategory()
	{
		return category;
	}
	
	/**overrides toString method
	 * @return
	 * @override
	 */
	public String toString()
	{
		return bookId + "   " + title + "   " + isbn + "   " + author + "   " + category;
	}
	
	/**searches the contents of a Book array for a bookId 
	 * 
	 * @param library
	 * @param bookCount
	 * @param bookId
	 * @return
	 * @throws BookNotFoundException
	 */
	public static int bookSearch(Book library[] , int bookCount , String bookId ) throws BookNotFoundException
	{
		for(int i = 0; i < bookCount; i++)
		{
			
			if(library[i].getId().equals(bookId))
			{
				return i;
			}
			
		}
		
		
		throw new BookNotFoundException();
	}
	
}
