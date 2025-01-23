    public  class WaitDemo implements Runnable
 { 

   public synchronized void run() 
 { 
    System.out.println("thread started");
    try{
wait();
 }
catch(InterruptedException e) 
 { 
System.out.println(e);
 }
System.out.println("thread ended");
 } 
   public synchronized void notifyThread()
  {
   this.notify();
 } 

public synchronized void notifyAllThread()
  {
   this.notifyAll();
 } 
  public static void main(String args[]) 
 { 
 WaitDemo obj=new WaitDemo();

 Thread t1=new Thread(obj);
Thread t2=new Thread(obj);
t2.start();
  t1.start();
  try{
  Thread.sleep(1000);
  }
 catch(Exception e) 
 { 
 }
   obj.notifyAllThread();

 } 
 } 