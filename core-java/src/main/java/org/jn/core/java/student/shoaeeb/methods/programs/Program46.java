package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program46 {
	//convert int array to boolean
	static int[] booleanToIntArray(boolean arr[])
	{
		int newArr[] = new int[arr.length];
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
		boolean arr[] = {true,false,false,false};
		int newArr[]  = Program46.booleanToIntArray(arr);
		for(int ele: newArr)
		{
			System.out.println(ele);
		}
	}

}
