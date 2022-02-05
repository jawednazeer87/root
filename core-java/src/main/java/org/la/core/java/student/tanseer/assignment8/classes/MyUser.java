package org.la.core.java.student.tanseer.assignment8.classes;

public class MyUser 
{
	private int num;
	private String name;
	private String gender;
	
	public void setNum(int num)
	{
		this.num = num;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
//	public int getNum()
//	{
//		return num;
//	}
//	public String getName()
//	{
//		return name;
//	}
//	public String getGender()
//	{
//		return gender;
//	}
	
	public void printData()
	{
		System.out.println("User Number \t: "+ num);
		System.out.println("User Name \t: "+name);
		System.out.println("Gender \t\t: "+gender);
		System.out.println();
	}
}
