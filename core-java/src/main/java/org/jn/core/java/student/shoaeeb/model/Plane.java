package org.jn.core.java.student.shoaeeb.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Calendar;

public class Plane implements Serializable{
	int id;
	String name;
	Calendar bookDate;
	
	
	public void displayData() {
		int dd=bookDate.get(Calendar.DATE);
		int mm=bookDate.get(Calendar.MONTH);
		mm++;
		int yy=bookDate.get(Calendar.YEAR);
		
		
		
		System.out.println("Id: "+id+" name: "+ name + "Book Date: "+dd+"/"+mm+"/"+yy);
		
	}
	
	public void getData() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter id:");
		id=Integer.parseInt(br.readLine());
		System.out.println("Enter Name: ");
		name=br.readLine();
		System.out.println("Enter Booking Date:");
		System.out.println("Enter day");
		int dd=Integer.parseInt(br.readLine());
		System.out.println("Enter Month: ");
		int mm=Integer.parseInt(br.readLine());
		mm--;
		System.out.println("Enter Year: ");
		int yy=Integer.parseInt(br.readLine());
		
		bookDate = Calendar.getInstance();
		bookDate.set(yy,mm,dd);
	}
	
}
