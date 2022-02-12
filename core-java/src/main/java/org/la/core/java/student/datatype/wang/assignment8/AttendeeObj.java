package org.la.core.java.student.datatype.wang.assignment8;

public class AttendeeObj {
    public static void main(String[] args) {
        Attendee attendee = new Attendee();

        attendee.setAttendeeId(1);
        attendee.setFirstName("Ibrahim");
        attendee.setLastName("Wong");
        attendee.setPhone("62611153335");
        attendee.setEmail("1098437896@qq.com");
        attendee.setVip(true);

        System.out.println("attendee.getAttendeeId() = " + attendee.getAttendeeId());
        System.out.println("attendee.getFirstName() = " + attendee.getFirstName());
        System.out.println("attendee.getLastName() = " + attendee.getLastName());
        System.out.println("attendee.getPhone() = " + attendee.getPhone());
        System.out.println("attendee.getEmail() = " + attendee.getEmail());
        System.out.println("attendee.getVip() = " + attendee.getVip());
    }
}
