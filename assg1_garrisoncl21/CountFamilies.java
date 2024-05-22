/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description: This program gets the number of families and the income of each of those families from the user.
 * The program then calculates the maximum income out of all the families and finds the incomes that are 10% less than the max.
 * The results are then displayed to the user.
 * Last Modification: 9-6-22
 */

package assg1_garrisoncl21;
import java.util.Scanner;

public class CountFamilies {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		int maxIncome = 0;
		int numBelowTenPercent = 0;
		
		System.out.println("Enter the number of families: ");
		
		int numOfFamilies = keyboard.nextInt();
		
		int [] familyIncomes = new int[numOfFamilies]; 
		
		
		//Loop that inputs family incomes into an array.
		//The user enters all the incomes.
		for(int i = 0 ; i < numOfFamilies ; i++)
		{
			System.out.print("Enter an income: ");
			familyIncomes[i] = keyboard.nextInt();
			
		}
		
		System.out.println();
		
		//This loop finds the maximum income out of the incomes entered.
		for(int i = 0 ; i < numOfFamilies ; i++)
		{
			if(familyIncomes[i] > maxIncome)
			{
				maxIncome = familyIncomes[i];
			}
			
		}
		
		System.out.println("The maximum income is: " + maxIncome);
		System.out.println();
		
		System.out.println("The incomes of families making less than 10% of the maximum are: ");
		
		//This loop finds and displays the incomes that are 10%b less than the max income.
		for(int i = 0; i < numOfFamilies ; i++)
		{
			if(familyIncomes[i] < (maxIncome * 0.1))
			{
				System.out.println(familyIncomes[i]);
				
				numBelowTenPercent += 1 ;
			}
		}
		
		System.out.println("for a total of " + numBelowTenPercent + " families" );
		
		keyboard.close();

	}

}
