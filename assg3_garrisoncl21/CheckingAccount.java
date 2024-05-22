/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description: This is the CheckingAccount class. The CheckingAccount class is a subclass of the Account class.
 * Last Modification: 9-22-22
 */

package assg3_garrisoncl21;

public class CheckingAccount extends Account {
	
	private double overdraft;
	public static double fee;
	
	/** One parameter CheckingAccount constructor that initializes account number, account balance, and overdraft.
	 * 
	 * @param givenAcctNum
	 */
	public CheckingAccount(String givenAcctNum)
	{
		super(givenAcctNum);
		overdraft = 0;
	}
	
	/** Three parameter CheckingAcccount constructor that initializes account number, account balance, and overdraft.
	 * 
	 * @param givenAcctNum
	 * @param initBalance
	 * @param givenOverdraft
	 */
	public CheckingAccount(String givenAcctNum, double initBalance, double givenOverdraft)
	{
		super(givenAcctNum, initBalance);
		overdraft = givenOverdraft;
	}
	
	/** Method that returns overdraft amount.
	 * 
	 * @return
	 */
	public double getOverdraft()
	{
		return overdraft;
	}
	
	/** Method that sets the overdraft amount.
	 * 
	 * @param givenOverdraft
	 */
	public void setOverdraft(double givenOverdraft)
	{
		overdraft = givenOverdraft;
	}
	
	/** Method that returns the fee.
	 * 
	 * @return
	 */
	public double getFee()
	{
		return fee;
	}
	
	/** Method that sets the fee.
	 * 
	 * @param givenFee
	 */
	public void setFee(double givenFee)
	{
		fee = givenFee;
	}
	
	/** Overridden method that returns info in the form of a string.
	 * @override 
	 */
	public String toString()
	{
		return "Account number: " + getAcctNo() + "\n" + "Curent balance: " + getBalance() + "\n" + "Overdraft amount: " + getOverdraft();
	}
	
	/** Method that withdraws an amount from an account. Includes overdraft and fee.
	 * @param debt
	 */
	public void withdraw(double debt)
	{
		//System.out.println("Balance in the withdraw method: " + getBalance() + "\n");
		if(getBalance() >= debt)
		{
			setBalance(getBalance()-debt);
			
		}
		else
		{
			if((debt + getFee()) <= getOverdraft())
			{
				setBalance((getBalance()-(debt + getFee())));
			}
			
			else
			{
				System.out.print("That amount is more than the overdraft coverage!! \n");
			}
		}
	}
	
	/** Method that transfers money from one account to another. Includes overdraft and fee.
	 * @param account
	 * @param debt
	 */
	public void transfer(Account account, double debt)
	{
		if(debt >= 0)
		{
			if(/*getBalance() >= debt &&*/getBalance() > getOverdraft())
			{
				withdraw(debt);
				account.deposit(debt);
			}
			else
			{
				if( debt + getFee() <= getOverdraft())
				{
					withdraw(debt);
					account.deposit(debt);
				}
				else
				{
					System.out.println("There isn't enough overdraft to cover the transfer amount!!\n");
				}
				
			}
		}
		else
		{
			System.out.println("You can't transfer a negative amount:\n");
		}
	}
	
	/** Overridden method that displays the info of accounts. With the overdraft.
	 * @override
	 */
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Overdraft amount: " + getOverdraft());
		
	}

}
