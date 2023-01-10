package org.jn.core.java.jawed.intrfc;

public interface PrintOne {

	default void print() {
		System.out.println("PrintOne");
	}
}
