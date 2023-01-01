package org.jn.core.java.student.shoaeeb.clss;

public class AttendeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Attendee attendee = new Attendee();
		attendee.setFirstName("Harry");
		attendee.setLastName("Stones");
		attendee.setPhone(5644892355L);
		attendee.setEmail("harry@gmail.com");
		
		
		//getters
		System.out.println("FirstName: "+attendee.getFirstName());
		System.out.println("LastName: "+attendee.getLastName());
		System.out.println("Phone: "+attendee.getPhone());
		System.out.println("Email: "+attendee.getEmail());

	}

}
