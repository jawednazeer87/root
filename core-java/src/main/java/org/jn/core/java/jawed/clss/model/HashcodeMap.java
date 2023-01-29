package org.jn.core.java.jawed.clss.model;

import java.util.Objects;

public class HashcodeMap {
	
	private int id;
	private String name;
	
	public HashcodeMap(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
        if (that == null || this.getClass() != that.getClass()){
               return false;
        }
        HashcodeMap other = (HashcodeMap) that;
		return this.id == other.id && this.name.equals(other.name);
	}
	@Override
	public String toString() {
		return "{id: " + id + ", name: " + name + "}";
	}
	
}
