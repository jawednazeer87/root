package org.la.core.java.student.datatype.wang.assignment8;

import java.time.LocalTime;

public class PresentationObject {
    public static void main(String[] args) {
        Presentation presentation = new Presentation();

        presentation.setPresentationId(1);
        presentation.setBookedCompanyId(1);
        presentation.setBookedRoomId(1);
        LocalTime startTime = LocalTime.of(8,00,00);
        presentation.setStartTime(startTime);
        LocalTime endTime = LocalTime.of(18,00,00);
        presentation.setEndTime(endTime);

        System.out.println("presentation.getPresentationId() = " + presentation.getPresentationId());
        System.out.println("presentation.getBookedCompanyId() = " + presentation.getBookedCompanyId());
        System.out.println("presentation.getBookedRoomId() = " + presentation.getBookedRoomId());
        System.out.println("presentation.getStartTime() = " + presentation.getStartTime());
        System.out.println("presentation.getEndTime() = " + presentation.getEndTime());

    }
}
