package assg9_garrisoncl21;

import java.util.*;

import assg6_garrisoncl21.Student;

import java.io.File;
import java.io.FileNotFoundException;


public class CustomerRoster {
	
	String tempId , tempName , tempPhoneNumber;
	String extraId , extraName , extraPhoneNumber;
	Customer customer, temp, extra;
	int index = 0;
	
	BinarySearchTree<Customer,String> bst = new BinarySearchTree<Customer,String>();
	BinarySearchTree<Customer,String> tempBst = new BinarySearchTree<Customer,String>();

	TreeIterator<Customer> treeIter = new TreeIterator<Customer>(bst);

	ArrayList<Customer> resultList = new ArrayList<Customer>();
	ArrayList<Customer> sortedCustomerList = new ArrayList<Customer>();
	
	
	
	
	public static void treeSort(ArrayList<Customer> lst) {

		ArrayList<Customer> resultList = new ArrayList<Customer>();
		BinarySearchTree<Customer, String> bst = new BinarySearchTree<Customer, String>();
		TreeIterator<Customer> iter;
		 
		// create the binary search tree
		for (Customer Customer:lst) {
			bst.insert(Customer);
		}
		
		// do an in-order traversal of the binary search tree
		iter = new TreeIterator<Customer>(bst);
		
		iter.setInorder();
		
		while (iter.hasNext()) {
			resultList.add(iter.next());
		}
		
		//return resultList;
	}
	
	public void updateCustomer(String givenId)
	{
		
	}
			
	public void searchCustomer(String givenId)	
	{
		temp = bst.retrieve(givenId);
		if(temp != null)
		{
			System.out.println(temp.getName() + " " + temp.getPhoneNumber());
		}
		
		else
		{
			System.out.println("There isn't a customer with that Id!");
		}
			
	}
	
	public void deleteCustomer(String givenId)
	{
		if(bst.retrieve(givenId) != null)
		{
			bst.delete(givenId);
		}
	}
	
	public void addCustomer(String givenId, String givenName, String givenPhoneNumber)
	{
		if(bst.retrieve(givenId) != null)
		{
			System.out.println("The id is already in the tree!!");
		}
		
		else
		{
			bst.insert(new Customer(givenId,givenName,givenPhoneNumber));
		}
	}
	
	public void displayRoster()
	{
		//TreeIterator<Customer> tempIter = new TreeIterator<Customer>(tempBst);
		while(treeIter.hasNext())
		{
			temp = treeIter.next();
			System.out.println(temp.getKey() + "\t" + temp.getName() + "\t" + temp.getPhoneNumber());
			tempBst.insert(new Customer(temp.getKey(),temp.getName(), temp.getPhoneNumber()));

		}
		TreeIterator<Customer> tempIter = new TreeIterator<Customer>(tempBst);

		if(!tempIter.hasNext())
		{
			System.out.println("temp tree has items!");
		}
		
		//Iterator<Customer> iter = resultList.iterator();
		//while(iter.hasNext())
		//{
			//System.out.println(iter.next());
		//}
		/*while(iter.hasNext())
		{
			temp = iter.next();
			/*tempId = temp.getKey();
			tempName = temp.getName();
			tempPhoneNumber = temp.getPhoneNumber();
			
			tempBst.insert(new Customer(tempId , tempName , tempPhoneNumber));
			
			customerList.add(temp);
			//System.out.println(temp.getKey());
			//System.out.println("Name.." + temp.getName());
			//System.out.println("Nunmber.." + temp.getPhoneNumber());
			System.out.println(temp.getKey() + "\t" + temp.getName() + "\t" + temp.getPhoneNumber());
		}
		//TreeIterator<Customer> tempIter = new TreeIterator<Customer>(tempBst);
		//TreeIterator<Customer> iter = new TreeIterator<Customer>(bst);
		BinarySearchTree<Customer,String> bst = new BinarySearchTree<Customer,String>();

		while(index < customerList.size())
		{
			extra = customerList.get(index);
			extraId = extra.getKey();
			extraName = extra.getName();
			extraPhoneNumber = extra.getPhoneNumber();
			bst.insert(new Customer(extraId, extraName , extraPhoneNumber));
			index++;
		}
		
		TreeIterator<Customer> iter = new TreeIterator<Customer>(bst);
		//BinarySearchTree<Customer,String> bst = new BinarySearchTree<Customer,String>();


		index = 0;
		

		while(tempIter.hasNext())
		{
			extra = tempIter.next();
			
			extraId = extra.getKey();
			extraName = extra.getName();
			extraPhoneNumber = extra.getPhoneNumber();
			
			System.out.println("In the tempBst.." + extra.getKey() + "\t" + extra.getName() + "\t" + extra.getPhoneNumber());
			
		
			bst.insert(new Customer(extraId,extraName,extraPhoneNumber));

		}
		//bst = tempBst;
		//TreeIterator<Customer> iter = new TreeIterator<Customer>(bst);

		if(!iter.hasNext())
		{
			System.out.println("The tree is empty");
		}*/
	}
	
	public void loadData(String givenFileName)
	{
		
		Scanner fileInput = null;
		File inFile = new File(givenFileName);
		
		
		try
		{
			fileInput = new Scanner(inFile);
				
			while(fileInput.hasNextLine())
			{
				
				
				StringTokenizer line = new StringTokenizer(fileInput.nextLine(),"\t");
				
				//this loop runs while the StringTokenizer line has tokens
				//the loop takes the tokens and assigns them to their appropriate variables
				//the variable are then plugged into the Customer constructor
				while(line.hasMoreTokens())
				{
					
					tempId = line.nextToken();
					//System.out.println("Id in token..." + tempId);
					tempName = line.nextToken();
					//System.out.println("Name..." + tempName);
					tempPhoneNumber = line.nextToken();
					//System.out.println("Number..." + tempPhoneNumber);
					
					bst.insert(new Customer(tempId,tempName,tempPhoneNumber));
					
					
				}
		
				
			}
			
			treeIter.setInorder();

			fileInput.close();
			
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println();
			System.out.println(e.getMessage());
			System.out.println();
		}
	}

}
