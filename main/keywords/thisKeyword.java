package main.keywords;



public class thisKeyword {
	int a=10;
	static int b=20;
	
	void test() {
		this.a=100;
		System.out.println(a);
		this.b=600;
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new thisKeyword().test();

	}

}


//We can use the this keyword as many times 