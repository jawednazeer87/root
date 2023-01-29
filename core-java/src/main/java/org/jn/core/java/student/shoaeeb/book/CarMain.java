package org.jn.core.java.student.shoaeeb.book;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c;//reference variable
		Maruti obj = new Maruti(996);
		c=obj;
		c.steering(5, 6);
		c.braking(5);
		c.getRegno();
		Santro car = new Santro(96656);
		c=car;
		c.steering(0, 0);
		c.braking(0);
		c.getRegno();

	}

}
