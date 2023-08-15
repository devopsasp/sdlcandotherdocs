package com.mystream;

public class Device {
	
	private String name;
	private String technicianName;
	private int no_of_days_assigned;
	
	public int getNo_of_days_assigned() {
		return no_of_days_assigned;
	}
	public void setNo_of_days_assigned(int no_of_days_assigned) {
		this.no_of_days_assigned = no_of_days_assigned;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTechnicianName() {
		return technicianName;
	}
	public void setTechnicianName(String technicianName) {
		this.technicianName = technicianName;
	}
	
	 public Device()
	 {
		 
	 }
	public Device(String name, String technicianName, int no_of_days_assigned) {
		super();
		this.name = name;
		this.technicianName = technicianName;
		this.no_of_days_assigned = no_of_days_assigned;
	}
	@Override
	public String toString() {
		return "Device [name=" + name + ", technicianName=" + technicianName + ", no_of_days_assigned="
				+ no_of_days_assigned + "]";
	}
	
	
	 
	 

}
