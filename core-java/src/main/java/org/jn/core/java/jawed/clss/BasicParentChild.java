package org.jn.core.java.jawed.clss;

/**
 * Same package child
 */
public class BasicParentChild extends BasicParent{
	
	public void callParentMethods() {
		publicMethod();
		defaultMethod();
		protectedMethod();
//		privateMethod(); private members cannot access
	}

}
