package org.jn.core.java.student.shoaeeb.jdbc.dto;

import java.util.Date;

public class BirdDto {

	private int id;
	private String birdName;
	private Date dob;
	private boolean canFly;
	private float weight;
	private float height;
	private boolean canSwim;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBirdName() {
		return birdName;
	}
	public void setBirdName(String birdName) {
		this.birdName = birdName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public boolean isCanFly() {
		return canFly;
	}
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public boolean isCanSwim() {
		return canSwim;
	}
	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}
	@Override
	public String toString() {
		return "Bird [id=" + id + ", birdName=" + birdName + ", dob=" + dob + ", canFly=" + canFly + ", weight="
				+ weight + ", height=" + height + ", canSwim=" + canSwim + "]";
	}
	
}
