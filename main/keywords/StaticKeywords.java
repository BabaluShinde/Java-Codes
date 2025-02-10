package main.keywords;

class Example{
	static int count=0;		//static variable
    
	static void show() {	//static method
		System.out.println("Hello from static method");
	}
	
	static {											//static block
		System.out.println("Hello from static block");
	}
}
public class StaticKeywords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example.show();       //calling static method without object 
		
		System.out.println("Count = "+Example.count);  //Accessing the static variable here 

	}

}
