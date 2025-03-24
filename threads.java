package project;
import java.io.*;
class MyThread extends threads{
public void run() {
System.out.println("thread is running");
}
}
public class threads {
public static void main(String args[]) {
MyThread thread1=new MyThread();  //creating by extending thread class
thread1.run(); //start the thread
}
}