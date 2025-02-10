package main.exceptionhandling;

import java.io.*;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=10;
		int n=0;
		try {
			int ans=m/n;	
			System.out.println("m divide n is : "+ ans);
		}
		catch(ArithmeticException  e) {
			System.out.println("An error Occurs while exception!");
			e.printStackTrace();
		}
		finally {
			int result=m*n;
			System.out.println("The finally block executes with result: "+result);
		}

	}

}
