package com.service;

import org.springframework.stereotype.Service;

import com.model.Employee;

import java.util.ArrayList;
import java.util.Iterator;
@Service
public class EmployeeService {
	
	  ArrayList<Employee> employeeList=new ArrayList();
	  
	  
	  
	  
	  public void addEmployee(Employee e)
	  {
		  employeeList.add(e);
	  }
	  
	  public ArrayList<Employee> getEmployeeList()
	  {
		  return employeeList;
	  }
	  
	  
	  public void updateEmployee(Employee e)
	  {
		  
		  
		     Iterator<Employee> iterator=employeeList.iterator();
		     
		     while(iterator.hasNext())
		     {
		    	Employee emp=iterator.next();
		    	if(emp.getEmployeeId()==e.getEmployeeId())
		    	{
		    		iterator.remove();
		    	}
		     }
		     
		     employeeList.add(e);
		  
	  }
	  
	  
	  public void deleteEmployee(int id)
	  {
		  
		  Iterator<Employee> iterator=employeeList.iterator();
		     
		     while(iterator.hasNext())
		     {
		    	Employee emp=iterator.next();
		    	if(emp.getEmployeeId()==id)
		    	{
		    		iterator.remove();
		    	}
		     }
		  
	  }
	 
	  public Employee getEmployee(int id)
	  {
		   return employeeList.get(id);
	  }

}
