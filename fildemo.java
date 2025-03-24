package project;
import java.io.*;
public class fildemo {
	public static void main(String[]args) {
		try {
			//writing data to a file
			FileWriter w1=new FileWriter("./file.txt");
			w1.write("Hello,java I/O");
			w1.close();
			System.out.print("Data written to file");
			//Reading data from the file
			FileReader r1=new FileReader("./file.txt");
			int Character;
			while ((Character = r1.read()) != -1){
				System.out.print((char) Character);
			}
			r1.close();
		}
		catch(IOException e) {
			System.out.print("An error occurred:"+e.getMessage());
		}
		
		}
	
		
			
		}
			
			
		
		


	

