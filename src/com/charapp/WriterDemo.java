package com.charapp;
import java.io.*;
public class WriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 try {
			 FileWriter writer=new FileWriter("textdata.txt");
			 BufferedWriter buff=new BufferedWriter(writer);
			 buff.write("Hello from FileWriter");
			 buff.flush();
			 buff.close();
		 }
		 catch(IOException e)
		 {
			 System.out.println(e);
		 }
		
		
	}

}
