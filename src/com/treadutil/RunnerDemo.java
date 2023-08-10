package com.treadutil;


class MyRunner implements Runnable
{
	int i=0;
	public void run()
	{
	  Thread th=Thread.currentThread();
	  
	  for(i=0;i<10;i++)
	  {
		  System.out.println(i);
		  try {
			  System.out.println(th.getName()+" is running");
			    Thread.sleep(1000);
		  }
		  catch(Exception e)
		  {
			  
		  }
	  }
	}
}

public class RunnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyRunner myRunner=new MyRunner();
		
		Thread th1=new Thread(myRunner);
		Thread th2=new Thread(myRunner);
		th1.setName("Child Thread 1");
		th2.setName("Child Thread 2");
		th1.start();
		th2.start();
		
		
		
	}

}
