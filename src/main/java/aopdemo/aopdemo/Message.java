package aopdemo.aopdemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Message {

	    @Pointcut("execution(public * Messenger.*(..)) && args(username)")
	   public void mypointcut(String username) {}
	    
	    @Around("mypointcut(username)")
	    public void mybeforemethod(ProceedingJoinPoint jp,String username) throws Throwable
	    {
	    	System.out.println("before my point cut"+username);
	    	jp.proceed();
	    	System.out.println("after my point cut"+username);
	    
	    }
}
