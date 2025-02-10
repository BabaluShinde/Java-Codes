package main;

class modifiers{
	
	private int a=2;
	protected int b=4;
	int c=6;
	public int d=8;
	
	private void ShowA() {
		System.out.println("Private"+ a);
	}
	
	protected void ShowB() {
		System.out.println("Protected"+  b);
	}
	
	void ShowC() {
		System.out.println("Default"+  c);
	}
	
	public void ShowD() {
		System.out.println("Public"+  d);  
	}
}

public class AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		modifiers Obj =new modifiers();
		
//		Obj.ShowA();         // not visible
		Obj.ShowB();		//Visible due to same package 	
		Obj.ShowC();		//Visible due to same package 
		Obj.ShowD();		//Visible due to same package
		


	}

}
