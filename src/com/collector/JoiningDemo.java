package com.collector;
import java.util.*;
import java.util.stream.*;
public class JoiningDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr= {"BSC","Modem","Connector","TelePrinter","Terminal"};
		String mystring=Stream.of(arr).map((e)->e.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(mystring);
		
	}

}
