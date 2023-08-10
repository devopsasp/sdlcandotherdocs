package com.byteapp;
import java.io.*;
public class PrintStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		
			 PrintStream pr=new PrintStream(new FileOutputStream("myprint.txt"),true);
			 pr.println("Hello from printstream");
			 pr.println("This is second line ");
			 pr.println("Thi is third line");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
