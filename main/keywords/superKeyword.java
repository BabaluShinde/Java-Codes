package main.keywords;

class parent{
	void show(){
		System.out.println("Parent method");
	}
	
	parent(){                   //constructor name must be same as the class name.(parent)
		System.out.println("This the parent Constructor");
	}
	int a=10;
	static int b=20;
	
}
class child extends parent{
	void test() {
		
		System.out.println(super.a);  //Accessing parent class variable.
		
		System.out.println(super.b);
		super.show();                 //Calling parent class method.

	}
	child(){						//constructor name must be same as the class name as the e.g. child with case sensitive.
		super();                     //invoked parent class constructor i.e. parent();
		System.out.println("This is chilld constructor.");
	}
}
public class superKeyword {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new child().test();
	}

}

//We can use the super key many times like this keyword .
