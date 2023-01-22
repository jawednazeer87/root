package org.jn.core.java.jawed.immutable;

import java.math.BigDecimal;

import org.jn.core.java.jawed.model.Mango;

public final class ImmutableStudent {

	private final int roll;
	private final String name;
	private final String standard;
	private final Mango mango;
	private final BigDecimal bd;
	
	public ImmutableStudent(int roll, String name, String standard, Mango mango
								, BigDecimal bd) {
		this.roll = roll;
		this.name = name;
		this.standard = standard;
		this.mango = mango;
		this.bd = bd;
	}
	
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public String getStandard() {
		return standard;
	}
	public Mango getMango() {
		return new Mango(this.mango.getTaste(), this.mango.getColor()
									, this.mango.getWeight());
	}
	public BigDecimal getDB() {
		return new BigDecimal(bd.toString());
	}
	@Override
	public String toString() {
		return "{roll: " + roll + ", name: " + name + ", standard: " + standard 
				+ ", mango: " + mango + ", bd: " + bd + "}";
	}	
}
