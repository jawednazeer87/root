package org.jn.core.java.student.shoaeeb.generics;

public class AnyFruit<T> implements Fruit<T>{

	@Override
	public <T> void tellTaste(T fruit) {
		// TODO Auto-generated method stub
		String className = fruit.getClass().getName();
		System.out.println(className);
		if(className.equals("Banana"))
		{
			System.out.println("Bananas are sweet");
		}
		else if(className.equals("Orange"))
		{
			System.out.println("Oranges are sweet");
		}
	}

	
}
