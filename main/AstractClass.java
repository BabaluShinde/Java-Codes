package main;

abstract class Vehicle{
	abstract void start();
	
	void stop() {
		
		System.out.println("Vehicle stopped");
		
	}
}

class Car extends Vehicle{
	
	void start() {
		
		System.out.println("Vehicle started with a key");
	}
}

public class AstractClass {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.stop();
		myCar.start();
		
		// TODO Auto-generated method stub
		
		

	}

}
