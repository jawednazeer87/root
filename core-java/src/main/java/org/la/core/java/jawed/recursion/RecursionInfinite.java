package org.la.core.java.jawed.recursion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jawednazeer
 *
 */
public class RecursionInfinite {
	
	static Logger log = LoggerFactory.getLogger(RecursionInfinite.class);
	public static void main(String[] args) {
		int x = 5;
		print(x);
	}
	private static void print(int x) {
		System.out.println("x: "+x);
		log.info("x: {}", x);
		if(x>0) {
			print(--x);
		}
	}
}
