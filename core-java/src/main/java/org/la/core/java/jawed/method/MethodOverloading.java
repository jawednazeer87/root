/**
 * 
 */
package org.la.core.java.jawed.method;

/**
 * @author jawednazeer
 *
 */
public class MethodOverloading {

	public static void main(String[] args) {
		
		int sum = sum(1, 2);
		System.out.println("sum: "+sum);
		sum = sum(1, 2, 3);
		System.out.println("sum: "+sum);
		sum = sum("name");
		System.out.println("sum: "+sum);
		double d = sum(1, 2.0);
		System.out.println("sum: "+d);
	}

	/**
	 * @param i
	 * @param d
	 * @return
	 */
	private static double sum(int i, double d) {
		return i+d;
	}

	/**
	 * @param string
	 * @return
	 */
	private static int sum(String string) {
		return string.length();
	}

	/**
	 * @param i
	 * @param j
	 * @param k
	 * @return
	 */
	private static int sum(int i, int j, int k) {
		return i+j+k;
	}

	/**
	 * @param i
	 * @param j
	 * @return
	 */
	private static int sum(int i, int j) {
		return i+j;
	}
	
	
}
