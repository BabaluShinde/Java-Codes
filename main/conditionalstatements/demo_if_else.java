package main.conditionalstatements;

public class demo_if_else {
	
	public static void main(String[] args) {
		
//		int num1=4;
//		int num2=5;
//		int a=7;
//		int b=9;
//		if(num1<num2 && b<a )
//			System.out.println("Hello");
		
//		else 
//			System.out.println("Bye");
//		
//		System.out.println();
		
		int i = 5;		
		int j = 0;
			
		if(i>6)
			j=1;
		else
			j=2;
	
		j = i>2?1:2;	//ternary operation 
		System.out.println(j);
	}

}
