package org.jn.core.java.jawed.clss;

import org.jn.core.java.jawed.model.City;
import org.jn.core.java.jawed.model.Country;
import org.jn.core.java.jawed.model.State;

/**
 * @author jawednazeer
 *
 */
public class CountryMain {

	public static void main(String[] args) {
		
		City city = new City(78883, "Singapore");
		State state = new State(123, "kl", city);
		Country country = new Country();
		country.setName("Singapore");
		country.setPhoneCode("+65");
		country.setContient("Asia");
		country.setState(state);
		country.print();
	}
}
