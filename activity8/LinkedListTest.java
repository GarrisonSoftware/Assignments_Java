package activity8;

public class LinkedListTest {

	public static void main(String[] args) {
		
		
		Node list = null;
		
		System.out.println("The contents of the list are:");
		for(int i = 1; i <= 10; i++)
		{
			if(list == null)
			{
				list = new Node(i);
				System.out.println(list.item);
				
			}
			else
			{
				list = new Node(i,list);
				System.out.println(list.item);
			}	
			
		}
		
		System.out.println("Using the odd Iterative");
		oddElementsIterative(list);
		
		System.out.println("Using the odd Recursive");
		oddElementsRecursive(list);
		
		
		System.out.println("Using the even Iterative");
		evenElementsIterative(list);
		
		System.out.println("Using the even Recursive");
		evenElementsRecursive(list);
		
		
		
		
		
		
		
		
		

	}
public static void oddElementsIterative(Node list)
{
	for(int i = 10; i >= 0; i-- )
	{
	
		if(list != null)
		{
			if(list.item % 2 != 0)
			{
				System.out.println(list.item);
				list = list.next;
			}
			else
			{
				list = list.next;
			}
			
		}
		
	}
}
	
public static void oddElementsRecursive(Node list)
{
	if(list != null)
	{
		if(list.item % 2 != 0)
		{
			System.out.println(list.item);
			oddElementsRecursive(list.next);
		}
		else
		{
			oddElementsRecursive(list.next);
		}
	}
}

public static void evenElementsIterative(Node list)
{
	for(int i = 10; i >= 0; i-- )
	{
	
		if(list != null)
		{
			if(list.item % 2 == 0)
			{
				System.out.println(list.item);
				list = list.next;
			}
			else
			{
				list = list.next;
			}
			
		}
		
	}
}

public static void evenElementsRecursive(Node list)
{
	if(list != null)
	{
		if(list.item % 2 == 0)
		{
			System.out.println(list.item);
			evenElementsRecursive(list.next);
		}
		else
		{
			evenElementsRecursive(list.next);
		}
	}
}

}
