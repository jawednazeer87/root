package org.jn.core.java.student.azhan.array;

public class Problem42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] = {'A','z','c'};
		for(int i=0; i<arr.length; i++)
		{
			if(Character.isLowerCase(arr[i]))
			{
				int n = arr[i];
				n = n - 97;
				arr[i] = (char)(65 + n);
			}
		}
		for(char x: arr)
			System.out.print(x+", ");
	}

}
