package org.jn.core.java.jawed.clss;

public class ConstructorOverloadingMain {

	public static void main(String[] args) {
		ConstructorOverloading o1 = new ConstructorOverloading();
		ConstructorOverloading o2 = new ConstructorOverloading(1);
		ConstructorOverloading o3 = new ConstructorOverloading("jawed");
		ConstructorOverloading o4 = new ConstructorOverloading(1, "alam");
		ConstructorOverloading o5 = new ConstructorOverloading("ameen", 3);
	}
}
