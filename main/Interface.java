package main;

interface Engine{
	void start();
}

class bike implements Engine{
	
public void start() {
		System.out.println("Bike starts with a button");
	}
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike myBike = new bike();
		myBike.start();

	}

}
