package org.la.core.java.student.wang.assignment8;

public class Room {
    /*
    3.	Create a class Room having member variables roomId, floorNum, seatCapacity. create getters and
		setters for all member variables. Create object of Room class in other class inside main method
		and set all member values and print all member values using getters.
     */
    private int roomId, floorNum, seatCapacity;

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

}
