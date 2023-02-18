package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program43 {
	static float[] charToFloatArray(char c[])
	{
		float[]  arr = new float[c.length];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=c[i];
		}
		
		return arr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[] = {'4','2','4','5'};
		float arr[] = Program43.charToFloatArray(c);
		for(float ele:arr)
		{
			System.out.println(ele-'0');
		}
	}

}
