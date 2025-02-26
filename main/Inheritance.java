package main;


class Animal{
	void eat() {
    System.out.println("The Animal Eats food.");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("The Dog barks.");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog=new Dog();
		dog.eat();
		dog.bark();

	}

}

//Most IDEs generate getters and setters automatically:
//🔹 In IntelliJ IDEA:
//
//Right-click → Generate → Getter and Setter
//🔹 In Eclipse:
//Source → Generate Getters and Setters