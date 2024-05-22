package activity10;

public class Node {

	Integer item;
	Node next ;

	
	
	
	Node(Integer givenItem)
	{
		 
		this.item = givenItem;
		this.next = null;
	}
	
	Node(Integer givenItem, Node givenNext)
	{
		this.item = givenItem;
		this.next = givenNext;
	}
}
