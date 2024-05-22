/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description: This class is missing a few methods. I waited too long to work on it.
 * Last Modification: 9-15-22
 */

package assg2_garrisoncl21;

public class ExtendedCircle {
	
	
	private double radius;
	private Point center;
	
	public ExtendedCircle()
	{
		radius = 1;
		center.x = 0;
		center.y = 0;
		
	}
	
	public ExtendedCircle(double givenRadius)
	{
		radius = givenRadius;
		center.x = 0;
		center.y = 0;
		
	}
	
	public ExtendedCircle(double givenRadius, Point givenCenter)
	{
		radius = givenRadius;
		center.x = givenCenter.x;
		center.y = givenCenter.y;
	}
	
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double newRadius)
	{
		radius = newRadius;
	}
	
	public int getCenter_X()
	{
		return center.x ;
	}
	
	public int getCenter_Y()
	{
		return center.y;
	}
	
	public void setCenter(Point newCenter)
	{
		center.x = newCenter.x;
		center.y = newCenter.y;
	}
	
	public double compArea()
	{
		double squareRadius = radius * radius;
		
		return 3.14 * squareRadius;
	}
	
	public double compCircumference()
	{
		return (2 * radius * 3.14);
	}
	
	public String toString()
	{
		return "Radius: " + radius + " Center: " + "\"" + "(" + center.x + "," + center.y +")" + "\"";

	}

}
