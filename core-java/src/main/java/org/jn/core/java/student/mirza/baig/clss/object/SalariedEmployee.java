package org.jn.core.java.student.mirza.baig.clss.object;

public class SalariedEmployee {

	
	private int id;
	private double annualSalary;
	private int  employeeId;
	
	
	public void setId(int id) {
		
		this.id=id;
	}
	public int getId(){
		
		return id;
		
		
	}
	public void setAnnualSalary (long annualSalary) {
		
		this.annualSalary=annualSalary;
	}
	public double getAnnualSalary() {
		return annualSalary;
		

	}
	public void setEmployeeId(int employeeId) {
		
		this.employeeId=employeeId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
}





//Create a class SalariedEmployee having member variables id, annualSalary, employeeId. 
//create getters and setters for all member variables. Create object of SalariedEmployee class in other 
//class inside main method and set all member values and print all member values using getters.