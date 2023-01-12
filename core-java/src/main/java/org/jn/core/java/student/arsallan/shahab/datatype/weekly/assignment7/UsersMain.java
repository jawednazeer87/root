package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment7;

public class UsersMain {

	public static void main(String[] args) {
		
		Users u = new Users();
		
		u.setCountryCode(123);
		u.setCreatedAt("02-02-0002");
		u.setDateOfBirth("03-03-0003");
		u.setEmail("alphabeta@gmail.com");
		u.setFullName("anonymous");
		u.setGender("Male");
		u.setId(321);
		
		System.out.println("Users [id=" + u.getId() + ", countryCode=" + u.getCountryCode() + ", fullName=" + u.getFullName() + ", email=" + u.getEmail()
				+ ", gender=" + u.getGender() + ", dateOfBirth=" + u.getDateOfBirth() + ", createdAt=" + u.getCreatedAt() + "]");
	}

}
