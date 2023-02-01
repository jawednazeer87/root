package org.jn.core.java.student.shoaeeb.generics;

public class GenericInterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banana b = new Banana();
		GenericInterfaceImpl<Banana> obj = new GenericInterfaceImpl<>();
		obj.tellTaste(b);
	}

}
