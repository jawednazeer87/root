package org.la.core.java.student.datatype.Sahil;

public class I7Member1 {

	public int id;
	public String name;
	protected String email;
	public double weight;
	
	public void  Getid () {
	this.id= 10;
		
	}
 public void getname() {
	 
	this.name="MD";
	System.out.println(name);
	 
 }	 
	protected void setemail() {
		
	this.email="SAHIL@45.com";	
		
	}
	public void setweight() {
	this.weight=456;
		
	} 
 public void print() {
	 System.out.println("Id  "+this.id   +"Name  " +    this.name+ "email  "+   this.email+ "   weight  "+   this.weight);
	 
	 
 } 
}
