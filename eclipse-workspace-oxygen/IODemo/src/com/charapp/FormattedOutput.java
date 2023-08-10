package com.charapp;
import java.io.*;
public class FormattedOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   try {
			   PrintStream out=new PrintStream(new FileOutputStream("formatted.txt"));
			   
			   out.format("Hello %s ,welcome to %s ,you will require %d weeks to complete this training", "Peter","Programming in Java",2);
			   out.format("You have to score around %.2f",70.5f);
			   out.flush();
			   
			
		   }
		   catch(Exception e)
		   {
			System.out.println(e);   
		   }
	}

}