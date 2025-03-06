package main.logic;

public class PrimeCheck {
	public static boolean isprime(int n) {
		if(n<=1) return false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) return false;
		}
		return true;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=13;
		System.out.println("The Given"+ num +" is a Prime?: " +isprime(num));

	}

}
