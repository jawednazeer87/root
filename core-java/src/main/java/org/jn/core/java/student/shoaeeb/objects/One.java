package org.jn.core.java.student.shoaeeb.objects;

public class One {
	 int x=5;
	 Two t;
	 
	 One(Two t)
	 {
		 this.t=t;
	 }
	 
	 void display() {
		 System.out.println("X:"+x);
		 t.display();
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two t =new Two();
		One o = new One(t);
		o.display();
	}

}
