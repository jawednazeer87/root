/**
 * 
 */
package org.la.core.java.jawed.abstrct.man;

import org.la.core.java.jawed.abstrct.Car;
import org.la.core.java.jawed.abstrct.Vehicle;

/**
 * @author jawednazeer
 */
public class VehicleMain {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Car();
		vehicle.display();
		int prod = vehicle.product(2,  3);
		System.out.println("prod: "+prod);
	}
}
