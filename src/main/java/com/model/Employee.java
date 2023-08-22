package com.model;

public class Employee {
	private int employeeId;
	private String firsName;
	private String lastName;
	private String department;
	private String designatio;
	private float salary;
	public Employee(int employeeId, String firsName, String lastName, String department, String designatio,
			float salary) {
		super();
		this.employeeId = employeeId;
		this.firsName = firsName;
		this.lastName = lastName;
		this.department = department;
		this.designatio = designatio;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirsName() {
		return firsName;
	}
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignatio() {
		return designatio;
	}
	public void setDesignatio(String designatio) {
		this.designatio = designatio;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firsName=" + firsName + ", lastName=" + lastName
				+ ", department=" + department + ", designatio=" + designatio + ", salary=" + salary + "]";
	}
	

}
