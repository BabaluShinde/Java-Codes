package main.logic;

public class PalindromeCheck {
	public static boolean isPalindrome(int n) {
		int original=n, reversed=0;
		while(n>0) {
			reversed=reversed*10 + n%10;
			n= n/10;
		}
		return original==reversed;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=121;
		System.out.println("The given "+num+"is a palindrome?: "+isPalindrome(num));
	}

}
