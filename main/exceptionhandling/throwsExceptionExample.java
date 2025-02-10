package main.exceptionhandling;

public class throwsExceptionExample {
	static void fun() throws IllegalAccessException{
		System.out.println("Caught in fun() :");
		throw new IllegalAccessException("Demo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			fun();
		}
		catch(IllegalAccessException e){
			System.out.println("Caught in main method.");
		}

	}

}
