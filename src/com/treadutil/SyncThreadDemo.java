package com.treadutil;

class TRunner implements Runnable
{
	  int i=0;
	   public void run()
	  { 
		   System.out.println(Thread.currentThread().getName());
	
		    synchronized(this)
		    {
		  
	
		  {
		   for(i=0;i<10;i++)
		   { 
			  
			   System.out.println(i);
			    try {
			    	Thread.sleep(2000);
			    }
			    catch(InterruptedException e)
			    {
			    	 System.out.println(e);
			    }
		   
		   
		   
		  }
		  }
	  }}
	
	
}
public class SyncThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TRunner tRunner=new TRunner();
		Thread t1=new Thread(tRunner);
		Thread t2=new Thread(tRunner);
		t1.start();
		t2.start();
		
	}

}
