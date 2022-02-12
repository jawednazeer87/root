package org.la.core.java.student.datatype.wang.assignment8;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Presentation {
    /*
    2.	Create a class Presentation having member variables presentationId, bookedCompanyId, bookedRoomId,
    startTime, endTime. Create getters and setters for all member variables.
    Create object of Presentation class in other class inside main method and set all member values and
    print all member values using getters.
     */

    private int presentationId, bookedCompanyId, bookedRoomId;
    private LocalTime startTime, endTime;

    public int getPresentationId() {
        return presentationId;
    }

    public void setPresentationId(int presentationId) {
        this.presentationId = presentationId;
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

}
