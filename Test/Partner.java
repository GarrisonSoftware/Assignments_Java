package Test;



import java.util.ArrayList;



import java.util.Scanner;



public class Partner {



public static void main(String[] args) {



Scanner input = new Scanner(System.in);



System.out.print("Enter the number of integers to be sorted: ");



int n = input.nextInt();



ArrayList<Integer> list = new ArrayList<Integer>();



System.out.print("Enter the integers (separated by space): ");



for (int i = 0; i < n; i++) {



list.add(input.nextInt());



}



System.out.println("The list before sorting: " + list);



ArrayList<Integer> sortedList = mergeSort(list);



System.out.println("The list after sorting: " + sortedList);



}



public static ArrayList<Integer> mergeSort(ArrayList<Integer> list) {



if (list.size() <= 1) {



return list;



}



ArrayList<Integer> firstHalf = new ArrayList<Integer>();



ArrayList<Integer> secondHalf = new ArrayList<Integer>();



int mid = list.size() / 2;



for (int i = 0; i < mid; i++) {



firstHalf.add(list.get(i));



}



for (int i = mid; i < list.size(); i++) {



secondHalf.add(list.get(i));



}



firstHalf = mergeSort(firstHalf);



secondHalf = mergeSort(secondHalf);



return merge(firstHalf, secondHalf);



}



public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {



ArrayList<Integer> mergedList = new ArrayList<Integer>();



int i = 0;



int j = 0;



while (i < list1.size() && j < list2.size()) {



if (list1.get(i) < list2.get(j)) {



mergedList.add(list1.get(i));



i++;



} else {



mergedList.add(list2.get(j));



j++;



}



}



while (i < list1.size()) {



mergedList.add(list1.get(i));



i++;



}



while (j < list2.size()) {



mergedList.add(list2.get(j));



j++;



}



return mergedList;



}



}