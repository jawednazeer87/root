package org.jn.core.java.jawed.clss;

import org.jn.core.java.jawed.clss.inner.PubInnerClassExample;
import org.jn.core.java.jawed.clss.inner.PubInnerClassExample.PubInnerClassExampleInner;

public class PubInnerClassExampleMain {

	public static void main(String[] args) {
		PubInnerClassExampleInner obj = new PubInnerClassExample()
				.new PubInnerClassExampleInner();
		obj.setId(1111);
		System.out.println("id: " + obj.getId()); 
		
	}
}
