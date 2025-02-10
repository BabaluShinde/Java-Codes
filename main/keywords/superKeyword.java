package main.keywords;

class parent{
	
	int a=10;
	static int b=20;
	
}
class child extends parent{
	void test() {
		
		System.out.println(super.a);
		
		System.out.println(super.b);

	}
}
public class superKeyword {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new child().test();
	}

}

//We can use the super key many times like this keyword .
