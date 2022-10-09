package org.jn.core.java.jawed.model;

public class Pizza {

	protected void test() {
		System.out.println("original pizza");
	}
	protected final void doughCreation() {
		System.out.println("will not allow to override this method");
	}
}