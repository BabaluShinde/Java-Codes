package main.conditionalstatements;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enther the Age you want? : ");
		int age =scanner.nextInt();
		boolean hasLicense= true;
		
		if(age>=18) {
			if(hasLicense){
				System.out.println("You can drive.");
			}
			else {
				System.out.println("You need a lecense to Drive the Vehicle.");
			}
		}
		else {
			System.out.println("You are not eligible to drive the Vehical.");
		}
		
	}

}
