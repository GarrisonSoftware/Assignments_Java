package activity1;
import java.util.Scanner;

public class StringProcessing {

	public static void main(String[] args) {
		System.out.println("Enter a string with atleast two characters");
		
		Scanner phrase = new Scanner (System.in);
		
		String s = phrase.nextLine();
		
		String leftOvers;
		char first = s.charAt(0);
		char last = s.charAt(s.length()-1) ;
		
		if(s.length() > 2)
		{
			leftOvers = s.substring(1,(s.length()-1));
		}
		else
		{
			leftOvers = " ";
		}
		
		
		System.out.println("The first character is: " + first);
		System.out.println("The last character is: " + last );
		System.out.println("The substring is: " + leftOvers);

	}

}
