package org.jn.core.java.student.azhan.array;

public class Problem41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] = {'A','Z','c'};
		for(int i=0; i<arr.length; i++)
		{
			if(Character.isUpperCase(arr[i]))
			{
				int n = arr[i];
				n = n - 65;
				arr[i] = (char)(97 + n);
			}
		}
		for(char x: arr)
			System.out.print(x+", ");
	}

}
