package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program45 {
	static int[] booleanArrayToIntArray(boolean arr[])
	{
		int newArr[] =  new int[arr.length];
		int index=0;
		for(boolean bool: arr)
		{
			if(bool)
			{
				newArr[index++]=1;
			}
			else {
				newArr[index++]=0;
			}
			
		}
		return newArr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean arr[] = {true,false,true,true};
		int newArr[] = Program45.booleanArrayToIntArray(arr);
		for(int ele: newArr)
		{
			System.out.println(ele);
		}
	}

}
