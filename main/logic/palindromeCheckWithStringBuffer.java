package main.logic;

public class palindromeCheckWithStringBuffer {

	    public static boolean isPalindrome(String str) {
	    	
	        str = str.toLowerCase();  							// Convert to lowercase

	    	
	        String reversed = new StringBuilder(str).reverse().toString();    //we can use the StringBuffer instead of the StringBuilder 
	        return str.equals(reversed);
	    }

	    public static void main(String[] args) {
	        String input = "Madam";
	        if (isPalindrome(input)) {
	            System.out.println(input + " is a palindrome.");
	        } else {
	            System.out.println(input + " is not a palindrome.");
	        }
	    }
	}
