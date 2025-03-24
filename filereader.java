package project;
import java.io.*;
public class filereader {
public static void main(String[]args) {
	try {
		FileReader reader=new FileReader("./File.txt");
		int character;
		System.out.print("File contents:");
		while((character=reader.read()) !=-1) {
			System.out.print((char) character);
		}
	
		reader.close();
	}catch(IOException e) {
			System.out.print("Enter reading the file:"+e.getMessage());
			
		}

}
}
