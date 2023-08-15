package com.mystream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Random;
public class StreamDemo {

	public static void main(String[] args) {
		//Generate function in String  
	IntStream stream=IntStream.generate(()->new Random().nextInt(10)).limit(10);
	stream.forEach(System.out::println);
	
	}

}
