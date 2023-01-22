package org.jn.core.java.jawed.clss.inner;

import org.jn.core.java.jawed.clss.inner.InnerClassSimple.InnerClassSimpleInner;

public class InnerClassSimpleMain2 {

	public static void main(String[] args) {
		InnerClassSimpleInner icsi = new InnerClassSimple().new InnerClassSimpleInner();
		icsi.setName("hamid");
		System.out.println("innerclass name: " + icsi.getName()); 
	}
}
