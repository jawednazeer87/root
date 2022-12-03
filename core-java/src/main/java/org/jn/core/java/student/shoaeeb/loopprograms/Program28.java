package org.jn.core.java.student.shoaeeb.loopprograms;
//	28) wap to remove a specific element from an array?

public class Program28 {

	public static void remove(int i,int arr[],int size)
	{
	    while(i<size-1)
	    {
	        arr[i]=arr[i+1];
	        i++;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		    int arr[]={1,2,3,4,5,6,7,8,9};
		    int size=arr.length;
		    int key=9;
		    int i=0;
		    for(i=0; i<size; i++)
		    {
		        if(arr[i]==key)
		        {
		            remove(i,arr,size);
		            break;
		        }
		    }
		    
		    for( i=0; i<size-1; i++)
		    {
		        System.out.print(arr[i]+" ");
		    }
		}
	

}
