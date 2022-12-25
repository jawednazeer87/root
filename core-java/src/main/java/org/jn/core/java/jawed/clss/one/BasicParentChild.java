package org.jn.core.java.jawed.clss.one;

import org.jn.core.java.jawed.clss.BasicParent;

/**
 * Different package child
 */

public class BasicParentChild extends BasicParent{
	
	public void callParentMethods() {
		publicMethod();
		protectedMethod();
//		defaultMethod(); default cannot be accessible from different package even from child
//		privateMethod(); private members cannot access
	}

}