package main.javaCollectionFramework;

import java.util.Stack;
public class stackEmptyCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <String> s=new Stack<>();
		
		s.push("Babalu");
		s.push("Suayash");
		s.push("Viswateja");
		
		System.out.println(s);
		
		System.out.println("Is Stack is empty or not? : "+ s.empty());
		
		s.pop();
		s.pop();
		s.pop();
		
		System.out.println("Is Stack is empty or not? : "+s.empty());
	}

}
