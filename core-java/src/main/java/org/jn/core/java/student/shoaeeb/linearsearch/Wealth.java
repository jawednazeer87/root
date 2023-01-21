package org.jn.core.java.student.shoaeeb.linearsearch;

import java.util.ArrayList;
import java.util.List;

public class Wealth {

	public static void main(String[] args) {
		int arr[][] = {
		    {1,2,3},
		    {4,5,6}
		};
		
		System.out.println(wealth(arr));
	}
	
	static int wealth(int arr[][])
	{
	    List<Integer> list = new ArrayList<>();
	    int sum=0;
	    for(int i=0; i<arr.length; i++)
	    {
	        for(int j=0; j<arr[i].length; j++)
	        {
	            sum+=arr[i][j];
	            
	        }
	        list.add(sum);
	        sum=0;
	    }
	    int max=Integer.MIN_VALUE;
	    for(int i=0; i<list.size(); i++)
	    {
	       if(max<list.get(i))
	       {
	           max=list.get(i);
	       }
	    }
	    return max;
	}

}
