package MyApplication.aopxmldemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class Tracker {
	public void myadvice(ProceedingJoinPoint p) throws Throwable
	{
		System.out.println("advice with point cut");
	    p.proceed();
	}

}
