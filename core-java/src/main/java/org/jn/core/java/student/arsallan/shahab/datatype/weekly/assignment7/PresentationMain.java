package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment7;

public class PresentationMain {

	public static void main(String[] args) {
		Stopwatch stopwatch = new Stopwatch();
		
		stopwatch.start();
		Presentation p = new Presentation();
		p.setBookedCompanyId(23);
		p.setBookedRoomId(12);
		p.setPresentationId(56);
		p.print();
		stopwatch.stop();
		stopwatch.printTime();
	}

}
