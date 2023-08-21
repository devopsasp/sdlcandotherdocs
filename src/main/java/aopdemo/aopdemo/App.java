package aopdemo.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
  
      context.scan("aopdemo.aopdemo");
      context.refresh();
   Messenger messenger=context.getBean(Messenger.class) ;
   messenger.printMessage("Hello User",new User("peter","peter123"));
   EmailMessenger emailer=context.getBean(EmailMessenger.class);
    try {
    emailer.sendMail("Hello User",new User("peter","peter123"));
    }
    catch(Exception e)
    { 
    	System.out.println(e);
    }
    }
}
