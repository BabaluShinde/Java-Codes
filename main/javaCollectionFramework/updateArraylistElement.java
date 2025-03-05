package main.javaCollectionFramework;

import java.util.ArrayList;
public class updateArraylistElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> n =new ArrayList<>();
		
		n.add(10);
		n.add(45);
		n.add(7);
		n.add(18);
		
		System.out.println("The Original Arraylist : "+n);
		
		int r=n.set(1,33);
		System.out.println("After Updating the arraylist : "+n);
		
		System.out.println("The replaced element is  "+r);
	}

}
