package org.la.core.java.student.moshin.assignment8;

public class Attendee1main {
	
	public static void main(String[] args) {
		Attendee1 Attendence = new Attendee1();
		
		Attendence.setAttendeeId(15);
		Attendence.setFirstName("Ansari");
		Attendence.setLastName("mohammad moshin");
		Attendence.setPhonenumber("7896542211");
		Attendence.setEmailId("Ansari@gmail.com");
		Attendence.setVip("yes");
		
		System.out.println("Attendece ID: "+Attendence.getAttendeeId());
		System.out.println("Fisrst Name: "+Attendence.getFirstName());
		System.out.println("Last Name: "+Attendence.getLastName());	
		System.out.println("Phone Number: "+Attendence.getPhonenumber());
		System.out.println("Email: "+Attendence.getEmail());
		System.out.println("Vip: "+Attendence.getVip());		
	}
	
	
	
}
