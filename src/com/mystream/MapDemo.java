package com.mystream;
import java.util.stream.*;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Stream<Integer>stream=Stream.of(10,11,15,23,11,19,25,53,22);
   
   stream.map((e)->e*e).forEach(System.out::println);
		
	}

}
