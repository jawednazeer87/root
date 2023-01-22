package org.jn.core.java.student.mirza.baig.method;

public class PercentofMarks {
	 public static double percent(double mark1, double mark2, double mark3, double mark4, double mark5) {
		 
		 
		 double total= mark1+mark2+mark3+mark4+mark5;
		 
		 double percent=(total/500)*100;
		 
		 System.out.println(percent);
		 
		 return percent;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		percent(85.2,75.5,62.5,66.6,55.5);
	} 

}
