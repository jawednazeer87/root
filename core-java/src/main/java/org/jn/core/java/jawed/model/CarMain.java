package org.jn.core.java.jawed.model;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car();
		car.engine = "small engine";
		car.numDoors = 4;
		car.numWheels = 4;
		car.display();
		car.print();
		car.message();
	}
}