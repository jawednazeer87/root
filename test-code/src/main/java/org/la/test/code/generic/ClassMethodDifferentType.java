package org.la.test.code.generic;

/*
 * If method having different types then class
 * it is allowed
 */
public class ClassMethodDifferentType<T> {

	public <F> void  noon(F i){
		System.out.println(i);
	}
}
