package org.la.core.java.student.wang.assignment8;

public class PresentationAttendanceObj {
    public static void main(String[] args) {
        PresentationAttendance presentationAttendance = new PresentationAttendance();

        presentationAttendance.setTicketId(1);
        presentationAttendance.setPresentationId(1);
        presentationAttendance.setAttendeeId(1);

        System.out.println("presentationAttendance.getTicketId() = " + presentationAttendance.getTicketId());
        System.out.println("presentationAttendance.getPresentationId() = " + presentationAttendance.getPresentationId());
        System.out.println("presentationAttendance.getAttendeeId() = " + presentationAttendance.getAttendeeId());
    }
}
