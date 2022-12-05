package org.jn.core.java.student.azhan.array;

public class Problem35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,7,3,325,53};
		int f1=0,f2=0;
		for(int z: arr)
		{
			if(z==0)
				f1=1;
			else if(z==-1)
				f2=1;
		}
		if(f1==1 && f2==1)
			System.out.println("Array contains both '0' and '-1' integers");
		else if(f1==1)
			System.out.println("Array contain integer '0'");
		else if(f2==1)
			System.out.println("Array contain integer '-1'");
		else
			System.out.println("Array does not contains both '0' and '-1' integers");
	}

}
