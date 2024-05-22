

package assg1_garrisoncl21;
import java.util.Scanner;
import java.util.Random;

public class NumberGame {

	//This method receives as parameters the randomly generated number and the user's guess.
	//The method compares the randomly generated number and the user's guess
	//Depending on how close the user is the method will display a hint to the user.
	//Once the user guess the correct number the method exits and the number of tries is returned.
	static int numCompare(int secret, int guess)
	{
		
		Scanner keyboard = new Scanner (System.in);
		int tries = 0;
		
		do
		{
			
			//If the randomly generated number is greater than the user's guess then this will be executed.
			if(secret > guess)
			{
				++tries;
				System.out.println("The numder is bigger than that!");
				System.out.println("Guess again!");
				
				
				
			}
			
			//If the randomly generated number is less than the user's guess then this will be executed.
			else 
			{
				++tries;
				System.out.println("Wait a minute! The number is smaller than that!");
				System.out.println("Guess again!");
				
				
				
			}
			
			
			guess = keyboard.nextInt();
			
		}
		
		//Once the user guesses the correct number the loop will be exited. 
		while(secret != guess);
		
		++tries;
		keyboard.close();
		return tries;
	}
	
	public static void main(String[] args) {
		int secret;
		
		Random generator = new Random();
		
		secret = generator.nextInt(100);
		
		
		
		System.out.println("Guess a number between 0 and 99:");
		
		Scanner keyboard = new Scanner (System.in);
		int guess = keyboard.nextInt();
		int effort= numCompare(secret,guess);
		
		System.out.println("The number was " + "\"" + secret + "\"");
		System.out.println("It took you " + effort + " tries");
		
		keyboard.close();
		
		
		
		
		

	}

}
