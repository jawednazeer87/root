package org.jn.core.java.student.anas.sirelkhatim.classes;


class Presentation
{
    private int presentationId;
    private String bookedCompanyId;
    private String bookedRoomId;
    private int startTime;
    private int endTime;
    
    public int getPresentationId() {
        return presentationId;
    }
    public void setPresentationId(int presentationId) {
        this.presentationId = presentationId;
    }
    public String getBookedCompanyId() {
        return bookedCompanyId;
    }
    public void setBookedCompanyId(String bookedCompanyId) {
        this.bookedCompanyId = bookedCompanyId;
    }
    public String getBookedRoomId() {
        return bookedRoomId;
    }
    public void setBookedRoomId(String bookedRoomId) {
        this.bookedRoomId = bookedRoomId;
    }
    public int getStartTime() {
        return startTime;
    }
    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }
    public int getEndTime() {
        return endTime;
    }
    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
}

public class Question_2 

{

    public static void main(String[] args) {
        
        Presentation p1 = new Presentation();
        
        p1.setBookedCompanyId("4234532");
        p1.setBookedRoomId("12387123");
        p1.setPresentationId(39574385);
        p1.setStartTime(430);
        p1.setEndTime(630);
        
        System.out.println(p1.getPresentationId());
        System.out.println(p1.getBookedCompanyId());
        System.out.println(p1.getBookedRoomId());
        System.out.println(p1.getStartTime());
        System.out.println(p1.getEndTime());
        
    }

}
