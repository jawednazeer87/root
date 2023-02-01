package org.jn.core.java.student.shoaeeb.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Calendar;

public class Employee implements Serializable{
	public int id;
	public String name;
	public float sal;
	public Calendar doj;
	
	public void displayData() {
		int dd=doj.get(Calendar.DATE);
		int mm=doj.get(Calendar.MONTH);
		mm++;
		int yy=doj.get(Calendar.YEAR);
		
		System.out.println("Id: "+id+" Name: "+name+ "Salary: "+sal+ "Date of Joining: "+dd+"/"+mm+"/"+yy);
	}
	
	public void getData() throws IOException{
		System.out.println("Enter Id: ");
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		id=Integer.parseInt(br.readLine());
		System.out.println("Enter Name: ");
		name=br.readLine();
		System.out.println("Enter Salary: ");
		sal=Float.parseFloat(br.readLine());
		System.out.println("Enter Date of joining");
		
		System.out.println("Enter Day: ");

		int dd=Integer.parseInt(br.readLine());
		System.out.println("Enter Month");
		int mm= Integer.parseInt(br.readLine());
		mm--;
		System.out.println("Enter year");
		int yy=Integer.parseInt(br.readLine());	
		doj=Calendar.getInstance();
		doj.set(yy,mm,dd);
		}
}
