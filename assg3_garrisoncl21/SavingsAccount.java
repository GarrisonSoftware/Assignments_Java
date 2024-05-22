/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description: This is the SavingsAccount class. The SavingsAccount class is a subclass of the Account class.
 * Last Modification: 9-22-22
 */

package assg3_garrisoncl21;


public class SavingsAccount extends Account{
	
	private double interestRate;
	
	/** One parameter constructor that initilizes account number, account balance, overdraft, and interest rate.
	 * 
	 * @param givenAcctNum
	 */
	public SavingsAccount(String givenAcctNum)
	{
		super(givenAcctNum);
		interestRate = 0;
		
	}
	
	/** Two parameter constructor that initilizes account number, account balance, overdraft, and interest rate.
	 * 
	 * @param givenAcctNum
	 * @param givenInitBalance
	 * @param givenInterestRate
	 */
	public SavingsAccount(String givenAcctNum, double givenInitBalance, double givenInterestRate)
	{
		super(givenAcctNum, givenInitBalance);
		interestRate = givenInterestRate;
	}
	
	/** Method that returns interest rate.
	 * 
	 * @return
	 */
	public double getInterestRate()
	{
		return interestRate;
	}
	
	/** Method that sets a new interest rate.
	 * 
	 * @param givenRate
	 */
	public void setInterestRate(double givenRate)
	{
		interestRate = givenRate;
	}
	
	/** Method that adds the interest to the account balance.
	 * 
	 */
	public void addInterest()
	{
		
		setBalance((1+getInterestRate()) * getBalance());
		
	}
	
	/** Overridden method that returns account info in the form of a string.
	 * @override
	 * @return
	 */
	public String toString()
	{
		return "Account number: " + getAcctNo() + "\n" + "Current balance: " + getBalance() + "\n" + "Interest rate: " + getInterestRate() + "\n";
	}
	
	/** Overridden method that displays account info. With the interest rate.
	 *
	 * @override
	 */
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Interest rate: " + getInterestRate());
	}

}
