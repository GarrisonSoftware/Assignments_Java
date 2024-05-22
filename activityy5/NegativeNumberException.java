
package activityy5;

@SuppressWarnings("serial")
public class NegativeNumberException extends Exception{
	
	public NegativeNumberException()
	{
		super("Wait a minute...that's a negative integer!!!");
	}
	
	public NegativeNumberException(String message)
	{
		super(message);
	}

}
