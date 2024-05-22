package activity14;

import java.util.*;

public class GraphTest {

	//1789
	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		String vertices;
		String edges;
		//Node list = null;
		StringTokenizer givenVertices , givenEdges;
		String tempToken;
		int j = 1;
		int k = 0;
		//int i = 0;
		
		LinkedList<LinkedList<Character>> vertexList = new LinkedList<>();
		LinkedList<Character> edgeList = new LinkedList<>();
		LinkedList<Character> tempList = new LinkedList<>();
		ListIterator<LinkedList<Character>> vertexIter;
		ListIterator<Character> edgeIter;
		int count = 0;
		int index = 0;


		
		
		System.out.println("Enter the vertices of the graph seperated by commas.");
		
		vertices = kbd.nextLine();
		
		
		System.out.println("Enter the edges of the graph seperated by commas.");
		
		edges = kbd.nextLine();
		
		
		
		
		 givenVertices = new StringTokenizer(vertices,",");
		 givenEdges = new StringTokenizer(edges,",");
		
		while(givenVertices.hasMoreTokens())
		{
			tempList.add(givenVertices.nextToken().charAt(0));
			
			vertexList.add(tempList);
			tempList = new LinkedList<>();

			//tempToken = givenEdges.nextToken();

			//if( tempToken.equals();

			
			System.out.println("templist in while.." + tempList);
			//vertexList.add(tempList);
			//System.out.println("vertexList in while..." + vertexList);

			//while(given)
			count++;

		}
		//tempList.add(givenVertices.nextToken()); 
		System.out.println("vertexList outside while..." + vertexList);

		

		

		
		//tempList = null;

		vertexIter = createIter(vertexList);
		tempList = new LinkedList<>();

		while(givenEdges.hasMoreTokens())
		{
			tempToken = givenEdges.nextToken();
			
				
				//System.out.println(vertexIter.next().get(j));
				//System.out.println("vertexList..." + vertexList);
				//System.out.println("count is..." + count);
				//j++;
				//System.out.println()
			while(vertexIter.hasNext())
				
			{
				if( tempToken.charAt(0) == vertexIter.next().get(0))
				{
					//tempList.add(tempToken.charAt(j));
					//vertexList.add(k,tempList);
					
					//tempList.add(tempToken.charAt(j));
					//vertexList.add(i,tempList);
					//j++;
					//i++;
					//vertexIter = createIter(vertexList);
					tempList = new LinkedList<>();

						for(int i = j; i < tempToken.length();i++)
						{
								tempList.add(tempToken.charAt(j));
								vertexList.add(index,tempList);
								j++;
								//edgeList.add(tempToken.charAt(i));
						}
					
				}
				index++;
				//j = 1;
				//i++;

			}
			vertexIter = createIter(vertexList);
			index = 0;

		}
		System.out.println("The final result is:" + vertexList);
		//ListIterator<LinkedList<Character>> vertexIter = vertexList.listIterator();
		//vertexIter = createIter(vertexList);
		//edgeIter = createIter()
		/*while(vertexIter.hasNext())
		{
			edgeIter = createListIter(vertexIter.next());

			while(edgeIter.hasNext())
			{
				System.out.println(vertexIter.next() + " -> " + edgeIter.next());

			}
		}*/
		
		
		
		
	

	}
	
	private static ListIterator<LinkedList<Character>> createIter(LinkedList<LinkedList<Character>> givenList)
	{
		return givenList.listIterator();

	}
	private static ListIterator<Character> createListIter(LinkedList<Character> givenList)
	{
		return givenList.listIterator();
	}

}
