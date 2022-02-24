package org.la.core.java.student.moshin.assignment9;

public class MainMembers {

	public static void main(String[] args) {
		
		Members m = new Members();
		m.setName("Ahmed");
		m.setId(101010);
		m.setEmail("ahmed.10@gmail.com");
		m.setWeight(62.3);
		
		String name = m.getName();
		int id = m.getId();
		String email = m.getEmail();
		double weight = m.getWeight();
		
		System.out.println("name is: " +name + " -id: " +id + " -email: " +email + " -weight: " +weight);

	}

}
