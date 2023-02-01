package org.jn.core.java.student.shoaeeb.generics;

public class FruitInterfaceMain implements FruitInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitInterfaceMain fi = new FruitInterfaceMain();
		fi.tellTaste("sweet");
	}

	@Override
	public void tellTaste(String taste) {
		// TODO Auto-generated method stub
		if(taste.equals("sweet"))
		{
			System.out.println("sweet taste");
		}
		else if(taste.equals("sour"))
		{
			System.out.println("sour taste");
		}
	}

}
