package activity6;
import java.util.*;

public class RecursionPractice {

	private static int index = 0;
	
	public static int searchFirst(char character, String phrase)
	{
		
		
		if(index >= phrase.length())
		{
			return -1;
		}
		
		else if(phrase.charAt(index) == character)
		{
			return index;
		}
		
		
		index++;
		return searchFirst(character, phrase);
			
		
	}
	
	
	public static int searchLast(char character, String phrase)
	{
		if(index < 0)
		{
			return -1;
		}
		
		else if(phrase.charAt(index) == character)
		{
			return index;
		}
		
		index--;
		return searchLast(character, phrase);
	}
	
	public static void main(String[] args) {
		
		String phrase;
		char character;
		int occurance;
		
		
		Scanner kbd = new Scanner (System.in);
		
		
		System.out.println("Enter a phrase: ");
		
		phrase = kbd.nextLine();
		
		System.out.println("Enter a character: ");
		
		character = kbd.nextLine().charAt(0);
		
		occurance = searchFirst(character, phrase);
		
		
		
		if(occurance == -1)
		{
			System.out.println("The character: " + character + " is not in the phrase: " + phrase);
		}
		
		else
		{
			System.out.println("The first occurance of character " + character + " is index: " + occurance);
		}
		
		
		System.out.println("Enter a phrase: ");
		
		phrase = kbd.nextLine();
		
		System.out.println("Enter a character: ");
		
		character = kbd.nextLine().charAt(0);
		
		occurance = searchLast(character, phrase);
		
		
		if(occurance == -1)
		{
			System.out.println("The character: " + character + " is not in the phrase: " + phrase);
		}
		
		else
		{
			System.out.println("The last occurance of character " + character + " is index: " + occurance);
		}
		
		kbd.close();
		
		
		
		
	}

}
