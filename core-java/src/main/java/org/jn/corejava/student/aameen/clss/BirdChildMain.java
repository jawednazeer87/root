package org.jn.corejava.student.aameen.clss;

public class BirdChildMain {

	public static void main(String[] args) {
		InheritanceUtil iu = new InheritanceUtil();
		Bird bird = new Pigeon() ;
		iu.print(bird); 
		bird = (Bird) new Parrot();
		iu.print(bird);

	}

}
