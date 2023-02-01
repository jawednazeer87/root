package org.jn.core.java.student.shoaeeb.generics;

public class GenericProgram1<T>{

	T x;
	GenericProgram1(T x)
	{
		this.x =x;
	}
	
	T getObj() {
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=12;
		GenericProgram1<Integer> gp =  new GenericProgram1<>(i);
		System.out.println(gp.getObj());
		float f=12f;
		GenericProgram1<Float> gp1 =  new GenericProgram1<>(f);
		System.out.println(gp1.getObj());
		double d = 12d;
		GenericProgram1<Double> gp2 =  new GenericProgram1<>(d);
		System.out.println(gp2.getObj());


		
	}

}
