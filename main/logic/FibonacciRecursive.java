package main.logic;
//Recursive approach

public class FibonacciRecursive {
	public static int fibonacci(int n) {
		if (n<=1) return n;
		return fibonacci(n-1)+ fibonacci(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n= 20;
		for (int i=0;i<n;i++) {
			System.out.println(fibonacci(i)+" ");
		}

		
	}

}
