package org.jn.core.java.jawed.clss.one;

import java.util.Date;
import org.jn.core.java.jawed.clss.Car;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car();
		car.setter(123, "naza", new Date());
		car.print();
//		car.number = 44;
		Car car2 = new Car();
		car2.setter(9099, "honda", new Date());
		car2.print();
	}
}
