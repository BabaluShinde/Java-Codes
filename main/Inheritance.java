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
