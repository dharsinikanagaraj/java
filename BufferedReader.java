package project;
import java.io.*;
public class BufferedReader {
public static void main(String[]args) {  //buffer reader
	/*try {

	BufferedReader r1 =new BufferedReader(new FileReader("C:\\Test\\Sample.txt"));

String line;

System.out.println("reading file line by line");

while((line=r1.readLine())!=null) {

	System.out.println(line);	
}
r1.close();
}catch(IOException e) {
System.out.println("error reading file:"+e.getMessage());
       }
    }
}*/


	

//bufferwriter
            try {
	            BufferedWriter writer=new BufferedWriter(new FileWriter("c:\\Test\\Sample.txt"));
	            writer.write("java file handling example");
	            writer.newLine();
	            writer.write("Bufferedwriter makes writing more efficient");
	            writer.close();
	            System.out.println("data written to file successfull");
            }catch(IOException e) {
	            	System.out.println("error writing to file:"+e.getMessage());
	            }
}
            }
