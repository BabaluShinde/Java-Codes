package main;

public class Encapsulation {
	private String name;
	
	//getter
	public String getName() {
		return name;
		
	}
	//setter
	
	public void setName( String newName) {
		this.name=newName;
	}
	
	public static void main (String[] args) {
		
		Encapsulation Obj= new Encapsulation();
		Obj.setName("Babalu");
		String result=Obj.getName();
		System.out.println("The name is : "+result);
	}

}
