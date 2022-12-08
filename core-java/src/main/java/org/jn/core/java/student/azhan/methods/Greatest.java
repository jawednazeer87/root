package org.jn.core.java.student.azhan.methods;

public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,5,1,10};
		int s = greatest(arr);
		System.out.println("Greatest = "+s);
	}
	
	static int greatest(int arr[])
	{
		int gr=arr[0];
		for(int x:arr)
			if(x>gr)
				gr=x;
		return gr;
	}

}
