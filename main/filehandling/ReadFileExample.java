package main.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName="D:\\example.txt";
		
		try(BufferedReader reader=new BufferedReader(new FileReader(fileName))){
			String line;
			
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
		}
		catch(IOException e){
			System.out.println("An error occurs while reading the file.");
			e.printStackTrace();
		}

	}

}
