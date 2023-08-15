package com.mystream;
import java.util.stream.*;
public class ConcatStream {

	
	  public static void main(String args[])
	  { 
		   Stream <Integer> stream1=Stream.of(11,13,15,17,19);
		   Stream<Integer> stream2=Stream.of(12,14,16,18,20);
		   Stream<Integer> stream3=Stream.concat(stream1, stream2);
		  // stream3.forEach(System.out::println);
 	    System.out.println(stream3.count());
	   }
}
