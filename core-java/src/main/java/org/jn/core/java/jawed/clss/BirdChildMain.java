package org.jn.core.java.jawed.clss;

public class BirdChildMain {

	public static void main(String[] args) {
		InheritanceUtil iu = new InheritanceUtil();
		Bird bird = new Parrot();
		iu.print(bird);
		bird = new Pigeon();
		iu.print(bird);
		bird = new Peacock();
		iu.print(bird);
	}
}
