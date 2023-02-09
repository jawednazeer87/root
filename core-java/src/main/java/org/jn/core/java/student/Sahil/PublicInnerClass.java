package org.jn.core.java.student.Sahil;

public class PublicInnerClass {
	public class PublicInnerClassInner{
		private int  id ;
		private String name;
	public int getid() {
		return id;
		}
	public void setid(int id) {
		this.id=id;
		System.out.println(id);
	}
	public String getname() {
		return name;
	}	
	public void setname(String name) {
		this.name=name;
		System.out.println(name);
	}	
	
	
	}
	
	
}
