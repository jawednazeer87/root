package org.la.core.java.student.arfaz.assignment_9this;

public class Fibonac {
	private int a;

	public void seta(int a) {
		this.a=a;
	}
	public int geta() {
		return a;
	}
	
	
	public void fibonacci() {
		int k=0,j=1,fibon;
		System.out.print(" "+k+" "+j);
		  	for( int i=2;i<=a;i++) {
		  		fibon = k+j;
		  		k=j;
		  		j=fibon;
				System.out.print(" "+fibon);

		  	}
		  	
	}
}