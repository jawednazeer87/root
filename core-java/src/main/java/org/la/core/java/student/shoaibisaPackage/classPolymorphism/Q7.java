package org.la.core.java.student.shoaibisaPackage.classPolymorphism;

class Person {
	private int id;
	private String email;
	private int weight;
	private String name;
	private int getId() {
		return id;
	}
	
	protected void setEmail(String mail) {
		email = mail;
	}
	
	public void setWeight(int w) {
		weight = w;
	}
	
	public void setName(String s) {
		name = s;
	}
	public String getName() {
		return name;
	}
}

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person();
		//p.getId();    visibility
		p.getName();
		p.setEmail("shoaib@mahi.com");

	}

}
