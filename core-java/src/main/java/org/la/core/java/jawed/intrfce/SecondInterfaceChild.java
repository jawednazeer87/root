/**
 * 
 */
package org.la.core.java.jawed.intrfce;

/**
 * @author jawednazeer
 *
 */
public class SecondInterfaceChild implements SecondInterface{

	@Override
	public void table(int n) {
		System.out.println("table: "+n);
	}
	
	@Override
	public void display() {
		System.out.println("Display method");
	}
	
	@Override
	public int prime(int n) {
		return 0;
	}
}
