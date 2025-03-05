package main.javaCollectionFramework;

import java.util.HashSet;
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> names= new HashSet<>();
	
		names.add("Bob");
		names.add("Alice");
		names.add("Charlie");
		names.add("Alice");

		System.out.println("Hashset Elements: "+names);
		
		System.out.println("The hashset does contains the Bob element in it?"+ names.contains("Bob"));
		
		names.remove("Charlie");
		
		System.out.println("After removal : " +names);
		
		System.out.println("Iterating over HashSet:");
		
		for(String name : names) {
			System.out.println(name);
		}

	}

}
