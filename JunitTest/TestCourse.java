package JunitTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;




public class TestCourse {
	
	private Course c1,c2;
	
	@Before
	public void setUp()
	{
		c1 = new Course("1234","Computer Hardware");
		c2 = new Course("2468","Computers and You",5);
	}
	
	@Test
	public void testTwoParaConstructor()
	{
		assertEquals("c1 course number:", "1234", c1.getCourseNo());
		assertEquals("c1 course title: " , "Computer Hardware", c1.getTitle());
	}
	
	@Test
	public void testThreeParaConstructor()
	{
		assertEquals("c2 course number:", "2468",c2.getCourseNo());
		assertEquals("c2 course title:","Computers and You",c2.getTitle());
		assertEquals("c2 course credit:" , 5 , c2.getCredit());
	}
	
	@Test
	public void testGetCourseNo()
	{
		assertEquals("GetCourseNo for c1:","1234",c1.getCourseNo());
	
	}
	
	@Test
	public void testGetTitle()
	{
		assertEquals("GetTitle for c1","Computer Hardware",c1.getTitle());
		
	}
	
	@Test
	public void testGetCredit()
	{
		assertEquals("GetCredit for c1", 3, c1.getCredit());
	}
	
	@Test
	public void testSetTitle()
	{
		c1.setTitle("Computers 101");
		assertEquals("SetTitle for c1:","Computers 101",c1.getTitle());
	}
	
	@Test
	public void testSetCredit()
	{
		c1.setCredit(1);
		assertEquals("SetCredit for c1:",1,c1.getCredit());
	}
	


}
