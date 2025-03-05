package main.javaCollectionFramework;

import java.util.Stack;
public class stackEmptyCheckAndOtherChecks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <String> s=new Stack<>();
		
		s.push("Babalu");
		s.push("Suayash");
		s.push("Viswateja");
		
		System.out.println(s);
		
		System.out.println("Is Stack is empty or not? : "+ s.empty());
		
		// Checking for the element "Suyash" 
        System.out.println("Does the stack contains 'Suayash'? "  + s.search("Suayash")); 
        
     // Fetching the element at the head of the Stack 
        System.out.println("The element at the top of the" + " stack is: " + s.peek()); 
		
		s.pop();
		s.pop();
		s.pop();
		
		System.out.println("Is Stack is empty or not? : "+s.empty());
	}

}
