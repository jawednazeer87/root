package org.jn.core.java.student.shoaeeb.absclss;

public class PresentationAbsClassImplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PresentationAbsClass pr = new PresentationAbsClassImpl();
		pr.setPresentationId(1);
		pr.setBookedCompanyId(5);
		pr.setBookedRoomId(6);
		
		System.out.println("Presentation Id: "+pr.getPresentationId()+" Booked CompanyId: "+pr.getBookedCompanyId()+" Booked RoomId: "+pr.bookedRoomId);
	}

}
