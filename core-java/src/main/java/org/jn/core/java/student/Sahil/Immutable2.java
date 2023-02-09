package org.jn.core.java.student.Sahil;

public final class Immutable2 {

	private final int Roll;
	private final String Name;

	public 	Immutable2(int Roll , String Name) {
		this.Roll=Roll;
		this.Name=Name;
		
	}
	
	
	
	public int getroll() {
	
		return Roll;
	
	}
		public String getName() {
			return Name;
		}
		
		@Override
		public String toString() {
			return "Name : "+ Name + "  Roll :  "+Roll;
			
		}
}
	


