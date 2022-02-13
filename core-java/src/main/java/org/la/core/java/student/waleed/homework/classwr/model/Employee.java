package org.la.core.java.student.waleed.homework.classwr.model;

import java.time.LocalDate;


/**
 * @author Waleed Rizq
 *
 * @date Feb 4, 2022
 */
public class Employee {
	
	private String name;
	private int ssn;
	private LocalDate bDate;
	private String address;
	private char gender;
	private double salary;
	private Works works;
	
	public Employee() {
		System.out.println("Please for more information contact the Human Resource Department");
		
		
		
	}

public Employee(String name, int ssn, LocalDate bDate,String address, char gender, double salary, Works works) {
		
		System.out.println("Please for more information contact the Human Resource Department");
		
		 this.name= name;
	      this.ssn= ssn ;
	      this.bDate= bDate;
		  this.address= address;
		  this.gender= gender ;
		  this.salary=salary;
		  this.works = works;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public LocalDate getBDate() {
		return bDate;
	}

	public void setBDate(LocalDate bDate) {
		this.bDate = bDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Works getWorks() {
		return works;
	}

	public void setWorks(Works works) {
		this.works = works;
	}

	
public void print() {
	System.out.println(" Name  : "+name);
	System.out.println("  SSN : "+ssn);
	System.out.println(" BDate : "+bDate);
	System.out.println(" Address  : "+address);
	System.out.println("  Gender : "+gender);
	System.out.println(" Salary  : "+salary);
	System.out.println();
	works.print();
}
	
	
}
