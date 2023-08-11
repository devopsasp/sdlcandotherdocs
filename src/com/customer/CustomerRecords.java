package com.customer;
import java.io.*;
public class CustomerRecords {

	public void saveCustomer(Customer customer)
	{
		 try {
		FileOutputStream fileout=new FileOutputStream(customer.getCustomerName()+".dat");
		 ObjectOutputStream objectout=new ObjectOutputStream(fileout);
		 objectout.writeObject(customer);
		 objectout.flush();
		 objectout.close();
		 }
		 catch(FileNotFoundException e)
		 {
			 System.out.println(e);
		 }
		 catch(IOException e1)
		 {
			 System.out.println(e1);
		 }
	}
	public void displayCustomer(String name)
	{
		
		try {
			FileInputStream filein =new FileInputStream(name+".dat");
			ObjectInputStream objectin=new ObjectInputStream(filein);
			Customer customer =(Customer)objectin.readObject();
			
			System.out.println("Customer Name "+customer.getCustomerName());
			System.out.println("Customer Address "+customer.getAddress());
		}
		catch(FileNotFoundException e1)
		{
			System.out.println(e1);
		}
		catch(IOException e2)
		{
			System.out.println(e2);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Customer obj1=new Customer("Peter","23 old baker street");

CustomerRecords records=new CustomerRecords();

records.saveCustomer(obj1);
records.displayCustomer(obj1.getCustomerName());



	}

}
