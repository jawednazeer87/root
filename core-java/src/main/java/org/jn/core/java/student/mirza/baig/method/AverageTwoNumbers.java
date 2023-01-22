package org.jn.core.java.student.mirza.baig.method;

public class AverageTwoNumbers {
	
	public static double avg (double x, double y) {
		
		double sum, avg;
		
		sum=x+y;
		
		avg=sum/2;
		
		
		System.out.println("average of two number :" +avg);
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		avg(12.5,15.5);
	}

}
