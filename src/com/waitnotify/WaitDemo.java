package com.waitnotify;

class Ball 
{ 
	
}

class CatchBall implements Runnable
{
	
	Ball ball;
	String name;
	public CatchBall(Ball ball,String name)
	{ 
		this.ball=ball;
		this.name=name;
	}
	public void run() 
	{ 
		synchronized(ball)
		{
			 try
			 { 
				 System.out.println("ball is with "+this.name);
				 ball.wait();
				 System.out.println("ball is released by "+this.name);
			 }
			 catch(InterruptedException e)
			 {
				 System.out.println(e);
			 }
		}
	}
}

class ThrowBall implements Runnable
{ 
	Ball ball;
	ThrowBall(Ball ball)
	{ 
		this.ball=ball;
	}
	public void run()
	{
		synchronized(ball)
		{
			try {
				Thread.sleep(2000);
				 ball.notify();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
public class WaitDemo 
{ 
	 public static void main(String args[])
	 {
		 Ball ball1=new Ball();
		 CatchBall catch1=new CatchBall(ball1,"Peter");
		 ThrowBall throw1=new ThrowBall(ball1);
		 Thread t1=new Thread(catch1);
		 Thread t2=new Thread(throw1);
		 t1.start();
		 t2.start();
		 
	 }
}





















