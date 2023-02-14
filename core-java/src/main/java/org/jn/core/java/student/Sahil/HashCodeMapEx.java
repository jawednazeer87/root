package org.jn.core.java.student.Sahil;

import java.util.Objects;

public class HashCodeMapEx {
private int id;
private String Name;

public int getid () {
	return id;
}
	public void setid(int id) {
	this.id=id;	
	}
	public String getName () {
		return Name;
	}
		public void setName(String Name) {
		this.Name=Name;	
		}
	
		public int hashcode() {
			return Objects.hash(id , Name);
			
		}

@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
	}
		if(obj == null || this.getClass() == obj.getClass());{
			return false;
		}
  	
	// 	HashCodeMapEx obj2 = (HashCodeMapEx) obj ;
		// return this.id = obj2.id  &&  this.Name.equals(obj2.Name);
		
}
}
