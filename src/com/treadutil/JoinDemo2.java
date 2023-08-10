package com.treadutil;


class MyTRunner implements Runnable 
{
	Thread t;
	public MyTRunner()
	{
	t=new Thread(this);
	t.start();
	}
	public void run()
	{
      		 System.out.println(this.getThreadStatus());
	}
	public String getThreadStatus()
	{
		return "Thread status : " +t.isAlive()  ;
	}
	
}


public class JoinDemo2 {

	public static void main(String[] args) {
	
		MyTRunner obj=new MyTRunner();
	   try {
		Thread.currentThread().sleep(2000);
	    }
	    catch(Exception e)
	    {
	    	
	    }
	   
	    System.out.println(obj.getThreadStatus());
 
       
 
	}

}
