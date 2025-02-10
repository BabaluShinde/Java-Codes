// Also called as Compile time polymorphism 

package main;

class mathsoperation{
	
	int add (int a,int b) {
		return a+b;
	}
	
	double add (double a, double b) {
		return a+b;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mathsoperation math = new mathsoperation();
		System.out.println(math.add(4.5, 3.0));
		System.out.println(math.add(3, 4));

	}
	

}
