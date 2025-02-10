package main.importants;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1121, reverse=0;
		int originalNum=num;

		do {
			int digit=num%10;
			reverse=reverse*10 +digit;
			num=num/10;
		}while(num>0); 
		if(originalNum==reverse) {
			System.out.println("Palindrome Number.");
		}
		else {
			System.out.println("Not Palindrome Numeber.");
		}


	}

}
