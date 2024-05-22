package activity12;

public class City extends KeyedItem{
	
	String country;
	public City(String givenCity, String givenCountry)
	{
		super(givenCity);
		country = givenCountry;
	}
	
	public String getCountry()
	{
		return country;
	}
	
	public String toString()
	{
		return country;
	}

}
