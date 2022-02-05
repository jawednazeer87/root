/**
 * 
 */
package org.la.core.java.jawed.model;

/**
 * @author jawednazeer
 *
 */
public class CheesePizza extends Pizza{
	@Override
	protected void test() {
		System.out.println("chees pizza");
	}
	//final method cannot be overriden
	/*
	protected final void doughCreation() {
		System.out.println("will not allow to override this method");
	}
	*/
}
