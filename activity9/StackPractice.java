package activity9;
import java.util.*;

public class StackPractice {

	//code 4118
	public String strRevStack(String str)
	{
		Stack<Character> myStack = new Stack<Character> ();
		String newString = "";
		
		for(int i = 0; i < str.length(); i++)
		{
			myStack.push(str.charAt(i));
		}
		
		while(!myStack.empty())
		{
			newString += myStack.pop() + " ";
		}
		
		return newString;
		
	}
	
	public String strRevIterative(String str)
	{
		String newString = "";
		
		for(int i = str.length()-1; i >= 0 ; i--)
		{
			 newString += str.charAt(i) + " ";
		}
		
		return newString;
	}
	
	public String strRecursive(int index,String str, String newString)
	{
		if(index >= 0)
		{
			newString += str.charAt(index) + " ";
			index--;
			newString = strRecursive(index,str,newString);
		}
		
	
		return newString;
		
			
	}
	
}
