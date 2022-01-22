package org.la.core.java.student.sajid.method.assignment6;

public class Wap20 {

	public static void main(String[] args) {
		// 20)	double percent(int, int, int, int, int)
		//suppose 5 arguments are marks in subjects, each subject is of 100 marks,
		//find percentage and return result
		
		int i=40,j=50,k=60,l=70,m=80;
		
		double perc = percent(i,j,k,l,m);
		System.out.println("Percentage: "+perc);
	}

	static double percent(int a,int b,int c,int d,int e) {		
	
		int totalMarks = a+b+c+d+e;
		
		double perc = totalMarks/5;
		return perc;
	}
}
