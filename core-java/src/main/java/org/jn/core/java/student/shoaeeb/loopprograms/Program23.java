package org.jn.core.java.student.shoaeeb.loopprograms;
import java.util.Arrays;
public class Program23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	23) wap to count occurrences of each element in an array?
		int arr[]= {1,1,2,3,4,5,1,5,5,6};
		int size=arr.length;
		boolean visited[] = new boolean[arr.length];
		Arrays.fill(visited, false);
		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			if(visited[i]==true)
			{
				continue;
			}
			count=1;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					visited[j]=true;
				}
			}
			System.out.println(arr[i]+" "+count);
		}
	}

}
