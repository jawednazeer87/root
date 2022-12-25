package org.jn.core.java.jawed.clss.one;

import org.jn.core.java.jawed.clss.BasicParentChild;

/**
 * Different package main accessing child object
 */

public class BasicParentChildMain {

	public static void main(String[] args) {
		BasicParentChild o1 = new BasicParentChild();
		o1.callParentMethods();
//		o1.protectedMethod();
	}
}