package org.jn.core.java.student.shoaeeb.absclss;

public class AttendeeAbsClassImplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AttendeeAbsClass abs = new AttendeeAbsClassImpl();
		abs.setAttendeeId(1);
		abs.setFirstName("john");
		abs.setLastName("drew");
		abs.setEmail("john@gmail.com");
		abs.setPhone(930554536);
		abs.setVip("Vip");
		
		System.out.println(abs.getAttendeeId()+ " "+abs.getFirstName()+ " "+abs.getLastName()+ " "+abs.getEmail()+ " "+abs.getPhone()+" "+abs.getVip());
		
	}

}
