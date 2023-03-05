package org.jn.core.java.student.Anas.Sirelkhatim.moreclasses;


class Room
{
    private int roomid;
    private int floornum;
    private int seatcapacity;
    
    public Room(int roomid, int floornum, int seatcapacity) {
        this.roomid = roomid;
        this.floornum = floornum;
        this.seatcapacity = seatcapacity;
    }
    public int getRoomid() {
        return roomid;
    }
    public void setRoomid(int roomid) {
        this.roomid = roomid;
    }
    public int getFloornum() {
        return floornum;
    }
    public void setFloornum(int floornum) {
        this.floornum = floornum;
    }
    public int getSeatcapacity() {
        return seatcapacity;
    }
    public void setSeatcapacity(int seatcapacity) {
        this.seatcapacity = seatcapacity;
    }
    @Override
    public String toString() {
        return "Room [roomid=" + roomid + ", floornum=" + floornum + ", seatcapacity=" + seatcapacity + "]";
    }
    
    
    
    
}

public class Question3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Room r1 = new Room(123,12312,3123);
        System.out.println(r1);
        
        

    }

}
