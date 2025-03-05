package main.sorting;

import java.util.Scanner;

public class SortingWithLoops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the how many numbers you wants: ");
		
		int size=scanner.nextInt();
		
		int[] arr=new int[size];
		
		System.out.println("Enter "+size+" numbers");
		
		for(int i=0; i< size; i++) {
			arr[i]=scanner.nextInt();
		}
		
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp= arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("The Sorted array is as follows: ");
		
		for(int num:arr) {
			System.out.println(num+" ");
		}
		

		scanner.close();
	}

}
