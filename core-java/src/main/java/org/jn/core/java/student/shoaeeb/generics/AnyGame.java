package org.jn.core.java.student.shoaeeb.generics;

public class AnyGame<T> implements Game<T> {

	@Override
	public void getName(T game) {
		// TODO Auto-generated method stub
		String gameName = game.getClass().getName().substring(42);
		if(gameName.equals("Football"))
		{
			System.out.println("Football game");
		}
		else if(gameName.equals("Cricket")){
			System.out.println("Cricket game");
		}
	}
	
	public static void main(String args[])
	{
		Football fb = new Football();
		AnyGame<Football> ag=  new AnyGame<>();
		ag.getName(fb);
	}
	 
}
