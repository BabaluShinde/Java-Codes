package main.importants;

import java.util.Scanner;

public class demoPalindrome {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Palindrome string: ");
		
		String input =scanner.nextLine();
		
		if(isPalindrome(input)) {
			
			System.out.println(input+" is a palindrome.");
		}
		
		else {
			
			System.out.println(input+" is not a palindrome.");
		}
		
	}

	private static boolean isPalindrome(String input) {
		// TODO Auto-generated method stub
		
		input=input.replaceAll("\\s+", "").toLowerCase();
		
		int left=0;
		int right=input.length()-1;
		
		while(left<right) {
			
			if(input.charAt(left) != input.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		
		return true;
	}

}
