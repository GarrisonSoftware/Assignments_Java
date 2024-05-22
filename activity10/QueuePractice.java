package activity10;

import java.util.*;


public class QueuePractice {

	
	public static void main(String[] args) {
	
	
	Scanner kbd = new Scanner(System.in);
	
	System.out.println("How many positions are in the queue?");
	
	Node temp =listGenerator(kbd.nextInt());
	Node head = temp;
	
	while(temp != null)
	{
		System.out.print(temp.item + "\t");
		temp = temp.next;
	}
	temp = head;
		
	System.out.println("\n");
	queueTest(temp);	
		
	kbd.close();
}
	
	public static void queueTest(Node list)
	{
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		
		
		while(list != null)
		{
			queue.addLast(list.item * 2);
			list = list.next;
		}
		
		Iterator<Integer> iter = queue.iterator();
		while(iter.hasNext())
		{
			System.out.print(iter.next() + "\t");
		}

	}
	
	public static Node listGenerator(int n)
	{
		
		Random rand = new Random();
		
		Node temp = null;
		
		
		for(int i = 0; i <n ;i++)
		{
			if(temp == null)
			{
				temp = new Node(rand.nextInt(50));
				
				
			}
			else
			{
				temp = new Node(rand.nextInt(50),temp);
				
			}	
		}
		
		
		return temp;
	}
}
