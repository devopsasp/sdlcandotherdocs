package com.byteapp;
import java.io.*;
public class WriteToConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		OutputStream pout=System.out;
		pout.write("Hello World".getBytes());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
