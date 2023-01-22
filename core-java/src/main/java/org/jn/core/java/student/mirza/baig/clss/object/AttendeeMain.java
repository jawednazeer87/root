package org.jn.core.java.student.mirza.baig.clss.object;

public class AttendeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Attendee at= new Attendee();
		at.setAttendeeId(102);
		at.setFirstName("mirza");
		at.setLastName("baig");
		at.setVip("vip");
		at.setPhone(7020945913L);
		at.setEmail("mirzamohsin792@gmail.com");
		
		
		System.out.println("Attendee id "+at.getAttendeeId());
		System.out.println("First name   "+at.getFirstName());
		System.out.println("last name    "+at.getLastName());
		System.out.println("vip  "+at.getVip());
		System.out.println("Phone Nmber   "+at.getPhone());
		System.out.println("Email id      "+at.getEmail());
		

		
		
		
		
		
	}

}
