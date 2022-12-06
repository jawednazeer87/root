package org.jn.core.java.student.azhan.array;

public class Problem54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] =  {'a', '5', '7', 'Z'};
		for(int x:arr)
			if(x=='Z')
			{
				System.out.println("this array has 'Z'");
				return;
			}
		System.out.println("this array doesn't have 'Z'");
	}

}
