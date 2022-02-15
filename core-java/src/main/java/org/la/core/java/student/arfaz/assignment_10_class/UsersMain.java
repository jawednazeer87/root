package org.la.core.java.student.arfaz.assignment_10_class;

public class UsersMain {

	public static void main(String[] args) {
		Users comp = new Users();
//	id, fullName, email, gender, dateOfBirth, countryCode, createdAt
		comp.setId(0);
		comp.setFullName("Arfaz Mohammad");
		comp.setEmail("arfaz@1234");
		comp.setGender("male");
		comp.setDateOfBirth("1997");
		comp.setCountryCode("526250");
		comp.setCreatedAt("Hyderabad");

		System.out.println(comp.getFullName());
		
		System.out.println(comp.getEmail());
		System.out.println(comp.getGender());
		System.out.println(comp.getEmail());
		System.out.println(comp.getDateOfBirth());
		System.out.println(comp.getCountryCode());
		System.out.println(comp.getCreatedAt());

	}
	

}
