package org.la.core.java.student.tanseer.assignment8.classes;

public class AttendeeMain 
{
	public static void main(String[] args) 
	{
		Attendee attendee = new Attendee();
		attendee.setAttendeeId(120);
		attendee.setFirstName("Ali");
		attendee.setLastName("Azgar");
		attendee.setPhone(12345678);
		attendee.setEmail("aliazgar@ymail.com");
		attendee.setVip(false);
		
		System.out.println("attendeeId\t:  "+attendee.getAttendeeId());
		System.out.println("firstName\t:  "+attendee.getFirstName());
		System.out.println("lastName\t:  "+attendee.getLastName());
		System.out.println("phone\t\t:  "+attendee.getPhone());
		System.out.println("email\t\t:  "+attendee.getEmail());
		System.out.println("vip\t\t:  "+attendee.isVip());
	}
}
