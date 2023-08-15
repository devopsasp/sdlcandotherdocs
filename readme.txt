*******************************************************************************************************
Collector
********************************************************************************************************
A mutable reduction operation  ,that accumulates input elements into mutable result container 
The accumalated resulted can be transformed into a final presentation after all the results have been processed 
Reduction operation can be performed sequentially or parallely 

public interface java.util.stream.Collector<T, A, R> {
  public abstract java.util.function.Supplier<A> supplier();
  public abstract java.util.function.BiConsumer<A, T> accumulator();
  public abstract java.util.function.BinaryOperator<A> combiner();
  public abstract java.util.function.Function<A, R> finisher();
  public abstract java.util.Set<java.util.stream.Collector$Characteristics> characteristics();
  public static <T, R> java.util.stream.Collector<T, R, R> of(java.util.function.Supplier<R>, java.util.function.BiConsumer<R, T>, java.util.function.BinaryOperator<R>, java.util.stream.Collector$Characteristics...);
  public static <T, A, R> java.util.stream.Collector<T, A, R> of(java.util.function.Supplier<A>, java.util.function.BiConsumer<A, T>, java.util.function.BinaryOperator<A>, java.util.function.Function<A, R>, java.util.stream.Collector$Characteristics...);
}



The Stream interface has a collect function ,that takes a collector type of value 


 public abstract <R, A> R collect(java.util.stream.Collector<? super T, A, R>);
 
 
 A collector instance can be created manually or we can use Collectors interface to return a collector instance 
 
 
 Some of the functions of Collectors interface 
 toList
 toSet
 toCollection 
 joining
 mapping 
 counting
 minBy
 maxBy
 groupingBy
 
 
 
 
 Exercise for Collectors.toList ,toSet and joining  - 10 mins
 
 
 observe class below
 
 public class Customer 
  { 
      private String firstName;  
      private String lastName;
      private String emailId;
      private Location location;
      
   }
   
   public class Location 
    { 
     private String locationName;
     private String state;
     }  
 
 
 #Create the object of customer class  and store in list 
 #use stream to get the list of customer first ,lastname and location as list of seperate strings 
 
 
 
 
 
 mapping using collectors
 
 
 
 
 Exercise for Collector functions 
 
 
   Observe class below 
   
     public class Employee 
      { 
         private String firstName ;
         private String lastName;
         private Department department;
         private Designation designation ;
       } 
       
       
       public class Department 
        { 
          private String departmentName;
          private String location ;
         } 
         
         public class Designation 
          { 
            private String designation_type;
           } 
         
         
         
         #create instances of Employee and store in a list 
         
         #filter the list based on criteria where department="Sales" and designation="Manager"  and collect result into seperate list 
         #filter the list based on criterial where department location is Mumbai and collect result into seperate list 
         #display the with employee first and last name combined using a mapping operation and collect result in seperate list 
         
         
         
         
         
         
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 