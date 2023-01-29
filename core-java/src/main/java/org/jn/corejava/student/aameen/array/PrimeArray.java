package org.jn.corejava.student.aameen.array;

public class PrimeArray {

	public static void main(String[] args) {
		// Find the prime array in index of array 
		
		int n[]= {4,53,98,44,11,61};
		for(int k=0;k<n.length;k++)
		{
			int i ;
			for(i=2;i<n[k];i++)
			{
				if(n[k]%i==0)
				{
					break;
				}
			}
			if(n[k]==i)
				System.out.println(n[k]);
		}

	}

}
