package main.filehandling;

import java.io.File;
import java.io.IOException;

public class DeleteFileExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file=new File("D:\\example.txt");
		if (file.delete()) {
			System.out.println("File Deleted Successfully!!!"+ file.getName());
		}
		else {
			System.out.println("No such a file found to delete.");
		}
	}

}
