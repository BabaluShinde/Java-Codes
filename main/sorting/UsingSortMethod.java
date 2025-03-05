package main.sorting;

//Java Program to sort an elements in ascending order

//Importing Arrays class from java.util package
import java.util.Arrays;
public class UsingSortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {28,90,12,10,15,2,8,100};
		
		  // Calling the sort() method present
        // inside Arrays class
		
		Arrays.sort(arr);
		
        // Printing and display sorted array
		System.out.printf("Modified arr[]  : %s",Arrays.toString(arr));
	}
	
}
