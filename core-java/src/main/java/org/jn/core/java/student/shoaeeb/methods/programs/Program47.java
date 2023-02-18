package org.jn.core.java.student.shoaeeb.methods.programs;

public class Program47 {
	//convert double to float array
	static float[] doubleToFloat(double d[])
	{
		float newArr[] = new float[d.length];
		int index=0;
		for(double ele: d)
		{
			newArr[index++]=(float) ele;
		}
		return newArr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d[] = {1d,2d,3d};
		float arr[] = Program47.doubleToFloat(d);
		for(float ele: arr)
		{
			System.out.println(ele);
		}
	}

}
