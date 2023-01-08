package org.jn.core.java.student.sayed.hassain.clss;

public class UsersMain {
	
	public static void main(String[] args) {
		
		Users users=new Users();
		users.setterId(121);
		System.out.println(users.getterId());
		
		users.setterFullName("Abhay Raichand");
		System.out.println(users.getterFullName());
		
		users.setterGender("Male");
		System.out.println(users.getterGender());
		
		users.setterEmail("abhayraichand487@gmail.com");
		System.out.println(users.getterEmail());
		
		users.setterDateOfBirth("12th Jan 1997");
		System.out.println(users.getterDateOfBirth());
		
		users.setterCountryCode(91);
		System.out.println(users.getterCountryCode());
		
		users.setterCreatedAt("31st Jan 2022");
		System.out.println(users.getterCreatedAt());
	}

}
