package org.jn.core.java.jawed.model.dto;

public class MangoDTO {

	private String color;
	private String taste;
	private int weight;
	
	public MangoDTO() {}
	
	public MangoDTO(String color, String taste, int weight) {
		this.color = color;
		this.taste = taste;
		this.weight = weight;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "{color: " + color + ", taste: " + taste + ", weight: " + weight + "}"; 
	}
	
	@Override
	public boolean equals(Object that) {
		if (that == null) {
            return false;
        }
        if (that.getClass() != this.getClass()) {
            return false;
        }
        MangoDTO mangoDTO = (MangoDTO)that;
        if (mangoDTO.getColor()!=null && mangoDTO.getColor().equals(this.getColor())
        		&& mangoDTO.getTaste()!=null && mangoDTO.getTaste().equals(this.getTaste())
        		&& mangoDTO.getWeight()==this.getWeight()) {
        	return true;
        }
        return false;
	}
}
