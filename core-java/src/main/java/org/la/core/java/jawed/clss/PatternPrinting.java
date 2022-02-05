/**
 * 
 */
package org.la.core.java.jawed.clss;

/**
 * @author jawednazeer
 *
 */
public class PatternPrinting {

	public void increaseStar(int n) {
		for(int j=1 ; j<=n ; j++) {
			for(int y=1; y<=j ; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void decreaseStar(int n) {
		for(int j=1 ; j<=n ; j++) {
			for(int y=1; y<=j ; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void decreaseStarRight(int n) {
		//TODO 
		//logic for decreasing star from right side
	}
	
	public void increaseStarRight(int n) {
		//TODO 
		//logic for increasing star from right side
	}
	
}
