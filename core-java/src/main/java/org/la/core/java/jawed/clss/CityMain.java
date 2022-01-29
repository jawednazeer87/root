package org.la.core.java.jawed.clss;

import org.la.core.java.jawed.model.City;

/**
 * @author jawednazeer
 *
 */
public class CityMain {

	public static void main(String[] args) {
		//City city = new City()	cannot use as we don't have default constructor
		City city = new City(1233, "dsfa");
		city.print();
	}
}
