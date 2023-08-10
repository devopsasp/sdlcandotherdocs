package com.charapp;
import java.io.*;
public class PrintWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		   try {
			    PrintWriter writer=new PrintWriter(new FileWriter("myprintwriter.txt"),true);
			    writer.write("Hello for print writer");
			    writer.close();
		   }
		   catch(IOException e)
		   {
			   System.out.println(e);
		   }
		
		
	}

}
