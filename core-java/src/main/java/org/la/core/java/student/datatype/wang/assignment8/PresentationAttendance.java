package org.la.core.java.student.datatype.wang.assignment8;

public class PresentationAttendance {
    /*
    5.	Create a class PresentationAttendance having member variables ticketId, presentationId, attendeeId. create getters and setters for all member variables. Create object of PresentationAttendance class in other class inside main method and set all member values and print all member values using getters.
     */
    private int ticketId, presentationId, attendeeId;



    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getPresentationId() {
        return presentationId;
    }

    public void setPresentationId(int presentationId) {
        this.presentationId = presentationId;
    }

    public int getAttendeeId() {
        return attendeeId;
    }

    public void setAttendeeId(int attendeeId) {
        this.attendeeId = attendeeId;
    }
}
