package project;
import java.io.*;
public class filewriter {
  public static void main(String[]args) {
	try{
	   FileWriter writer=new FileWriter("file.txt");
	   writer.write("Hello all");
	   writer.close();
	   System.out.println("Data successfully writen to file");
      }catch (IOException e) {
	System.out.println("Error writing to the file:"+e.getMessage());
}
	
	
	
}
}
