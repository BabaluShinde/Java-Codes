package main.importants;

import java.util.Scanner;

public class demoPrime {
	
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter a Number: ");
         int number = sc.nextInt();
		
         if (isPrime(number)) {
        	 
        	 System.out.println(number + " is Prime Number. ");
         }
		
         else {
        	 System.out.println(number + " is not a prime number. ");
         }
         sc.close();
	}

	private static boolean isPrime(int number) {
		// TODO Auto-generated method stub
		if(number<=1) {

		return false;
		}
		
		for (int i=2;i<= Math.sqrt(number);i++) {
			
			if (number % i ==0) {
				return false;
			}
			
		}
		return true;
		
	}

}