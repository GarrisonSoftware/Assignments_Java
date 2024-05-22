package activity12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import assg6_garrisoncl21.Student;

public class TreeSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<City> list = new ArrayList<City>();
		
	
		
		//fileName = givenFileName;
		Scanner fileInput = null;
		String city;
		String country;
		City temp;
			
			
		File inFile = new File("activity12_data.txt");
			
			try
			{
				fileInput = new Scanner(inFile);
					
				while(fileInput.hasNextLine())
				{
					
					
					StringTokenizer line = new StringTokenizer(fileInput.nextLine(),",");
					
					
					while(line.hasMoreTokens())
					{
						city = (line.nextToken());
						country = (line.nextToken());
						
						temp = new City(city,country);
						list.add(temp);
						
					}
			
					
				}
				
				
				fileInput.close();
				
			}
			
			catch(FileNotFoundException e)
			{
				System.out.println();
				System.out.println(e.getMessage());
				System.out.println();
			}
		
		

	}

/*public ArrayList<City> treeSort(ArrayList<City> givenList)
{
	
	
	BinarySeachTree tree = new BinarySearchTree()
}*/

}
