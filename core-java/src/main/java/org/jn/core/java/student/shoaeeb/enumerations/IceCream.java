package org.jn.core.java.student.shoaeeb.enumerations;

public enum IceCream {
	VANILLA(20.6),CHOCLATE(24.6),STRAWBERRY(34.0),RASBERRY(35);
	private double price;
	IceCream(double p)
	{
		price=p;
	}
	static void getPrice(int i) {
		IceCream allIceCreams[] = IceCream.values();
		
		System.out.println(allIceCreams[i]+" " +allIceCreams[i].price);
	}
	//end
}
