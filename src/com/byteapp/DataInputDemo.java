package com.byteapp;
import java.io.*;
public class DataInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			DataOutputStream dout=new DataOutputStream(new FileOutputStream("mydata.txt"));
			dout.writeInt(232434);
			dout.writeBoolean(true);
			dout.writeChar('A');
			dout.writeFloat(23.45f);
			dout.flush();
			dout.close();
			DataInputStream din=new DataInputStream(new FileInputStream("mydata.txt"));
			int i=din.readInt();
			boolean b=din.readBoolean();
			char cstr=din.readChar();
			float f=din.readFloat();
			System.out.println(i);
			System.out.println(b);
			System.out.println(cstr);
			System.out.println(f);
		}
		catch(Exception e)
		{
			
		}
		
	}

}
