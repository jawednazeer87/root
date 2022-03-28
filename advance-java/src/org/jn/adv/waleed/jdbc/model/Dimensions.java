package org.jn.adv.waleed.jdbc.model;

/**
 * @author Waleed Rizq
 *
 * @date Mar 22, 2022
 */
public class Dimensions {
	private String id;
	private String dimensionValue;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDimensionValue() {
		return dimensionValue;
	}

	public void setDimensionValue(String dimensionValue) {
		this.dimensionValue = dimensionValue;
	}

	@Override
	public String toString() {
		return "Dimensions [id=" + id + ", dimensionValue=" + dimensionValue + "]";
	}
	
}
