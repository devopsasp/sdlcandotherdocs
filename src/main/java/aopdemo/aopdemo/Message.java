package aopdemo.aopdemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Message {

	    @Pointcut("execution(public * *(..)) && args(message,user)")
	   public void mypointcut(String message,User user) {}
	    
	    @Around("mypointcut(message ,user)")
	    public void mybeforemethod(ProceedingJoinPoint jp,String message,User user) throws Throwable
	    {
	    	System.out.println("Message being sent for "+user.getUserName());
	    	if(user.getUserName().equals("peter") && user.getPassword().equals("peter123"))
	    	jp.proceed();
	    	else
	    	System.out.println("invalid authentication");
	    
	    }
	    
	   /* @Before("mypointcut()")
	    public void printLogs(JoinPoint point)
	    {
	    	  System.out.println("execution started for method");
	    	  System.out.println(point);
	    }
	    
	   /* @AfterReturning(pointcut="mypointcut()",returning="result")
	    public void beforeMethod(JoinPoint pt,Object result)
	    { 
	    	System.out.println("after method");
	    	System.out.println(pt);
	    	System.out.println(result);
	    }*/
	    
	    
}
