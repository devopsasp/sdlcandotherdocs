package itemproject.itemapplication;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
import com.AppConfig;
import com.Item;
import com.book.Book;
import com.book.BookDAOService;

import personcomp.Person;
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
         ctx.scan("com.book");
         ctx.refresh();
         
         BookDAOService bookDAOService=ctx.getBean(BookDAOService.class);
         bookDAOService.add(new Book("Peter Pan",200));
         bookDAOService.update(new Book("Peter Pan",300));
        
        /*ctx.scan("personcomp");
       ctx.refresh();
       Person p=ctx.getBean(Person.class);
       System.out.println(p);
        /* ctx.register(AppConfig.class);
        ctx.refresh();
        Item item=ctx.getBean(Item.class);
        System.out.println(item);
        */
    }
}
