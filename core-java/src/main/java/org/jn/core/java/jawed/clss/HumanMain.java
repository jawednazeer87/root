package org.jn.core.java.jawed.clss;

public class HumanMain {

	public static void main(String[] args) {
		Human human = new Human();
		human.age = -10;		//not allowed in real time scenario
		System.out.println("age: "+human.get());
		
		Human human2 = new Human();
		human2.set(-100);
		System.out.println("age: "+human2.get());
	}
}
