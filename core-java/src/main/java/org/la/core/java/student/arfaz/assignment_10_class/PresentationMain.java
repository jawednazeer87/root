package org.la.core.java.student.arfaz.assignment_10_class;

public class PresentationMain {

	public static void main(String[] args) {
		Presentation pob =  new Presentation();
		pob.setpresentationId(1);
		pob.setbookedCompanyId(1);
		pob.setbookedRoomId(1);
		pob.setstartTime("19:20");
		pob.setendTime("20:20");
		System.out.println(pob.getPresentationId());
		System.out.println(pob.getbookedCompanyId());
		System.out.println(pob.getbookedRoomId());
		System.out.println(pob.getstartTime());
		System.out.println(pob.getendTime());
	}

}
