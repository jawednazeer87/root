package org.jn.core.java.student.shoaeeb.generics;

public class AnyFruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banana b = new Banana();
		AnyFruitInterface<Banana> afs = new AnyFruitInterface<>();
		afs.tellTaste(b);
	}

}
