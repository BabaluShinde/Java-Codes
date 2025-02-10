package main.exceptionhandling;

class throwExceptionExample{
	static void fun() {
		
		try {
			throw new NullPointerException();
		}
		catch(NullPointerException e) {
			System.out.println("Caught inside Fun().");
			throw e;  
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try  {
			fun();
		}
		catch(NullPointerException e){
			System.out.println("Caught in main");
		}
	}

}
