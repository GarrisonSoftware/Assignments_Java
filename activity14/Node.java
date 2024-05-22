package activity14;

public class Node {

	 Character item;
	Node next ;

	
	
	 Node(Character givenItem)
	{
		 
		this.item = givenItem;
		this.next = null;
	}
	
	Node(Character givenItem, Node givenNext)
	{
		this.item = givenItem;
		this.next = givenNext;
	}
	
	
	
}
