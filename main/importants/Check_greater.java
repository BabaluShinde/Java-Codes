package main.importants;

import java.util.Scanner;

public class Check_greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the value x: ");
		int x=scanner.nextInt();
		
		System.out.println("Enter the value y: ");
		int y=scanner.nextInt();
		
		System.out.println("Enter the value z: ");
		int z=scanner.nextInt();
		
		if(x>y && x>z)
			System.out.println(x +" is greater Number.");
		else if (y>z)
			System.out.println(y+" is greater Number.");
		else
			System.out.println(z+" is greater Number.");
			
	}

}
