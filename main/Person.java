//Setter and Getter in java 
package main;

public class Person {
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		this.name=newName;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person=new Person();
		person.setName("Suyash");
		String result=person.getName();
		System.out.println("Name is a : "+result);
	}

}
