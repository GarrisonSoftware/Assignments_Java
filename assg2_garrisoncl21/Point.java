/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description: This is the Point class. It has several methods and constructors to handle coordinates.
 * Last Modification: 9-15-22
 */

package assg2_garrisoncl21;


public class Point {

	public int x ;
	public int y;
	
	public Point()
	{
		x = 0;
		y = 0;
	}
	
	public Point(int given_X, int given_Y)
	{
		x = given_X;
		y = given_Y;
	}
	
	public int getPointX()
	{
		return x ;
	}
	
	public void setPointX(int new_X)
	{
		x = new_X;
	}
	
	public void setPointY(int new_Y)
	{
		y = new_Y;
	}
	
	public int getPointY()
	{
		return y ;
	}
	
	public String toString()
	{
		return "\"" + "(" + x + "," + y +")" + "\"";
	}
	
	public double distance(Point coordinate )
	{
		
		double new_X2 = coordinate.x * coordinate.x;
		double new_X1 = this.x * this.x;
		
		double new_Y2 = coordinate.y * coordinate.y;
		double new_Y1 = this.y * this.y;
		
		double new_XY = ((new_X2 - new_X1) + (new_Y2 - new_Y1));
		
		return Math.sqrt(new_XY);
		
	}
	
	public boolean equals(Object obj)
	{
		if (obj == null)
		{
			return false;
		}
		
		if (obj instanceof Point)
		{
			Point temp = (Point)obj;
			return (this.x == temp.x && this.y == temp.y);
			
		}
		
		else
		{
			return false;
		}
	}
	
}
