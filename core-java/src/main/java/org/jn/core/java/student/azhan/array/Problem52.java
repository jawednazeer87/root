package org.jn.core.java.student.azhan.array;

public class Problem52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,7,2,5,6,1,8};
		int sum=0, f=0;
		for(int x:arr)
			sum=sum+x;
		for(int i=2; i<=sum/2; i++)
			if(sum%i==0)
			{
				f=1;
				break;
			}
		if(f==1 || sum==1)
			System.out.println("Sum = "+sum+" is not a prime number");
		else
			System.out.println("Sum = "+sum+" is a prime number");
		
	}

}
