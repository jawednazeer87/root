package org.jn.core.java.student.sayed.hassain.collection;

public class Student implements Comparable<Student>  {

	private int id;
	private String name;
	
	Student() {};
	Student(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	//setters
	void setId(int id)
	{
		this.id=id;
	}
	void setName(String name)
	{
		this.name=name;
	}
	
	int getId() {
		return id;
	}
	String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]\n";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(id>o.getId())
		{
			return 1;
		}
		if(id==o.getId())
		{
			return 0;
		}
		return -1;
	}
	
	
	}
	
	

