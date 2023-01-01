package org.jn.core.java.student.Anas.Sirelkhatim.Classes;


class PresentationAttendance
{
    private int ticketid;
    private int presentationid;
    private int attendeeID;
    
    public int getTicketid() {
        return ticketid;
    }
    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }
    public int getPresentationid() {
        return presentationid;
    }
    public void setPresentationid(int presentationid) {
        this.presentationid = presentationid;
    }
    public int getAttendeeID() {
        return attendeeID;
    }
    public void setAttendeeID(int attendeeID) {
        this.attendeeID = attendeeID;
    }
    

}

public class Question_5 {
    
    

    public static void main(String[] args) {
        
        PresentationAttendance a1 = new PresentationAttendance();
        
        a1.setTicketid(0);
        a1.setPresentationid(0);
        a1.setAttendeeID(0);
        
  
        System.out.println(a1.getAttendeeID());
        System.out.println(a1.getPresentationid());
        System.out.println(a1.getTicketid());

    }

}
