package org.jn.core.java.student.shoaeeb.generics;

public class GenericInterfaceImpl<T> implements GenericInterface{

	@Override
	public <T> void tellTaste(T fruit) {
		// TODO Auto-generated method stub
			String className = fruit.getClass().getName();
			if(className.equals("Banana"))
			{
				System.out.println("Bananas are sweet");
			}
			else if(className.equals("Orangge")) {
				System.out.println("Oranges are sour");
			}
	}

}
