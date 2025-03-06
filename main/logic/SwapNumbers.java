package main.logic;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20;
		System.out.println("Numbers before Swapping are: a= "+a+" b= "+b); 
		a=a+b;  															//a=10+20
		b=a-b;																//b=10+20-20
		a=a-b;																//a=10+20-10+20-20
		System.out.println("Numbers after Swapping are: a= "+a+" b= "+b); 


	}

}
