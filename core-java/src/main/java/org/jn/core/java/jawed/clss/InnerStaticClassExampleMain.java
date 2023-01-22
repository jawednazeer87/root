package org.jn.core.java.jawed.clss;

import org.jn.core.java.jawed.clss.inner.InnerStaticClassExample;
import org.jn.core.java.jawed.clss.inner.InnerStaticClassExample.Builder;

public class InnerStaticClassExampleMain {

	public static void main(String[] args) {
		
		InnerStaticClassExample.Builder builder = new InnerStaticClassExample.Builder();
		Builder build = new InnerStaticClassExample.Builder();
		build.setWeight(3.33);
		System.out.println("weight: " + build.getWeight());
	}
}
