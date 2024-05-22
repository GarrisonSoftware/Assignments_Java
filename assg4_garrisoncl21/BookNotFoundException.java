/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description:Exeption for BookNotFoundException
 * Last Modification: 9-29-22
 */

package assg4_garrisoncl21;

@SuppressWarnings("serial")
public class BookNotFoundException extends Exception {

	/**BookNotFoundException constructor with no parameter
	 * 
	 */
	public BookNotFoundException()
	{
		super("We don't have that book! ");
	}
	
	/**BookNotFoundException constructor with one parameter
	 * 
	 * @param message
	 */
	public BookNotFoundException(String message)
	{
		super(message);
	}
}
