package org.jn.core.java.student.shoaeeb.designpattern;


public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String speaker = "Boat";
		Speaker s = VehicleSpeaker.getSpeaker(speaker);
		String tyre = "BridgeStone";
		Tyre t = VehicleTyre.getTyre(tyre);
		s.makeSound();
		t.rotate();
		
	}

}
