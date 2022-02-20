package org.la.core.java.jawed.abstrct;

public class ProtAbsClassMain {
	public static void main(String[] args) {
		ProtAbsClass pac = new ProtAbsClassChild();
		int s = pac.sum(2, 3);
		pac.display(s);
	}
}