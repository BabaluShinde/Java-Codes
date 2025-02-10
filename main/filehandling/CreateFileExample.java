package main.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("D:\\example.txt");
		
		try {
			if (file.createNewFile()) {
				System.out.println("File Created Successfully!!"+ file.getName());
			}
			else {
				System.out.println("File already Exists");
			}
		}
		catch(IOException e){
			System.out.println("An error occurs while creating the file.");
			
		}
		

	}

}
