package org.jn.core.java.student.shoaeeb.absclss;

public class ArrayOperationImpl extends ArrayOperation{

	@Override
	public int[] copy(int[] a) {
		// TODO Auto-generated method stub
		int b[] = new int[a.length];
		for(int i=0; i<a.length; i++)
		{
			b[i]=a[i];
		}
		return b;
	}

	@Override
	public int[] reverse(int[] b) {
		// TODO Auto-generated method stub
		for(int i=0; i<b.length/2; i++)
		{
			int temp=b[i];
			b[i]=b[b.length-1-i];
			b[b.length-1-i]=temp;
		}
		return b;
	}

	@Override
	public int[] addTwoArray(int[] p,int []v) {
		
		int []c = new int[p.length];
		for(int i=0; i<p.length; i++)
		{
			c[i]=p[i]+v[i];
		}
		
		return c;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
	}

	@Override
	public int sumArray(int[] a) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int ele:a)
		{
			sum+=ele;
		}
		return sum;
	}

	@Override
	public int findMax(int[] a) {
		// TODO Auto-generated method stub
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length; i++)
		{
			if(max>a[i])
			{
				max=a[i];
			}
		}
		return max;
	}

	@Override
	public int findMin(int[] a) {
		// TODO Auto-generated method stub
		
		return 0;
	}

	@Override
	public int countNegative(int[] a) {
		// TODO Auto-generated method stub

		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length; i++)
		{
			if(min<a[i])
			{
				min=a[i];
			}
		}
		return min;
		}

	@Override
	public int countPositive(int[] a) {
		// TODO Auto-generated method stub
		int count=0;
		for(int ele: a)
		{
			if(ele>0)
			{
				count++;
			}
		}
		return count;
	}

	@Override
	public int[] copyArray(int[] a, int[] b) {
		// TODO Auto-generated method stub
		int newArray[] = new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length; i++)
		{
			newArray[k++]=a[i];
		}
		for(int j=0; j<b.length; j++)
		{
			newArray[k++]=b[j];
		}
		return newArray;
	}

}
