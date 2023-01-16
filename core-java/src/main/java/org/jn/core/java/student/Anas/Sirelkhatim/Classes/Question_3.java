package org.jn.core.java.student.anas.sirelkhatim.classes;

class Room
{
    private String roomid;
    private int floornum;
    private int seatCapacity;
    
    public String getRoomid() {
        return roomid;
    }
    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }
    public int getFloornum() {
        return floornum;
    }
    public void setFloornum(int floornum) {
        this.floornum = floornum;
    }
    public int getSeatCapacity() {
        return seatCapacity;
    }
    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }
       
}

public class Question_3 {

    public static void main(String[] args) {
       
        Room r1 = new Room();
        r1.setFloornum(123124);
        r1.setRoomid("dqweqwe");
        r1.setSeatCapacity(23);
        
        System.out.println(r1.getFloornum());
        System.out.println(r1.getFloornum());
        System.out.println(r1.getFloornum());

    }

}
