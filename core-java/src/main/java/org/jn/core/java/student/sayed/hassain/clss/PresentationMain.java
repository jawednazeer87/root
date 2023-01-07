package org.jn.core.java.student.sayed.hassain.clss;

public class PresentationMain {

	public static void main(String[] args) {
		Presentation presentation = new Presentation();
		presentation.setterPresentationId(1000);
		System.out.println(presentation.getterPresentationId());

		presentation.setterBookedCompanyId(1001);
		System.out.println(presentation.getterBookedCompanyId());
		
		presentation.setterBookedRoomId(1002);
		System.out.println(presentation.getterBookedRoomId());
		
		presentation.setterStartTime(11);
		System.out.println(presentation.getterStartTime());
		
		presentation.setterEndTime(1);
		System.out.println(presentation.getterEndTime());
	}

}
