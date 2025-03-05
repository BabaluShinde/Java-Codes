package main.javaCollectionFramework;


import java.util.Hashtable;
public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashtable is a Multi-threaded applications
		
		Hashtable <Integer,String> hash_table=new Hashtable <>();
		hash_table.put(2,"ABC");
		hash_table.put(5,"XYZ");    	    // ❌ table.put(null, "NoName"); // Throws NullPointerException
											// ❌ table.put(4, null); // Throws NullPointerException
		hash_table.put(1,"DEF");
		hash_table.put(3,"UVW");
		
		 // Displaying the Hashtable 
		System.out.println("Initial Table is: : "+hash_table);
		
		//Getting the value of 5
		System.out.println("The value of the 5 is: "+ hash_table.get(5));


		// Removing the existing key mapping
		String Returned_value= hash_table.remove(1);
		
		System.out.println("Returned Value is : "+Returned_value);
		
		System.out.println("The new updated table is: " +hash_table);
		
		
		hash_table.put(10, "AYX");
		hash_table.put(15, "BYK");
		hash_table.put(20, "RYK");
		
		 // Displaying the Hashtable 
		System.out.println("The new updated table is: " +hash_table);

        // Displaying the size of the table
		System.out.println("The size of the table is : "+hash_table.size());

		
	}

}
