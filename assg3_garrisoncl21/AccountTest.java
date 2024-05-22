/** Author: Clay Garrison
 * Contact Info: garrisoncl21@students.ecu.edu
 * Program Description: This program tests the Account class, CheckingAccount subclass, and SavingsAccount subclass.
 * Last Modification: 9-22-22
 */

package assg3_garrisoncl21;

public class AccountTest {

	public static void main(String[] args) {
		
		
		Account a1 = new Account("12345678");
		Account a2 = new Account("24681012", 100.00);
		CheckingAccount a3 = new CheckingAccount("36912158");
		CheckingAccount a4 = new CheckingAccount("48121620" , 20.00 , 95.00);
		SavingsAccount a5 = new SavingsAccount("51015202");
		SavingsAccount a6 = new SavingsAccount("61218243", 50.00, 0.05 );
		
		//Starts the testing of the Account class
		System.out.println("Testing the Account class: \n");
		
		//using constructors
		System.out.println("a1 using the one parameter constructor: \n" + a1);
		System.out.println("a2 using the two parameter constructor: \n" + a2);
		
		//using get methods
		System.out.println("Account number for a1 using the getAcctNo method: " + a1.getAcctNo());
		System.out.println("Balance for a1 using the getBalance method: " + a1.getBalance());
		
		//using set method
		a1.setBalance(200.00);
		System.out.println("The balance for a1 after the setBalance method is: " + a1.getBalance()+"\n");
		
		//using deposit method
		a2.deposit(50.00);
		System.out.println("The amount in a2 after the deposit method is:" + a2.getBalance() + "\n");
		
		System.out.println("Trying to deposit a negative amount will do this:\n ");
		a2.deposit(-20.00);
		
		System.out.println("The amount in a2 after trying to deposit a negative amount is: " + a2.getBalance());
		System.out.println("");
		
		//using withdraw method
		a1.withdraw(5.00);
		System.out.println("The amount in a1 after the withdraw method is: " + a1.getBalance() + "\n");
		
		System.out.println("Trying to withdraw a negative amount will do this:\n ");
		a1.withdraw(-20.00);
		
		System.out.println("The amount in a1 after trying to withdraw a negative amount is: " + a1.getBalance());
		
		//adds space between lines
		System.out.println("");

		
		//using transfer method
		a1.transfer(a2,5.00);
		System.out.println("The transfer method was applied from a2 to a1. \n");
		System.out.println("The amount in a1 after the transfer is: " + a1.getBalance());
		System.out.println("The amount in a2 after the transfer is: " + a2.getBalance() + "\n");
		
		
		System.out.println("Trying to transfer too much money from an account will do this: ");
		a1.transfer(a2,1000.00);
		
		//using the displayinfo method
		System.out.println("");
		System.out.println("The account information of a1 and a2 using the displayInfo method is: \n");
		
		System.out.println("a1:");
		a1.displayInfo();
		System.out.println("");
		System.out.println("a2:");
		a2.displayInfo();
		
		System.out.println("\n");
		
		
		//Starts the testing of the Checking Account subclass
		System.out.println("Testing the CheckingAccount subclass: \n" );
		
		//using constructors
		System.out.println("a3 using the one parameter constructor: \n" + a3 + "\n");
		System.out.println("a4 using the three parameter constructor: \n" + a4 + "\n");
		
		
		//get method
		System.out.println("Overdraft for a3 using the getOverdraft method: " + a3.getOverdraft());
		
		//set method
		a3.setOverdraft(20.00);
		
		System.out.println("Overdraft for a3 after the setOverdraft method: " + a3.getOverdraft() + "\n");
		System.out.println("This is the overdraft fee using the getFee method: " + a3.getFee());
		a3.setFee(5.00);
		System.out.println("This is the overdraft fee after using the setFee method: " + a3.getFee() + "\n");
		
		
		//using the toString method
		System.out.println("The info of a3 and a4 using the toString method is: \n");
		
		System.out.println("a3: \n" + a3.toString() + "\n");
		System.out.println("a4: \n" + a4.toString() + "\n");
		
		//using the withdraw method
		System.out.println("This is what happens when you try to go past the overdraft coverage: \n");
		a3.withdraw(20.00);
		a3.withdraw(5.00);
		
		System.out.println("");
		System.out.println("This is the amount in a3 after the withdraw method \nwhile not going past the overdraft coverage: " + a3.getBalance() + "\n");
		
		//using the transfer method
		System.out.println("This is what happens when you try to \ntransfer money past the overdraft amount \n");
		a4.transfer(a3, 121);
		
		a4.transfer(a3, 25);
		System.out.println("These are the amounts in a3 and a4 after the transfer method,\nwhile staying in the overdraft amount:\n");
		System.out.println("a3:\n" + a3.getBalance() +"\n");
		
		System.out.println("a4:\n" + a4.getBalance() + "\n");
		
		//using the displayInfo method
		System.out.println("This is the info of a3 and a4 using the displayInfo method:\n");
		
		System.out.println("a3:");
		a3.displayInfo();
		System.out.println("");
		
		System.out.println("a4:");
		a4.displayInfo();
		System.out.println();
		
		
		//Starts the testing of the SavingsAccount subclass
		System.out.println("Testing the SavingsAccount subclass:\n");
		
		//using the constructors
		System.out.println("a5 using the one parameter constructor: \n" + a5);
		System.out.println("a6 using the two parameter constructor: \n" + a6);
		
		System.out.println("The interest rate for a5 using the getInterestRate method: " + a5.getInterestRate());
		System.out.println("The interest rate for a6 using the getInterestRate method: " + a6.getInterestRate());
		
		
		//using the set method
		a5.setInterestRate(0.02);
		System.out.println();
		System.out.println("The interest rate for a5 after the setInterestRate method is: " + a5.getInterestRate());
		
		//using the addInterest method
		a6.addInterest();
		System.out.println("The balance of a6 after adding the interest is: " + a6.getBalance());
		
		
		//using the toString method
		System.out.println("The info of a5 and a6 using the toString method is: \n");
		
		System.out.println("a5: \n" + a5.toString() + "\n");
		System.out.println("a6: \n" + a6.toString() + "\n");
		
		
		//using the disaplyInfo method
		System.out.println("This is the info of a5 and a6 using the displayInfo method:\n");
		
		System.out.println("a5:");
		a5.displayInfo();
		System.out.println("");
		
		System.out.println("a6:");
		a6.displayInfo();
		System.out.println();
		
		
	
	}

}
