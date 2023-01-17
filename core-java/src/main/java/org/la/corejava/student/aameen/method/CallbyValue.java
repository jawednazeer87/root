package org.la.corejava.student.aameen.method;

public class CallbyValue {

	public static void main(String[] args) {
		// Call by value 
		
		int x = 12,y=13;
		System.out.println("before  x : "+x+"; y : "+y);
		changevalue(x,y);
		System.out.println("after x :"+x+ " ; y: "+y);
	}
	static void  changevalue(int a, int b)
	{
		System.out.println("before changeof value   a: "+a+"; b: "+b);
		a=13;b=12;
		System.out.println("After  changeof value   a: "+a+"; b: "+b);
	}

}
