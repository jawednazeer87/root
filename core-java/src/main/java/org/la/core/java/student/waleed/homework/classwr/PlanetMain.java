package org.la.core.java.student.waleed.homework.classwr;

import org.la.core.java.student.waleed.homework.classwr.model.ChildPlanet1;
import org.la.core.java.student.waleed.homework.classwr.model.ChildPlanet2;
import org.la.core.java.student.waleed.homework.classwr.model.Planet;

/**
 * @author Waleed Rizq
 *
 * @date Feb 12, 2022
 */
public class PlanetMain {

	
	public static void main(String[] args) {
      
		Planet planet = new ChildPlanet1();
		 planet.name();
		 planet.distance();
         planet= new ChildPlanet2();
         planet.name();
		 planet.distance();
	}

}
