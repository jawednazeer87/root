package org.la.core.java.student.wang.assignment8;

public class RoomObj {
    public static void main(String[] args) {
        Room room = new Room();
        room.setRoomId(1);
        room.setFloorNum(2);
        room.setSeatCapacity(10);

        System.out.println("room.getRoomId() = " + room.getRoomId());
        System.out.println("room.getFloorNum() = " + room.getFloorNum());
        System.out.println("room.getSeatCapacity() = " + room.getSeatCapacity());
    }
}
