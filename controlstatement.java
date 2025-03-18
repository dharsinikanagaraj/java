package day1program;
import java.util.*;
public class controlstatement {
	public static void main(String[] args){
		//if statement//
		/*int a=10;
		int b=20;
		if(a>b){
			System.out.println("A less than B");
		}
		else{
			System.out.println("B less than A");
		}*/


          //if else statement//
      /*int a=10;
      int b=20;
      if(a<b) {
      if(a%2==0)	 
     {
	 System.out.println(a+"Even number");
     }
	 }*/
		
		
		//if else if//
     /*int a=100;
      int b=200;
      int c=300;
      if(a>b && a>c){
    	    System.out.println("A is greater");
      }
      else if(b>a && b>c){
        	 System.out.println("B is greater");
      }
      else if(c>a && c>b){
    	      System.out.println("C is greater");
      }
      else
      {
    	  System.out.println("All are equal");
      }*/
		
		//switch//
		 
		Scanner S1=new Scanner (System.in);
		int a= S1.nextInt();
		int b= S1.nextInt();
		char choice;
		System.out.println("+,-");
		choice= S1.next().charAt(0);
		switch(choice) {
		case '+':
			int c=a+b;
			System.out.println("ADD"+c);
			break;
		case '-':
			int d=a-b;
			System.out.println("SUB"+d);
			break;
			default:
				System.out.println("Invalid choice");
				break;
				
				
			}
		
		
		
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
}
}
