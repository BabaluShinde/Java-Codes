package main.importants;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int number =scanner.nextInt();
		
		if(number%2==0)
			System.out.println(number+ " is even number.");
		else
			System.out.println(number+ (" is odd number."));
		
		

		scanner.close();

	}

}
