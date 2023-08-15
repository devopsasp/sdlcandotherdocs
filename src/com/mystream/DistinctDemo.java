package com.mystream;
import java.util.stream.*;
public class DistinctDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Stream stream=Stream.of("BSC","Terminal","TelePrinter","Connector","Terminal","Modem","BSC");
		   
		   stream.distinct().forEach(System.out::println);
		
	}

}
