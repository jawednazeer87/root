package org.jn.core.java.student.Sahil;

public class InnerClassSimple {
private Integer id;


public Integer getid() {
	return id;
}
 public void Setid(Integer id) {
	 this.id=id;
	  }
 public void display() {
	 System.out.println(id);
 }
   public class InnerSimple{
	private String name;
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
		}
	public void display() {
		System.out.println(name);
	}
}
 
}
