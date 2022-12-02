package org.jn.core.java.student.azhan.array;

public class Problem22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,1,5,2,9,13,10,8,7};
		int fact,num;
		for(int i=0; i<arr.length; i++)
		{
			fact = 1;
			num = arr[i];
			while(num>0)
			{
				fact = fact * num;
				num--;
			}
			System.out.println("Factorial of arr["+i+"] i.e. "+arr[i]+" = "+fact);
				
		}
	}

}
