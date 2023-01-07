package org.jn.core.java.student.sayed.hassain.clss;

public class AttendeeMain {
	
	public static void main(String[] args) {
		Attendee attendee=new Attendee();
		attendee.setterAttendeeId(100);
		System.out.println(attendee.getterAttendeeId());
		
		attendee.setterFirstName("Rahul");
		System.out.println(attendee.getterFirstName());
		
		attendee.setterLastName("Verma");
		System.out.println(attendee.getterLastName());
		
		attendee.setterPhone(123456789);
		System.out.println(attendee.getterPhone());
		
		attendee.setterEmail("rahulverma786@gmail.com");
		System.out.println(attendee.getterEmail());
		
		attendee.setterVip("Yes");
		System.out.println(attendee.getterVip());
	}

}
