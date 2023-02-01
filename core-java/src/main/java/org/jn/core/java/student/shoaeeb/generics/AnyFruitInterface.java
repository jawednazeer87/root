package org.jn.core.java.student.shoaeeb.generics;

public class AnyFruitInterface<T> implements FruitInterface2<T>{

	@Override
	public void tellTaste(T fruit) {
		// TODO Auto-generated method stub
		String fruitName = fruit.getClass().getName();
		if(fruitName.equals("Banana"))
		{
			System.out.println("Sweet in taste");
		}
		else if(fruitName.equals("Orange"))
		{
			System.out.println("Sour in taste");
		}
	}
 
}
