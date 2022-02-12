package org.la.core.java.student.majeed.assignment8;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
12.	Create a class Users having member variables id, fullName, email, gender, dateOfBirth, countryCode, createdAt. 
create getters and setters for all member variables. Create object of Users class in other 
class inside main method and set all member values and print all member values using getters.
 */

public class UsersMain {
	
	public static void main(String[] args) throws ParseException {
		Users users = new Users();
		
		users.setId(5545);
		users.setFullName("Mohammed Abdul Majeed");
		users.setEmail("majeed@gmail.com");
		users.setGender("Male");
		String dob="21/12/1990";  
		users.setDateOfBirth(new SimpleDateFormat("dd/MM/yyyy").parse(dob));
		users.setCountryCode("IND");
		users.setCreatedAt("INDIA");
		
		System.out.println(users.getId());
		System.out.println(users.getFullName());
		System.out.println(users.getEmail());
		System.out.println(users.getGender());
		System.out.println(users.getDateOfBirth());
		System.out.println(users.getCountryCode());
		System.out.println(users.getCreatedAt());
	}		
}
