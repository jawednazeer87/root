package org.la.core.java.jawed.abstrct;

/**
 * @author jawednazeer
 *
 */
public abstract class ProtAbsClass {
	protected int id;
	protected abstract int sum(int i, int j);
	protected void display(int i) {
		System.out.println("sum: "+i);
	}
}
