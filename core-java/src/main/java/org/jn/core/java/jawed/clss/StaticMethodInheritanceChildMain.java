package org.jn.core.java.jawed.clss;

public class StaticMethodInheritanceChildMain {

	public static void main(String[] args) {
		
		// Parent reference variable pointing to child object
		StaticMethodInheritance parent = new StaticMethodInheritanceChild();
		parent.staticMethod();
		parent.instanceMethod();
		
		// Child reference variable pointing to child(itself) object
		StaticMethodInheritanceChild child = new StaticMethodInheritanceChild();
		child.staticMethod();
		child.instanceMethod();
	}
}
