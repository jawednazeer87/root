package org.jn.core.java.student.shoaeeb.dsa;

public class MergeSort {
	//time complexity = nlogn
	 
	public static void merge(int arr[],int l,int mid,int r)
	{
		int n1= mid-l+1;
		int n2=r-mid;
		
		//temp arrays
		int a[] = new int[n1];
		int b[] = new int[n2];
		
		for(int i=0; i<n1; i++)
		{
			a[i]=arr[l+i];
		}
		for(int i=0; i<n2; i++)
		{
			b[i]=arr[mid+1+i];
		}
		
		int i=0,j=0,k=l;
		
		 while(i<n1 && j<n2)
		    {
		        if(a[i]<b[j])
		        {
		            arr[k]=a[i];
		            k++;
		            i++;
		        }
		        else {
		            arr[k]=b[j];
		            k++;
		            j++;
		        }
		    }
		    
		    while(i<n1)
		    {
		        arr[k]=a[i];
		        k++;
		        i++;
		    }
		    while(j<n2)
		    {
		        arr[k]=b[j];
		        k++;
		        j++;
		    }
	}
	public static void mergeSort(int arr[],int l,int r)
	{
		if(l<r)
		{
			int mid=(l+r)/2;
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,r);
			
			merge(arr,l,mid,r);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]={5,4,3,2,1};
		 mergeSort(arr,0,arr.length-1);
		 PrintArray pr = new PrintArray();
		 pr.printArray(arr, arr.length);
		 
	}

}
