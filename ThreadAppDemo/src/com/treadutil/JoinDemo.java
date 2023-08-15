package com.treadutil;

class MyChildTRunner extends Thread 
{ 
	 public void run()
	 {
		 for(int i=0;i<10;i++)
		 {
			 System.out.println(i);
		 }
	 }
}
public class JoinDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyChildTRunner ch1=new MyChildTRunner();
		ch1.start();
		try {
			 Thread.currentThread().join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	

	}

}
