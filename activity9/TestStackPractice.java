package activity9;
import java.util.*;

public class TestStackPractice {

	public static void main(String[] args) {
		
		StackPractice obj = new StackPractice();
		
		Scanner kbd = new Scanner(System.in);
		
		String newString = "";
		String str = "";
		int index = 0;
		
		
		System.out.println("Testing strRevStack:");
		System.out.println("Enter a String:");
		System.out.println(obj.strRevStack(kbd.nextLine()));
		System.out.println();
		
		
		System.out.println("Testing strRevIterative:");
		System.out.println("Enter a String:");
		System.out.println(obj.strRevIterative(kbd.nextLine()));
		System.out.println();
		
		
		System.out.println("Testing strRecursive:");
		System.out.println("Enter a String:");
		str = kbd.nextLine();
		index = str.length()- 1;
		
		System.out.println(obj.strRecursive(index,str,newString));
		System.out.println();
		
		kbd.close();

	}

}
