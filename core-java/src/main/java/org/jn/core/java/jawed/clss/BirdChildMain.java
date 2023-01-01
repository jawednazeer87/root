package org.jn.core.java.jawed.clss;

public class BirdChildMain {

	public static void main(String[] args) {
		Bird bird = new Parrot();
		InheritanceUtil.print(bird);
		bird = new Pigeon();
		InheritanceUtil.print(bird);
		Bird bird2 = new Peacock();
		InheritanceUtil.print(bird2);
		Bird bird3 = new Seagull();
		InheritanceUtil.print(bird3);
		InheritanceUtilSeagull ius = new InheritanceUtilSeagull();
		Seagull seagull = new Seagull();
		ius.print(seagull);
	}
}
