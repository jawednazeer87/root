package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program42 {

	static String floatArrayToString(float arr[])
	{
		String s="";
		for(int i=0; i<arr.length; i++)
		{
			s+=arr[i];
		}
		return s;
	}
	static float[] stringToFloatArray(String s)
	{
		float newArr[] = new float[s.length()];
		for(int i=0; i<s.length(); i++)
		{
			newArr[i]=s.charAt(i)-'0';
		}
		return newArr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float arr[] = Program42.stringToFloatArray("20.45");
		for(float ele: arr)
		{
			System.out.println(ele);
		}
		String s = Program42.floatArrayToString(arr);
		System.out.println(s);
	}

}
