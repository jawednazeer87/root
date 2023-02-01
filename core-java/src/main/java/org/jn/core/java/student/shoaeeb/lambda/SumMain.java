package org.jn.core.java.student.shoaeeb.lambda;

public class SumMain{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumInterface sum = (a,b)-> {return a+b;};
		SumMain.display(sum,10,20);
		
	}
	
	static void display(SumInterface sum,int a,int b)
	{
		System.out.println(sum.add(a, b));
	}



}
