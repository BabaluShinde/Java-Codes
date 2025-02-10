package main.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteFileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName="D:\\example.txt";
		try(BufferedWriter writer =new BufferedWriter(new FileWriter(fileName))) {
			writer.write("Hello World!!");
			writer.newLine();
			writer.write("This is Sample text file");
			System.out.println("File written Successfully!!!");
		}
		catch(IOException e) {
			System.out.println("An error occurs while writing the file.");
			e.printStackTrace();
		}

	}

}
