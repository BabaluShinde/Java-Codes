package main.sorting;

//A sample Java program to sort an array
//in descending order using Arrays.sort().

import java.util.Arrays;
import java.util.Collections;

public class UsingSortMethodDescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr= { 34,23,100,6,7,10};
		
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.printf("Modified array : %s", Arrays.toString(arr));
		
	}

}
