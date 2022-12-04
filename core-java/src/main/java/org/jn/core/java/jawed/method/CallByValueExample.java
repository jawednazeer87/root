/**
 * 
 */
package org.jn.core.java.jawed.method;

/**
 * @author jawednazeer
 *
 */
public class CallByValueExample {

	public static void main(String[] args) {
		int x=4, y=3;
		System.out.println("before method call - x: "+x+"  y: "+y);
		changeValue(x, y);
		System.out.println("after  method call - x: "+x+"  y: "+y);
	}
	static void changeValue(int a, int b) {
		System.out.println("inside method changevalue - a: "+a+"  b: "+b);
		a = 30;
		b = 40;
		System.out.println("inside method changevalue after - a: "+a+"  b: "+b);
	}
}
