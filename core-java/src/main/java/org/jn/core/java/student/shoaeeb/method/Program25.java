package org.jn.core.java.student.shoaeeb.method;

public class Program25 {

	static int [] countOneZero(int arr[])
	{
		int c[] = new int[2];
		int countOne=0;
		int countZero=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==0)
				countZero++;
			if(arr[i]==1)
				countOne++;
		}
		c[0]=countZero;
		c[1]=countOne;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,1,0,0,1,1};
		int count[] = countOneZero(arr);
		
		for(int i=0; i<count.length; i++)
		{
			System.out.println(count[i]);
		}
	}

}
