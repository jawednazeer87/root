package org.jn.core.java.jawed.design.pattern;

public class BuilderDesignPattern {

	private int id;
	private int roll;
	private String name;
	private String email;
	private double weight;
	private double height;
	private char gender;
	
	private BuilderDesignPattern(int id, int roll, String name, String email, 
			double weight, double height, char gender) {
		this.id = id;
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.weight = weight;
		this.height = height;
		this.gender = gender;
	}
	
	public static class Builder {
		
		private int id;
		private int roll;
		private String name;
		private String email;
		private double weight;
		private double height;
		private char gender;
		
		public Builder(int id) {
			this.id = id;
		}
		
		public int getId() {
			return id;
		}
		public Builder setId(int id) {
			this.id = id;
			return this;
		}
		public int getRoll() {
			return roll;
		}
		public Builder setRoll(int roll) {
			this.roll = roll;
			return this;
		}
		public String getName() {
			return name;
		}
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		public String getEmail() {
			return email;
		}
		public Builder setEmail(String email) {
			this.email = email;
			return this;
		}
		public double getWeight() {
			return weight;
		}
		public Builder setWeight(double weight) {
			this.weight = weight;
			return this;
		}
		public double getHeight() {
			return height;
		}
		public Builder setHeight(double height) {
			this.height = height;
			return this;
		}
		public char getGender() {
			return gender;
		}
		public Builder setGender(char gender) {
			this.gender = gender;
			return this;
		}
		public BuilderDesignPattern build() {
			return new BuilderDesignPattern(this.id, this.roll, this.name, this.email
					, this.weight, this.height, this.gender);
		}
	}

	@Override
	public String toString() {
		return "BuilderDesignPattern [id=" + id + ", roll=" + roll + ", name=" + name + ", email=" + email + ", weight="
				+ weight + ", height=" + height + ", gender=" + gender + "]";
	}
	
}
