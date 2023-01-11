package org.jn.core.java.student.shoaeeb.dsa;

public class BitManipulation {

	public static boolean getBit(int n,int pos)
	{ 
		return ((n & (1<<pos))!=0);
	}
	public static int setBit(int n,int pos)
	{
		return (n | (1<<pos));
		
	}
	public static int clearBit(int n,int pos)
	{
		int mask = ~(1<<pos);
		return (n & mask);
	}
	
	public static int updateBit(int n,int pos,int value)
	{
		int mask = ~(1<<pos);
		n=n & mask;
		return (n | (value<<pos));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(getBit(5,2))
		{
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		System.out.println(setBit(5,1));
		System.out.println(clearBit(5,2));
	}

}
