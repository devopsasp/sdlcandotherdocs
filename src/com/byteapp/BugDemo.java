package com.byteapp;
import java.io.*;
public class BugDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try { 
			
			InputStream in=System.in;
			byte bt[]=new byte[100];
			in.read(bt);
			String str=new String(bt);
			FileOutputStream fout=new FileOutputStream("bug.dat");
			fout.write(bt);
			fout.flush();
			fout.close();
			
			FileInputStream fin=new FileInputStream("bug.dat");
			byte[] bt1=new byte[fin.available()];
			fin.read(bt1);
			System.out.println(new String(bt1));
			
		}
		catch(Exception e)
		{
			
		}
		
	}

}
