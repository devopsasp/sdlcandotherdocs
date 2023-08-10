package com.byteapp;
import java.io.*;
public class ReadFromConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		InputStream in=System.in;
		try {
			byte[] bt=new byte[20];
			in.read(bt);
			String str=new String(bt);
			System.out.println("You have written "+str);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
