// Also called as Run time polymorphism 

package main;

class parent {
	void show() {
		System.out.println("THis is Parent Class Method");
	}
}

class child extends parent{
	
	@Override
	
	void show() {
		System.out.println("This is child class method");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		parent obj1 = new parent();
		obj1.show();
		
		child obj2 = new child();
		obj2.show();
		
		parent obj3 = new child();
		obj3.show();
		
		
		// TODO Auto-generated method stub

	}

}
