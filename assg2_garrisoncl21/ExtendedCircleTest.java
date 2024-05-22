/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description: This program is incomplete. I waited too long to work on it.
 * Last Modification: 9-15-22
 */

package assg2_garrisoncl21;

public class ExtendedCircleTest {

	public static void main(String[] args) {
		Point c1 , c2;
		
		
		c1 = new Point();
		
		c2 = new Point(5,10);
		
		System.out.println("The coordinates for c1 using the get method are: x = " + c1.getPointX() + " y = " + c1.getPointY());
		
		
		c1.setPointX(2);
		c1.setPointY(6);
		System.out.println("The coordinates for c1 using the set method are: x = " + c1.x + " y = " + c1.y);
		
		System.out.println("Using the toString method c2 is: ");
		System.out.println(c2.toString());
		
	
		
		
	}

}
