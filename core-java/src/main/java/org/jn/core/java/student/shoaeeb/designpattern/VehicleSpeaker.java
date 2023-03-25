package org.jn.core.java.student.shoaeeb.designpattern;

public class VehicleSpeaker {

	public static Speaker getSpeaker(String speaker)
	{
		if(speaker.equals("Boat"))
		{
			return new BoatSpeakerImpl();
		}
		if(speaker.equals("Bose"))
		{
			return new BoseSpeakerImpl();
		}
		
		return null;
	}

}
