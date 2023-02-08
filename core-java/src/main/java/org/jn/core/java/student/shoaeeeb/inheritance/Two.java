package org.jn.core.java.student.shoaeeeb.inheritance;

public class Two extends One{
	int i;
	Two(int a,int b){
		super(a);
		i=b;
	}
	void show() {
		super.show();
		System.out.println("Sub class i: "+i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two t = new Two(2,4);
		t.show();
	}

}
