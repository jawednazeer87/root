package org.la.core.java.student.meenah.abstra;

public class MainPerson {

	public static void main(String[] args) {
		
		Person p = new Student();
		p.setName("NASER");
		p.setId(10011);
		p.setEmail("naser@gmail.com");
		p.setWeight(63.5);
		
		System.out.println("name: " +p.getName());
		System.out.println("ID: " +p.getId());
		System.out.println("Email: " +p.getEmail());
		System.out.println("Weight: " +p.getWeight());

	}

}
