package org.jn.core.java.student.shoaeeb.absclss;

public class RoomAbsClassImpl extends RoomAbsClass {

	@Override
	public void setRoomId(int roomId) {
		// TODO Auto-generated method stub
		this.roomId=roomId;
	}

	@Override
	public void setFloorNum(int floorNum) {
		// TODO Auto-generated method stub
		this.floorNum=floorNum;
	}

	@Override
	public void setCapacity(int seatCapacity) {
		// TODO Auto-generated method stub
		this.seatCapacity=seatCapacity;
	}

	@Override
	public int getRoomId() {
		// TODO Auto-generated method stub
		return this.roomId;
	}

	@Override
	public int getFloorNum() {
		// TODO Auto-generated method stub
		return this.floorNum;
	}

	@Override
	public int getSeatCapacity() {
		// TODO Auto-generated method stub
		return this.seatCapacity;
	}

}
