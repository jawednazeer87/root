package org.jn.core.java.student.shoaeeb.designpattern;

public class VehicleTyre {

	public static Tyre getTyre(String tyre)
	{
		if(tyre.equals("Michelen"))
		{
			return new MichelenTyre();
		}
		if(tyre.equals("BridgeStone"))
		{
			return new BridgeStoneTyre();
		}
		return null;
	}
	
}
