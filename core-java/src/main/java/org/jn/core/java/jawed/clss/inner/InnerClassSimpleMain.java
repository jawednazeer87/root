package org.jn.core.java.jawed.clss.inner;

import org.jn.core.java.jawed.clss.inner.InnerClassSimple.InnerClassSimpleInner;

public class InnerClassSimpleMain {

	public static void main(String[] args) {
		InnerClassSimple ics = new InnerClassSimple();
		ics.setId(122);
		InnerClassSimpleInner icsi = ics.new InnerClassSimpleInner();
		icsi.setName("hamid");
		System.out.println("innerclass name: " + icsi.getName()); 
	}
}
