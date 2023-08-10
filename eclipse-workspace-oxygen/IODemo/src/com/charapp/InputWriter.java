package com.charapp;
import java.io.*;
public class InputWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
   OutputStreamWriter writer=new OutputStreamWriter(new FileOutputStream("stream.txt"));
   writer.write("Hello from stream writer");
   writer.flush();
   writer.close();
   InputStreamReader reader=new InputStreamReader(new FileInputStream("stream.txt"));
   char [] cstr=new char[30];
   reader.read(cstr);
   System.out.println(cstr);
		 }
		 catch(IOException e)
		 {
			 
		 }
		
	}

}
