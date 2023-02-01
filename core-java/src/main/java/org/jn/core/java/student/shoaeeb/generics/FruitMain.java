package org.jn.core.java.student.shoaeeb.generics;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banana b = new Banana();
		AnyFruit<Banana> obj  = new AnyFruit<>();
		obj.tellTaste(obj);
	}

}
