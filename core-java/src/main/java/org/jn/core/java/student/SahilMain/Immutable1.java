package org.jn.core.java.student.SahilMain;

public final class Immutable1 {
private final int id;
private final String Name;

public Immutable1(int id , String Name) {
	this.id=id;
	this.Name=Name;
	
}

public int getid() {
	return id;
}

public String setName() {
	return Name;
	
} 
public String toString() {
	return "Name : "+ Name  + "  id :  "+id;
	
}
}
