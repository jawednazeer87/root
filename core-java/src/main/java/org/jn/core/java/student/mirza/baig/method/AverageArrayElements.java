package org.jn.core.java.student.mirza.baig.method;

public class AverageArrayElements {

	
	public static int avg(int []a) {
		
		int sum  =0;
		for (int i =0; i<a.length; i++)
			
		sum+=a[i];
		int avg=sum/a.length;
		
		System.out.println(avg);
		return avg;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int []a = {1,2,3,4,5,6,7,8,9,10,11};
		
		avg(a);
	}

}
