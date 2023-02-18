package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program31 {
	//count one and zeroes 
	static int[] countOneZero(int arr[])
	{
		int pair[]  = new int[2];
		int countZero=0;
		int countOne=0;
		for(int ele: arr)
		{
			if(ele==0)
			{
				countZero++;
			}
			if(ele==1)
			{
				countOne++;
			}
		}
		pair[0]=countZero;
		pair[1]=countOne;
		return pair;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,5,1,0,1,0,3,1,5,6};
		int[] pair  = Program31.countOneZero(arr);
		System.out.println("zeroes: "+pair[0]);
		System.out.println("Ones: "+pair[1]);
	}

}
