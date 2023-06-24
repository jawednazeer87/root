package org.student.three.naushad.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bird {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String color;
	private double weight;
	private double height;
	private String canFly;
	private String canSwim;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getCanFly() {
		return canFly;
	}

	public void setCanFly(String canFly) {
		this.canFly = canFly;
	}

	public String getCanSwim() {
		return canSwim;
	}

	public void setCanSwim(String canSwim) {
		this.canSwim = canSwim;
	}

	@Override
	public String toString() {
		return "Bird [id=" + id + ", name=" + name + ", color=" + color + ", weight=" + weight + ", height=" + height
				+ ", canFly=" + canFly + ", canSwim=" + canSwim + "]";
	}

}