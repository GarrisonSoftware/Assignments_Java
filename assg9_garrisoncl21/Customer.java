package assg9_garrisoncl21;

public class Customer extends KeyedItem<String> {

	String id;
	String name;
	String phoneNumber;
	
	public Customer(String givenId, String givenName, String givenPhoneNumber)
	{
		super(givenId);
		name = givenName;
		phoneNumber = givenPhoneNumber;
	}
	
	public String getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
}
