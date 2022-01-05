package org.la.core.java.student.sajid.array;

public class Q24 {
	public static void main(String[] args) {
		int a[]= {1,2,2,3,6,6,4,4,5,8,4,9};
		int tmp[]=new int[a.length];
		int j=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				tmp[j]=a[i];
				j++;
			}
			tmp[j]=a[a.length-1];
		}
		for(int k=0;k<tmp.length;k++) 
		{
			System.out.print(tmp[k]+" ");
		}
	}

}
