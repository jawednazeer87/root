package org.jn.core.java.jawed.clss;

import org.jn.core.java.jawed.clss.inner.InnerClassSimple;
//import org.jn.core.java.jawed.clss.inner.InnerClassSimple.InnerClassSimpleInner;

/*
 * InnerClassSimpleInner access specifier is default 
 * we cannot access this class from different package
 */
public class InnerClassSimpleMain {

	public static void main(String[] args) {
		InnerClassSimple ics = new InnerClassSimple();
		ics.setId(122);
//		InnerClassSimpleInner icsi = ics.new InnerClassSimpleInner();
//		icsi.setName("hamid");
//		System.out.println("innerclass name: " + icsi.getName()); 
	}
}
