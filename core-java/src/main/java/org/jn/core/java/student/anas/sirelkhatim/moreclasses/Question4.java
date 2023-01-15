package org.jn.core.java.student.anas.sirelkhatim.moreclasses;

import java.time.LocalTime;

class Presentation 
{
    private String name = "asdasd";
    
    int presentationid;
    int bookedCompanyId;
    int bookedRoomId;
    LocalTime startTime  = LocalTime.now();
    LocalTime endTime = LocalTime.now();
    
    public Presentation(int presentationid, int bookedCompanyId, int bookedRoomId) {
        this.presentationid = presentationid;
        this.bookedCompanyId = bookedCompanyId;
        this.bookedRoomId = bookedRoomId;
    }

    public int getPresentationid() {
        return presentationid;
    }
    public void setPresentationid(int presentationid) {
        this.presentationid = presentationid;
    }
    public int getBookedCompanyId() {
        return bookedCompanyId;
    }
    public void setBookedCompanyId(int bookedCompanyId) {
        this.bookedCompanyId = bookedCompanyId;
    }
    public int getBookedRoomId() {
        return bookedRoomId;
    }
    public void setBookedRoomId(int bookedRoomId) {
        this.bookedRoomId = bookedRoomId;
    }
    public LocalTime getStartTime() {
        return startTime;
    }
    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }
    public LocalTime getEndTime() {
        return endTime;
    }
    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
    
    @Override
    public String toString() {
        return "Presentation [bookedCompanyId=" + bookedCompanyId + ", bookedRoomId=" + bookedRoomId + ", endTime="
                + endTime + ", name=" + name + ", presentationid=" + presentationid + ", startTime=" + startTime + "]";
    }
    
    
    
 
}

public class Question4 {

    public static void main(String[] args) {
        
        Presentation p1 = new Presentation(2131231,5345,123123);
        System.out.println(p1);
        

    }
}

