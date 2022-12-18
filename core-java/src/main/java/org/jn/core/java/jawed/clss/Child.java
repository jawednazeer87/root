/**
 * 
 */
package org.jn.core.java.jawed.clss;
/**
 * @author jawednazeer
 *
 */
public class Child extends Parent{

	@Override
	public void method() {
		System.out.println("child method");
	}
	public void other() {
		super.method();
	}
}
