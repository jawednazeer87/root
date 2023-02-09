package org.jn.core.java.student.Sahil;

public class InnerStaticClass {
	
	public static class InnerStaticClassInner {
		private String Name;
		public String getname() {
			return Name;		
		}
		public void setname(String Name) {
			this.Name=Name;
			System.out.println(Name);
		}
	}
}
