package main.importants;

public class ReversePalindromeString {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		String s= "Nitin";
		String r="";
		char ch;
		
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			r=ch+r;
			
			
		}
		System.out.println(r);

		if(s.equalsIgnoreCase(r)) {
			System.out.println("Palindrome string .");
		}
		else {
			System.out.println("Not a Palindrome string  .");
		}
	}

}
