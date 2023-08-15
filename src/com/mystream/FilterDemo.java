package com.mystream;
import java.util.stream.*;

public class FilterDemo {

	  public static void main(String args[])
	  {
		  Stream<Integer> stream=Stream.of(10,12,14,15,17,18,23,45,32,11,19);
		  
		  //stream.filter((e)->e>15).forEach(System.out::println);
		  //System.out.println(stream.findAny().get());
		  System.out.println(stream.findFirst().get());  
	  }
}
