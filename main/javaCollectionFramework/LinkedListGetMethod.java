package main.javaCollectionFramework;
//Java Program to illustrate get() method 

import java.util.LinkedList;
public class LinkedListGetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Creating an empty LinkedList 
		LinkedList <Integer> l= new LinkedList<>();

        // Use add() method to add 
        // elements in the list
		l.add(45);
		l.add(7);
		l.add(18);
		l.add(10);
		System.out.println("The added LinkedList is : "+l);
		
        // Fetching the specific element from the list
		System.out.println("The element at index 3 is " + l.get(3));
		
		// Trying to get an element 
        // at an invalid index
		try {
			int n=l.get(5);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("Error: Indexbounderror");
		}

	}

}
