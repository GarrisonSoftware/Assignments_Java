/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description: This is an Account class. This class creates accounts with variables acctNum and acctBalance.
 * Last Modification: 9-22-22
 */

package assg3_garrisoncl21;

public class Account {

	private String acctNum;
	private double acctBalance;
	
	/** One parameter Account constructor initializes account number and account balance.
	 * 
	 * @param givenAcctNum
	 */
	public Account(String givenAcctNum)
	{
		acctNum = givenAcctNum;
		acctBalance = 0;
	}
	
	/** Two parameter Account constructor initializes account number and account balance.
	 * 
	 * @param givenAcctNum
	 * @param initBalance
	 */
	public Account(String givenAcctNum, double initBalance)
	{
		if(initBalance >= 0)
		{
			acctNum = givenAcctNum;
			acctBalance = initBalance;
		}
		
		else
		{
			acctNum = givenAcctNum;
			acctBalance = 0 ;
		}
	}
	
	/**Method that returns the account number.
	 * 
	 * @return
	 */
	public String getAcctNo()
	{
		return acctNum;
	}
	
	/** Method that returns the account balance.
	 * 
	 * @return
	 */
	public double getBalance()
	{
		return acctBalance;
	}
	
	/** Method that sets a new account balance.
	 * 
	 * @param newBalance
	 */
	public void setBalance(double newBalance)
	{
		acctBalance = newBalance;
	}
	
	/** Method that deposits into an account.
	 * 
	 * @param deposit
	 */
	public void deposit(double deposit)
	{
		if(deposit >= 0)
		{
			acctBalance += deposit;
		}
		
		else
		{
			System.out.println("You can't deposit a negative amount!!");
		}
	}
	
	/** Method that withdraws from an account.
	 * 
	 * @param amount
	 */
	public void withdraw(double amount)
	{
		if(amount >=0)
		{
			if(acctBalance >= amount)
			{
				acctBalance -= amount;
			}
			else
			{
				System.out.println("There isn't enough money in the account!!");
			}
		}
		
		else
		{
			System.out.println("You can't withdraw a negative amount!!");
		}
	}
	
	/** Method that transfers a balance between two accounts.
	 * 
	 * @param account
	 * @param debt
	 */
	public void transfer(Account account, double debt)
	{
		if(debt >= 0)
		{
			if(getBalance()>=debt)
			{
				account.withdraw(debt);
				deposit(debt);
			}
			
			else
			{
				System.out.println("There is not anough money in the account for the withdrawl!");
			}
		}
		
		else
		{
			System.out.println("You can't transer a negative amount!!");
		}
	}
	
	/** Method that displays account info.
	 * 
	 */
	public void displayInfo()
	{
		System.out.println("Account number: " + getAcctNo());
		System.out.println("Current balance: " + getBalance());
		
	}
	
	/** Method that returns account info in the form of a string.
	 * @return
	 */
	public String toString()
	{
		return "Account number: " + acctNum + "\n" + "Current balance: " + acctBalance + "\n";
	}
	
	/**Method that checks to see if two account are equal.
	 * @param account
	 * @return
	 */
	public boolean equals(Object account)
	{
		if(account == null)
		{
			return false;
		}
		
		if(account instanceof Account)
		{
			Account temp = (Account)account;
			
			if(temp.getAcctNo() == getAcctNo())
			{
				return true;
			}
			
			else
			{
				return false;
			}
		}
		
		else
		{
			return false;
		}
	}
	
	
}
