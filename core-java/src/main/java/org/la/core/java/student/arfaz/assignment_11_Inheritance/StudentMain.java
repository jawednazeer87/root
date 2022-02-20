package org.la.core.java.student.arfaz.assignment_11_Inheritance;

/*	Create a class having 4 member fields 
		private int id;
		public String name;
		protected String email;
		double weight;
		create a class having main method and create the object of above class and set values to member fields and print
		member fields.
	
*/
public class StudentMain {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(2);
		s.setName("Arfaz");
		s.setEmail("arfaz3838@gmail.com");
		s.setWeight(59.0);
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getEmail());
		System.out.println(s.getWeight());
	}	
}
