/**
 * 
 */
package org.la.core.java.jawed.clss;

import java.time.LocalDate;

/**
 * @author jawednazeer
 *
 */
public class Employee {

	int id;
	int salary;
	String name;
	LocalDate dob;
	
	public void setters(int i, int sal, String n, LocalDate d) {
		id = i;
		salary = sal;
		name = n;
		dob = d;
	}
	public void print() {
		System.out.println("id: "+id);
		System.out.println("salary: "+salary);
		System.out.println("name: "+name);
		System.out.println("dob: "+dob);
	}
	public int getId() {
		return id;
	}
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setId(int i) {
		id = i;
	}
	public void setSalary(int sal) {
		salary = sal;
	}
	public void setName(String n) {
		name = n;
	}
	public void setDob(LocalDate d) {
		dob = d;
	}
	@Override
	public String toString() {
		return "{id: " + id + ", salary: " + salary + ", name: " + name + ", dob: " + dob + "}";
	}
}
