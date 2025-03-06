package main.logic;

public class FactorialRecursive {
	public static int factorial(int num) {
		if(num==0) return 1;
		return num*=factorial(num-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		System.out.println(" The factorial of the "+num+" is: "+factorial(num));

	}

}
