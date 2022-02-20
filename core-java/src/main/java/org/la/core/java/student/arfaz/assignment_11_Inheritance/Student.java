package org.la.core.java.student.arfaz.assignment_11_Inheritance;

/*	Create a class having 4 member fields 
		private int id;
		public String name;
		protected String email;
		double weight;
		create a class having main method and create the object of above class and set values to member fields and print
		member fields.
	
*/
public class Student {
	private int id;
	public String name;
	protected String email;
	double weight;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
