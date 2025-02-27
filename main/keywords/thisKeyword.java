package main.keywords;



public class thisKeyword {
	int a=10;
	static int b=20;
	int age;
	String name;
	
	thisKeyword(){
		this("Babalu",23);
		System.out.println("Constructor test.");
		
	}
	
	thisKeyword(String name, int age){
		this.name =name;
		this.age=age;
	}
	
	void test() {
		this.a=100;
		System.out.println(a);
		this.b=600;
		System.out.println(b);
		
		
		
	}
	
	void display() {
		System.out.println("Name:"+name +",age: "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new thisKeyword().test();
		
		
		thisKeyword p1= new thisKeyword();
		p1.display();

	}

}


//We can use the this keyword as many times 