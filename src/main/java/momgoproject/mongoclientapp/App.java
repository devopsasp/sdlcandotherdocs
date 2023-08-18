package momgoproject.mongoclientapp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        MongoApp obj=new MongoApp();
        //obj.createCollection();
        obj.getCollections();
        //obj.viewDocuments();
        obj.updateDocument();
        obj.viewDocuments();
      //  obj.addToCollection("Peter", "Sales");
        //obj.addToCollection("Sam","Training");
    }
}
