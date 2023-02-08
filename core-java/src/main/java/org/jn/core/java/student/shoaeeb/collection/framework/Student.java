package org.jn.core.java.student.shoaeeb.collection.framework;

public class Student {
	private int id;
	private String name;
	private float marks;
	public int getId() {
		return id;
	}
	Student() {};
	Student(int id,String name,float marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
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
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
