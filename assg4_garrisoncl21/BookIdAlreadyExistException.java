/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description:Exeption for BookIdAlreadyExists
 * Last Modification: 9-29-22
 */
package assg4_garrisoncl21;

@SuppressWarnings("serial")
public class BookIdAlreadyExistException extends Exception{
	
	/**no parameter BookIdAlreadyExitsException constructor
	 * 
	 */
	public BookIdAlreadyExistException()
	{
		super("We don't need that book we already have a copy!");
	}
	
	/**one parameter BookIdAlreadyExitsException constructor
	 * 
	 * @param message
	 */
	public BookIdAlreadyExistException(String message)
	{
		super(message);
	}

}
