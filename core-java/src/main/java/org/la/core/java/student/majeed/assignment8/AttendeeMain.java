package org.la.core.java.student.majeed.assignment8;

/*
	4.	Create a class Attendee having member variables attendeeId, firstName, lastName, phone, email, vip. 
	create getters and setters for all member variables. Create object of Attendee class in other 
	class inside main method and set all member values and print all member values using getters.
 */

public class AttendeeMain {
	
	public static void main(String[] args) {
		Attendee attendee = new Attendee();
		
		attendee.setAttendeeId(501);
		attendee.setFirstName("Mohammed");
		attendee.setLastName("Abdullah");
		attendee.setPhone("321456987");
		attendee.setEmail("mohammed@gmail.com");
		attendee.setVip(true);
		
		System.out.println("attendeeId : "+attendee.getAttendeeId());
		System.out.println("firstName : "+attendee.getFirstName());
		System.out.println("lastName : "+attendee.getLastName());
		System.out.println("phone : "+attendee.getPhone());
		System.out.println("email : "+attendee.getEmail());
		System.out.println("vip : "+attendee.isVip());
		
	}
	
}
