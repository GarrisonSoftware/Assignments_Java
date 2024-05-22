package assg9_garrisoncl21;


import java.util.*;
public class CustomerMIS {

	public static void main(String[] args) {
		String selection = "0";
		Scanner kbd = new Scanner(System.in);
		CustomerRoster roster = new CustomerRoster();
		String fileName = "assg9_CustomerRoster.txt";
		String tempId , tempName , tempNumber;
		
		roster.loadData(fileName);
		
		while(!selection.equals("6"))
		{
			
			System.out.println("1) Display Customer Roster");
			System.out.println("2) Add Customer");
			System.out.println("3) Delete Customer");
			System.out.println("4) Search for Customer");
			System.out.println("5) Update Customer");
			System.out.println("6) Save and Exit");

			selection = kbd.nextLine();

			switch(selection)
			{
				
				case "1":
				{
					roster.displayRoster();
					//kbd.nextLine();
					break;
				}
				
				case "2":
				{
					System.out.println("What is the Id for the Customer? ");
					tempId = kbd.nextLine();
					
					System.out.println("What is the name of the Customer? ");
					tempName = kbd.nextLine();
					
					System.out.println("What is the number of the Customer? ");
					tempNumber = kbd.nextLine();
					
					roster.addCustomer(tempId,tempName,tempNumber);
					
					//kbd.nextLine();

					break;
				}
				
				case "3":
				{
					break;
				}
				
				case "4":
				{
					break;
				}
				
				case "5":
				{
					break;
				}
				
				case "6":
				{
					break;
				}
				
				default:
				{
					System.out.println("That's not an option!");
				}
			}
		}
		
		System.out.println("Shutting down...");

	}

}
