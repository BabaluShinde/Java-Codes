package main.javaCollectionFramework;

// Java Program to demonstrate Addition of
//Elements to an ArrayList
import java.util.ArrayList;
public class addingElementToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> al= new ArrayList<>();
		

        // Use add() method to 
        // add elements in the list
        al.add(10);
        al.add(20);
        al.add(30);
        
        System.out.println("" + al);

        // Adding new element at any index
        int i=2;
        al.add(i, 500);
        
		System.out.println(" "+al);
		
		 // This makes a call to remove(int) and
        // removes element 20
        al.remove(1);

		System.out.println(" "+al);

	}

}
