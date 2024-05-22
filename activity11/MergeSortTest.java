package activity11;

import java.util.*;

import assg6_garrisoncl21.Student;
public class MergeSortTest {

	//7152
	public static void main(String[] args) {
		ArrayList<Integer> test1 = new ArrayList<Integer>();
		ArrayList<Integer> test2 = new ArrayList<Integer>();
		ArrayList<Integer> test3 = new ArrayList<Integer>();
		//int k = 10;
		Random rand = new Random();
		
		for(int i = 7; i < 11 ;i++ )
		{
			
			test1.add(rand.nextInt(20));
			
		}
		
		for(int i = 0; i < 6 ;i++ )
		{
			
			test2.add(rand.nextInt(20));
			
		}
		System.out.println("Test1 before sort:" + test1);
		System.out.println("Test2 before sort:" + test2);
		test3 = merge(test1,test2);
		System.out.println("Test3 after merge:" + test3);
		
		mergeSort(test3);
		System.out.println("Test3 after mergeSort: " + test3);
		//System.out.println("Modulous" + 3%2);
		

	}
	
	public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2)
	{
		
		ArrayList<Integer> finalList = new ArrayList<Integer>();
		int temp1;
		int temp2;
		Iterator<Integer> list1Iter = list1.iterator();
		Iterator<Integer> list2Iter = list2.iterator();
		int size = list1.size() + list2.size();
		temp1 = list1Iter.next();
		temp2 = list2Iter.next();
		while(finalList.size() < size)
		{
			
			/*if(!list1Iter.hasNext() || !list2Iter.hasNext())
			{
				if(list1.size() > list2.size())
				{
					finalList.addAll(list1);
				}
				else if(list1.size() < list2.size())
				{
					finalList.addAll(list2);
				}
				
			}*/
			
			if(temp1 < temp2)
			{
				finalList.add(temp1);
				if(list1Iter.hasNext())
				{
					temp1 = list1Iter.next();
				}
				
				else
				{
					finalList.addAll(list2);
				}
				
			
			}
			
			else if(temp2 < temp1)
			{
				finalList.add(temp2);
				if(list2Iter.hasNext())
				{
					temp2 = list2Iter.next();
				}
				
				else
				{
					finalList.addAll(list1);
				}
				
			}
			
			else if(temp1 == temp2)
			{
				finalList.add(temp1);
				finalList.add(temp2);
				
				if(list1Iter.hasNext() && list2Iter.hasNext())
				{
					temp1 = list1Iter.next();
					temp2 = list2Iter.next();
				}
				
				else if(list1Iter.hasNext())
				{
					finalList.addAll(list1);
				}
				
				else if(list2Iter.hasNext())
				{
					finalList.addAll(list2);
				}
				
				
				
			}
			
		}
		
		
		return finalList;
		
		
		
	}
	
	public static ArrayList<Integer> mergeSort(ArrayList<Integer> givenList)
	{
		
		ArrayList<Integer> subList1 = new ArrayList<Integer>();
		ArrayList<Integer> subList2 = new ArrayList<Integer>();
		ArrayList<Integer> sorted1 = new ArrayList<Integer>();
		ArrayList<Integer> sorted2 = new ArrayList<Integer>();
		ArrayList<Integer> finalSorted = new ArrayList<Integer>();
		//ArrayList<Integer> subList1 = new ArrayList<Integer>();
		//ArrayList<Integer> subList2 = new ArrayList<Integer>();
		
		int index1;
		int index2;
		//List<Integer>sublist1;
		//List<Integer>sublist2;
	

		if(givenList.size() == 1)
		{
			return givenList;
		}
		
		else
		{
			
			
			index1 = (givenList.size()/2);
			index2 = (givenList.size()/2);//givenList.size()-index
			
			subList2.addAll(index2,givenList);
			
			subList1.addAll(finalSorted);
			
			//sublist1 = 
			
			/*sublist2 = givenList.subList(index1, givenList.size()-1);


			System.out.println("Index 1 is:" + index1);
			//System.out.println("Index 2 is: " + index2);
			System.out.println("sublist1 is " + givenList.subList(0, index1));
			System.out.println("sublist2 is " + givenList.subList(index2, givenList.size()));*/

			
			
			
			
			
			/*subList1.add(givenList.get(0));
			subList1.add(givenList.get(1));
			givenList.remove(0);
			givenList.remove(1);*/
			
			
		}
		
		
		
		
		/*if(givenList.size() == 1)
		{
			
			return givenList;
			
		}
		
		else if(givenList.size() == 2)
		{
			index1 = 0;
			index2 = 1;
			
			sublist1 = givenList.subList(0, index1);
			sorted1 = mergeSort(subList1);
			
			sublist2 = givenList.subList(index2, givenList.size()-1);
			sorted2 = mergeSort(subList2);
			
			finalSorted = merge(sorted1,sorted2);
		}
		else
		{
			index1 = (givenList.size()/2)-1;
			index2 = (givenList.size()/2);//givenList.size()-index1;
			
			sublist1 = givenList.subList(0, index1);
			System.out.println("Sublist 1:" + subList1);
			sorted1 = mergeSort(subList1);
			
			sublist2 = givenList.subList(index2, givenList.size()-1);
			System.out.println("Sublist 2 :" + subList2);
			sorted2 = mergeSort(subList2);
			
			finalSorted = merge(sorted1,sorted2);
		}
		
		/* = givenList.subList(0, index1);
		sorted1 = mergeSort(subList1);
		
		sublist2 = givenList.subList(index2, givenList.size()-1);
		sorted2 = mergeSort(subList2);
		
		finalSorted = merge(sorted1,sorted2);*/
		
		return finalSorted;
		
		/*if((givenList.size()) == 1 )
		{
			//this list has one item and it is sorted
			return givenList;
			//sorted1 =(merge(subList1,subList2));
		}
		else
		{
			index1 = givenList.size()/2;
			index2 = givenList.size()-index1;
			
			sublist1 = givenList.subList(0, index1);
			//mergeSort(subList1);
			//sublist1.get(1);
			sublist2 = givenList.subList(index2, givenList.size()-1);
			
		}
		
		
		
		
		
		/*if((givenList.size()/2) == 0)
		{
			sorted1 =(merge(subList1,subList2));
		}
		else if((givenList.size()/ 2) == 1)
		{
			subList1.add(givenList.get(0));
			subList2.add(givenList.get(1));
			
			givenList.remove(0);
			givenList.remove(1);
			mergeSort(givenList);
		}
		
		
		/*if(givenList.size() <=2 && givenList.size() > 0) 
		{
			givenList.get(givenList.size()-1);
		}*/
		
		
		
		
		
		
		
		
		
		/*int index1;
		int index2;
		List<Integer>sublist1;
		List<Integer>sublist2;
		index1 =givenList.size()/2;
		index2 = givenList.size()-index1;
		
		sublist1 = givenList.subList(0, index1);
		sublist1.get(1);
		sublist2 = givenList.subList(index2, givenList.size()-1);
		
		return givenList;*/
		
		
		
		
	}

}
