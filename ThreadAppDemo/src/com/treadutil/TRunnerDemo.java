package com.treadutil;
import java.util.Scanner;
class UserDetails extends Thread 
{
   
	   public void acceptDetails() { 
		    Scanner sc=new Scanner(System.in);
		    	String customername=sc.nextLine();
		    String emailid=sc.nextLine();
	   }
	   public void run()
	   {
		   acceptDetails();
	   }
}
class SimpleIntrest extends Thread 
{ 
  public void calculateIntrest() 
  { 
   System.out.println(12000*3*4/100);
   
  }
  public void run()
  {
	  calculateIntrest();
	  
  }
}
public class TRunnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  UserDetails t1=new UserDetails();
  SimpleIntrest t2=new SimpleIntrest();
  t1.start();
  t2.start();
	}

}
