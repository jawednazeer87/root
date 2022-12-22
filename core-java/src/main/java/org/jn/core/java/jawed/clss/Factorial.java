/**
 * 
 */
package org.jn.core.java.jawed.clss;
/**
 * @author jawednazeer
 *
 */
public class Factorial {

	private int num;
	public void setNum(int n) {
		num = n;
	}
	public int getNum() {
		return num;
	}
	public int factorial() {
		int f = 1;
		while(num>1) {
			f = f * num;
			num--;
		}
		return f;
	}
}
