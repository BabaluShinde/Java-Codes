package main.javaCollectionFramework;

import java.util.Stack;
public class travelTroughStackUsingEmptyMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> s=new Stack<>();
		
		s.push(50);
		s.push(18);
		s.push(43);
		s.push(82);
		s.push(18);
		System.out.println("The stack before : "+s);
		
		int sum=0;
		while(!s.empty()) {
			sum+=s.pop();
		}
		System.out.println("The sum of the Elements in stack is the : "+sum);
		
		System.out.println("Stack is empty to track further? " +s.empty());

		

	}

}
