package MyApplication.aopxmldemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("springbean.xml");
        Customer c=context.getBean(Customer.class);
        c.printCustomerDetails();
    }
}
