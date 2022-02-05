package org.la.core.java.student.tanseer.assignment8.classes;

public class Corporate 
{
	private String name ;
	private int empNum;
	private int sal;
	
	public Corporate()
	{
		name = "New Joinee";
		empNum = 001;
		sal = 5000;
		System.out.println("Defalut Constructor");
		
	}
	
	public Corporate(String name, int empNum, int sal)
	{
		this.name = name;
		this.empNum = empNum;
		this.sal = sal;
		System.out.println("Contructor with arguments called");	
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setNumber(int empNum)
	{
		this.empNum = empNum;
	}
	public void setSalary(int sal)
	{
		this.sal = sal;
	}
	
	public void display()
	{
		System.out.println("Employee Name \t\t:\t"+ name);
		System.out.println("Employee Number \t: \t"+ empNum);
		System.out.println("Employee salary \t: \t"+ sal);
		System.out.println();
	}
}
